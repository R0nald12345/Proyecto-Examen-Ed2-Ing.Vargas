/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEncadenadaSimple;

/**
 *
 * @author pumar
 */
public class Nodo {
     //atributos
    public int elem;
    public Nodo prox;
    
    //constructor
    public Nodo(int elem, Nodo prox){
        this.elem = elem;
        this.prox = prox;
    }
}
