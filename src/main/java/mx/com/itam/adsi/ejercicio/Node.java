package mx.com.itam.adsi.ejercicio;

import org.apache.log4j.Logger;

/**
 *Clase Nodo
 *
 *Liga Nodos para crear una estructura de lista
 *@author Luis Felipe Landa Lizarralde 158228
*/

public class Node {
    /**
     *registra los métodos de la clase
    */
    private final static Logger LOG = Logger.getLogger(Node.class);

    /**
     *información que guarda el nodo
    */
    private String data;

    /**
     *siguiente nodo ligado
    */
    private Node next;

    /**
     *Constructor que guarda data en el Nodo
    */
    public Node(String data){
        this.data = data;
    }

    /**
     *Invierte la lista y regresa el último nodo
     *
     *No regresa nada
    */
    public Node gus(){
	if(next == null)
	   return this;
	Node otro = next;
	next = null;
	Node tavo = otro.gus();
	otro.next = this;
	return tavo;
    }

    /**
     *Imprime en la consola la secuencia de Nodos que
     *componen a esta lista. Por ejemplo, para la lista
     *que devuelve el método "build", la invocación de
     *este método escribe en la consola:
     *
     * A-->B-->C-->D-->E-->F-->
     *
     *Lo anterior sería lo que se visualiza en la consola
     *justo después de ejecutar las siguientes dos líneas:
     *   Node a = build();
     *   a.prn();
     *
     */
    public void prn(){
	Node imprime = this;
        do{
	  System.out.print(imprime.data + "-->");
	}while(imprime.next != null)
    }
}
