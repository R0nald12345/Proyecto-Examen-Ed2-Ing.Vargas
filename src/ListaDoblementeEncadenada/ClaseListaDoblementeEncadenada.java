package ListaDoblementeEncadenada;

public class ClaseListaDoblementeEncadenada {

    public Nodo prim;
    public Nodo ult;
    public int cantElem;

    public ClaseListaDoblementeEncadenada() {
        prim = ult = null;
        this.cantElem = 0;
    }

    //1ro L1.existePar() : Método lógico que devuelve True, si la lista L1 contiene al menos un elemento par.
    public boolean existePar() {
        Nodo aux = prim;
        Boolean bandera = false;
        while (aux != null) {
            if (aux.elem % 2 == 0) {
                bandera = true;
                break;
            }
            aux = aux.prox;
        }
        return bandera;
    }

    // verifica si la lista esta vacia
    public Boolean vacia() {
        return ((prim == null) && (ult == null));
    }

    //2do  L1.iguales() : Método Lógico que devuelve True, si todos los elementos de la lista L1 son iguales.
    boolean iguales() {
        Boolean bandera = true;
        Nodo aux = prim;
        Nodo v = prim;
        while (aux != null) {
            if (aux.elem != v.elem) {
                bandera = false;
                break;
            }
            aux = aux.prox;
        }
        return bandera;
    }

    //3ro L1.reemplazar(x,y)Metodo que reemplaza todas las ocurrencias del elemento x por el elemento y en la lista L1 
    public void reemplazar(int x, int y) {
        Nodo p = prim;
        while (p != null) {
            if (p.elem == x) {
                p.elem = y;
            }
            p = p.prox;
        }
    }

    //4to L1.Frecuencia(x) Metodo que devuelve la cantidad de veces que aparece en el elemento x en la lista L1
    public int frecuencia(int x) {
        Nodo p = prim;
        int contador = 0;
        while (p != null) {
            if (p.elem == x) {
                contador++;
            }
            p = p.prox;
        }
        return contador;
    }

    //5to   L1.todoImpares() : Método lógico que devuelve True, si todos los elementos de la lista L1 son impares.
    public boolean todoImpares() {
        Nodo p = prim;
        boolean bandera = true;
        while (p != null) {
            if (p.elem % 2 == 0) {
                bandera = false;
                break;
            }
            p = p.prox;
        }
        return bandera;
    }

    //Elimina el Primer Nodo de una Lista
    public void eliminarPrim() {
        if (vacia()) {
            return;
        } else {
            if (this.cantElem == 1) {
                prim = ult = null;
            } else {
                Nodo p = prim;
                prim = prim.prox;
                p = null;
            }
            this.cantElem--;

        }
    }

    //Elimina el ultimo nodo de una lista
    public void eliminarUlt() {
        if (vacia()) {
            return;
        } else {
            if (this.cantElem == 1) {
                prim = ult = null;
            } else {
                Nodo p = prim;
                while (p.prox != null) {
                    p = p.prox;
                }
                ult = p;
                p.prox = null;
            }
            this.cantElem--;
        }
    }

    //Inserta el Nodo  al principio de la lista
    public void insertarPrim(int x) {
        if (vacia()) {
            Nodo nuevo = new Nodo(null, x, null);
            prim = ult = nuevo;
        } else {
            Nodo nuevo = new Nodo(null, x, null);
            nuevo.prox = prim;
            prim = nuevo;
        }
        this.cantElem++;
    }

    //inserta Nodo al final de la lista
    public void insertarUlt(int x) {
        if (vacia()) {
            Nodo nuevo = new Nodo(null, x, null);
            prim = ult = nuevo;
        } else {
            Nodo nuevo = new Nodo(ult, x, null); //////////////
            ult.prox = nuevo;
            ult = nuevo;
        }
        this.cantElem++;
    }

    //6to. L1.insertarIesimo(x, i) : Método que inserta el elemento x, en la posición i, de la lista L1.
    public void insertarDadoPosicion(int x, int i) {
        if (vacia()) {
            return;
        } else {
            int contador = 1;
            Nodo ant = null;
            Nodo p = prim;
            while (contador != i) {
                contador++;
                ant = p;
                p = p.prox;
            }
            if (contador == 1) {
                eliminarPrim();
            } else {
                if (contador == this.cantElem) {
                    eliminarUlt();
                } else {
                    Nodo nuevo = new Nodo(null, x, null);
                    ant.prox = nuevo;
                    nuevo.prox = p;
                    this.cantElem++;

                }
            }
        }
    }

//7mo L1.eliminarIesimo(i) : Método que elimina el i-ésimo elemento de la lista L1.
    public void eliminarDadoPosicion(int i) {
        if (vacia()) {
            return;
        } else {
            int contador = 1;
            Nodo ant = null;
            Nodo p = prim;
            while (contador != i) {
                contador++;
                ant = p;
                p = p.prox;
            }
            if (contador == 1) {
                eliminarPrim();
            } else {
                if (contador == this.cantElem) {
                    eliminarUlt();
                } else {
                    ant.prox = p.prox;
                    p.prox = null;
                    this.cantElem--;
                }
            }
        }

    }

    //adiciona una lista l2 en el lista l1 
    public void insertarLista2enL1(ClaseListaDoblementeEncadenada L2) {
        ult.prox = L2.prim;
        ult = L2.ult;
        this.cantElem = this.cantElem + L2.cantElem;
    }

    //muestra en un cadena la lista Simple Encadenada
    public String toString() {
        String s = "null-";
        Nodo aux = prim;
        while (aux != null) {
            s = s + aux.elem + ",";
            aux = aux.prox;
        }
        return s + "-Null";
    }


    public Nodo eliminarNodo(Nodo ap, Nodo p) {
        if (ap == null) {
            eliminarPrim();
            return prim;
        }
        if (p.prox == null) {
            eliminarUlt();
            return null;
        }
        ap.prox = p.prox;
        p.prox = ap;
        cantElem--;
        return ap.prox;
    }

    
    public void EliminarTodo(int x) {
        Nodo p = prim;
        Nodo ap = null;
         while (p != null) {
             if (p.elem == x) {
                p = eliminarNodo(ap, p);
            } else {
                ap = p;
                p = p.prox;
            }
         }
    }
        
    
    
 

    public static void main(String[] args) {


        ClaseListaDoblementeEncadenada l1 = new ClaseListaDoblementeEncadenada();
        l1.insertarUlt(4);
        l1.insertarUlt(5);
        l1.insertarUlt(9);
        l1.insertarUlt(7);
        l1.insertarUlt(9);
        l1.insertarUlt(9);

        System.out.println(l1.toString());

        System.out.println("1..");
        System.out.println("Exite almenos un Par: " + l1.existePar());

        System.out.println("2..");
        System.out.println("Verificar si todos son impares: " + l1.todoImpares());

        System.out.println("3..");
        l1.reemplazar(5, 100);
        System.out.println(l1.toString());

        System.out.println("4..");
        System.out.println("Frecuencia de Numero 9: " + l1.frecuencia(9));

        System.out.println("5..");
        l1.insertarDadoPosicion(1000, 3);
        System.out.println(l1.toString());

        System.out.println("6..");
        l1.eliminarDadoPosicion(3);
        System.out.println(l1.toString());

        System.out.println("7..");
        ClaseListaDoblementeEncadenada L2 = new ClaseListaDoblementeEncadenada();
        L2.insertarUlt(3);
        L2.insertarUlt(3);
        L2.insertarUlt(3);
        l1.insertarLista2enL1(L2);
        System.out.println(l1.toString());
        
        System.out.println("-------------------------------");

        ClaseListaDoblementeEncadenada L3 = new ClaseListaDoblementeEncadenada();
        L3.insertarUlt(2);
        L3.insertarUlt(3);
        L3.insertarUlt(2);
        L3.insertarUlt(10);
        L3.insertarUlt(5);
        L3.insertarUlt(2);
        L3.insertarUlt(8);

        System.out.println(L3.toString());
        L3.EliminarTodo(2);
        System.out.println(L3.toString());
    }

}
