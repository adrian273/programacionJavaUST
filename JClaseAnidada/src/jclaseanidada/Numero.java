
package jclaseanidada;

/**
 *
 * @author 
 * Catalina Nuñez
 * Adrian Verdugo
 * @descripcion
 * Una clase anidada es una clase dentro de otra.
 * 
 */
public class Numero {
    private int valor =34;
    
    public void metodo(){
        // esta es la  clase que se anidada
        class Flotante{
            public void mostrar(){
                System.out.println(valor);
            }
            
        }
        
        // SE crea la instancia de la clase que se anido
        Flotante f = new Flotante();
        f.mostrar();
    }
    
}
