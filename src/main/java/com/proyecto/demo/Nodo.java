package com.proyecto.demo;

/**
 *
 * @author sergio.pena
 */
public class Nodo<V> {
    private Nodo<V> sig;
    private V valor;
    
    /**
     * Constructor para los nodos que formas parte de la lista
     * 
     * @param valor numero que va a tener esa posicion de la lista
     * @param sig siguiente nodo en la lista, si es nulo este es el ultimo elemento
     */
    public Nodo(V valor, Nodo<V> sig) {
        this.valor = valor;
        this.sig = sig;
    }
    
    public V getValor() {
        return valor;
    }
    
    public Nodo<V> getSiguiente() {
        return sig;
    }
    
    public void setSiguiente(Nodo<V> nodo) {
        this.sig = nodo;
    }
}
