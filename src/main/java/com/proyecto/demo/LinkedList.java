package com.proyecto.demo;

/**
 *
 * @author sergio.pena
 */
public class LinkedList {
    
    Nodo head = null;  
    Nodo Tail = null;
    
    public LinkedList() {
        head=null;
        Tail=null;
    }
    
    public int listSize(){
        Nodo temp=head;
        int respuesta=0;
        while(head!=null){
            respuesta+=1;
            head=head.getNext();
        }
        head=temp;
        return respuesta;
    }
    
    public  void addNode(int n){
        if (head==null){
            head=new Nodo(n);
        } else if (listSize()==1){
            head.setNext(new Nodo(n));
            Tail= head.getNext();
        } else{
            Tail.setNext(new Nodo(n));
            Tail=Tail.getNext();
        }
    }
    
    public void deleteNode(int valor){
        Nodo temp=head;
        Nodo flag=null;
        while (temp!=null){
            if (head.getValor()==valor || temp==head){
                head=temp.getNext();
            if (temp.getNext()==Tail || Tail.getValor()==valor){
                Tail=temp;
                temp.setNext(null);
            }
            if (temp.getNext().getValor()==valor){
                    flag=temp.getNext();
                    temp.setNext(flag.getNext());
                }
            }
        }
    }
    
    public float mean(){
        Nodo temp=head;
        int size=listSize();
        int respuesta=0;
        while(head!=null){
            respuesta+=head.getValor();
            head=head.getNext();
        }
        respuesta=respuesta/size;
        head=temp;
        return respuesta;
    }
    
    public float standardDeviation(float media){
        int size=listSize();
        int cont=1;
        float respuesta=0;
        while(cont<=size){
            respuesta+= (float)Math.pow(Math.abs((head.getValor()-media)),2);
            head=head.getNext();
            cont+=1;
        }
        respuesta=respuesta/(size-1);
        return (float)Math.sqrt(respuesta);
    }
    
    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return Tail;
    }
}
