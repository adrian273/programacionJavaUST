package jenum;

import java.util.Scanner;

/**
 *
 * @author
 * Catalina Nuñez
 * Adrian Verdugo
 * 
 */
public class JEnum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa Valor para verificar si existe");
        
        // toUpperCase -> para que el valor ingresado este en mayuscula
        String fruta2 = input.next().toUpperCase();
        Boolean msg = false;

        try {
                /**
                    * Se recorre El enumerador fruit y verfica si existe al ingresar el
                    * texto a verficar {fruta2}
                 */
                for (Fruit fruta : Fruit.values()) {
                    if (fruta.name().equals(fruta2)) {
                        msg = true;
                    }
                }
                /*
                    * Muestra el mensaje dependiendo si existe el objeto 
                    * en el enumerador
                 */
                if (msg == false) {
                    System.out.printf("%s No existe en el enumerador Fruit \n", fruta2);
                } else {
                    System.out.printf("%s Existe en el enumerador Fruit \n", fruta2);
                }
                
                /**
                    * Mostrar los objetos del enumerador Fruit mas sus valores
                */
                System.out.println("\n Valores del enumerador");
                System.out.printf("Nombre \t color \t precio \n");
                System.out.println("---------------------------------------------------");
                for (Fruit frutas : Fruit.values()) {
                    System.out.printf("%s \t %s \t %s \n", frutas, frutas.getcolor(), frutas.getPrecio());
                }
                
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
