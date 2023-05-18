/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaVector;

/**
 *
 * @author pumar
 */
public class VectorLista {

    //atributos
    public static final int MAX = 50; //Constante
    public int vector[];
    public int cant;

    //constructor
    public VectorLista() {
        this.cant = 0;
        vector = new int[MAX];
    }

    public void insertarFinal(int x) {
        this.cant++;
        vector[cant] = x;
    }

    //Verificar si almenos hay un solo Numero par
    public boolean verificarUnPar() {
        boolean bandera = false;
        for (int i = 1; i <= this.cant; i++) {
            if (vector[i] % 2 == 0) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    //Verificar si todos los elementos son Impar
    public boolean verificarTodosImpar() {
        boolean bandera = true;
        for (int i = 1; i <= this.cant; i++) {
            if (vector[i] % 2 == 0) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }

    //Intercambiar los Eelementos y por elemento x
    public void interacambiarElementoPorOtro(int x, int y) {
        for (int i = 1; i <= 10; i++) {
            if (vector[i] == x) {
                vector[i] = y;
            }
        }
    }

    public int frecuenciaNumero(int x) {
        int contador = 0;
        for (int i = 1; i <= this.cant; i++) {
            if (vector[i] == x) {
                contador++;
            }
        }
        return contador;
    }

    public void insertarDadoPosicion(int x, int i) {
        this.cant++;
        for (int j = this.cant; j >= i+1; j--) {
            vector[j] = vector[j - 1];
        }
       vector[i] = x;
    }

    public void eliminarDadoPosicion(int i) {
        for (int j = i; j <= this.cant - 1; j++) {
            vector[j] = vector[j + 1];
        }
        this.cant--;
    }

    public String toString() {
        String s = "[";
        for (int i = 1; i <= this.cant; i++) {
            s = s + vector[i] + ", ";
        }
        return s + "]";
    }
    
    public int obtenerElementoDadoPosicion(int i){
        return vector[i];
    }
    
    public void insertarOtroVectorEnV1(VectorLista v2){
        for (int i = 1; i <= v2.cant; i++) {
            insertarFinal(v2.obtenerElementoDadoPosicion(i));
        }
    }

    public static void main(String[] args) {
        VectorLista vl = new VectorLista();
        vl.insertarFinal(4);
        vl.insertarFinal(5);
        vl.insertarFinal(9);
        vl.insertarFinal(7);
        vl.insertarFinal(9);
        vl.insertarFinal(9);
        
        System.out.println(vl.toString());

        //1ro
        System.out.println("--- 1ro --");
        System.out.println("Verificar si existe almenos un Par: " + vl.verificarUnPar());

        //2do
        System.out.println("--- 2do --");
        System.out.println("Verificar si todos son Impares: "+vl.verificarTodosImpar());
        
        //3ro
        System.out.println("--- 3ro --");
        vl.interacambiarElementoPorOtro(5,100);
        System.out.println(vl.toString());
        
        //4to
        System.out.println("--- 4to --");
        System.out.println("Verificar Frecuencia de 9: "+vl.frecuenciaNumero(9));
        
        //5to
        System.out.println("--- 5to --");
        vl.insertarDadoPosicion(1000, 3);
        System.out.println(vl.toString());
        
        //6to
        System.out.println("--- 6to --");
        vl.eliminarDadoPosicion(3);
        System.out.println(vl.toString());
        
        //7mo
        VectorLista l2 = new VectorLista();
        l2.insertarFinal(0);
        l2.insertarFinal(0);
        l2.insertarFinal(0);
        System.out.println("--- 7mo --");
        vl.insertarOtroVectorEnV1(l2);
        System.out.println(vl.toString());
        

    }

}
