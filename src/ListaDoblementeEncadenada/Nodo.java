/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoblementeEncadenada;

/**
 *
 * @author pumar
 */
public class Nodo {
    //atributos

    public Nodo ant;
    public Nodo prox;
    public int elem;

    //Constructor
    public Nodo(Nodo ant, int elem, Nodo prox) {
        this.ant = ant;
        this.elem = elem;
        this.prox = prox;
    }
}
