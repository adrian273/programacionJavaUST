
package ejemplohilo;

/**
 * java.lang
 * @author adrian
 */
public class EjemploHilo extends Thread {
    
    public EjemploHilo(String str) {
        super(str);
    }
    
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println(i + " " + getName());
        System.out.println("Termino el hilo " + getName());
    }
    
    public static void main(String[] args) {
        new EjemploHilo("Adrian").start();
        new EjemploHilo("Sebastian").start();
        System.out.println("Terminacion del main multihilo");
    }
    
}
