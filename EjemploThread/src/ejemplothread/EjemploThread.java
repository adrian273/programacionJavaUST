package ejemplothread;

/**
 * @author adrian
 */
public class EjemploThread extends Thread {
    
    public EjemploThread(String str) {
        super(str);
    }
    
    public void run() {
        for(int i = 0; i < 10; i++)
              System.out.println(i  + " " + getName());
        System.out.println("Termina hilo " + getName());
    }
    
    public static void main(String [] ar) {
        new EjemploThread("Pepe").start();
        new EjemploThread("Pedro").start();
        System.out.println("Termina el proceso main Thread");
    }
    
}
