package trabajadores;

import java.util.Scanner;

public class Trabajadores {

    public static crea_funcionarios nuevos = new crea_funcionarios();

    public static void main(String[] args) throws MyException {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Ingreso jefes");
        System.out.println("2. Ingreso trabajadores");
        int op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println("----- Ingreso de jefes -----");
                nuevos.ingresojefes();
                break;
            case 2:
                System.out.println("----- Ingreso de trabajadores -----");
                nuevos.ingresotrabajadores();
                break;
        }

        likidacion_sueldo pagar = new likidacion_sueldo();
        pagar.pago(nuevos);

        /*
        implementar validacion pedidas (ejemplo de assercion implementdo.. probarno obligatio implementar asserciones pero si la validacion)
        
        tanto con los enum y personalisando los try-catch
        
        ademas la validaciones de montos implementarlas con clases anidadas
         */
    }
}
