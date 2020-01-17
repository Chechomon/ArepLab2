package com.proyecto.demo;

/**
 *
 * @author sergio.pena
 */
public class Nodo {
    int valor;
    Nodo next=null;
    
    public Nodo(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    
    public Nodo getNext() {
        return next;
    }
    
    public void setNext(Nodo next) {
        this.next = next;
    }
}
