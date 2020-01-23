package com.proyecto.demo;

/**
 *
 * @author sergio.pena
 */
public class LinkedList<V> {
    
    private Cabeza<V> cab;
    private int tam;

    public LinkedList() {
        cab = new Cabeza<V>(null, null);
    }

    /**
     * Metodo que agrega un nuevo nodo a la lista
     * @param valor valor del nodo que se va a agregar
     */
    public void add(V valor) {
        Nodo<V> node = new Nodo<V>(valor, null);
        if (cab.getPrimero() == null)
            cab.setPrimero(node);
        else {
            Nodo<V> pointer = cab.getPrimero();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(node);
        }
        tam++;
        cab.setUltimo(node);

    }
    
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Nodo<V> pointer = cab.getPrimero();
        while (pointer != null) {
            stringBuilder.append(pointer.getValor()).append(" ");
            pointer = pointer.getSiguiente();
        }
        return stringBuilder.toString().trim();

    }

    public Nodo<V> getPrimero(){
        return cab.getPrimero();
    }
    
    public int  getTamano(){
        return tam;
    }
}
