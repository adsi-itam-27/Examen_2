package mx.com.itam.adsi.ejercicio;

import org.apache.log4j.Logger; 
	 

/**
 *Clase Solucion
 *
 *
*/


public class Solucion {    
    /**
     * COMENTARIO INCORRECTO:
     * 
     * Crea una lista de 6 Nodos que almacena las letras de la A a la F.
     * 
     * 
     * @return Node Regresa el primero que se creó.
     */
    private Node build() {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    public static void main(String...argv) {
        new Solucion().ok();
    }

}
