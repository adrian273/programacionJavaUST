package tallertrabajador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian Verdugo
 */
public class TallerTrabajador {

    static String estadoCivil;
    static ArrayList<Trabajador> trabajador = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static boolean verificar(String estadoCivil) {
        for (EstadoCivil eC : EstadoCivil.values()) {
            if (eC.name().equals(estadoCivil)) {
                return true;
            }
        }
        return false;
    }

    public static void agregarTrabajador() throws Exception {
        try {
            String nombre;
            int valorHora, horaTrabajada, carga;
            System.out.println("Ingrese nombre");
            nombre = input.next();
            System.out.println("Valor hora");
            valorHora = input.nextInt();

            System.out.println("Hora Trabajada");
            horaTrabajada = input.nextInt();
            System.out.println("Numero Carga");
            carga = input.nextInt();
            System.out.println("Ingrese estado Civil");
            estadoCivil = input.next().toUpperCase();
            if (verificar(estadoCivil) == true) {
                Trabajador t = new Trabajador(nombre, valorHora, horaTrabajada, carga, EstadoCivil.valueOf(estadoCivil));
                trabajador.add(t);
            } else {
                System.out.println("[ERROR] No hay estado Civil");
            }
        } catch (NumberFormatException n) {
            System.out.println("[ERROR]" + n);
        }

    }

    public static void verTrabajador() {
        trabajador.forEach((i) -> {
            System.out.println(i.toString() + i.calcularSueldoTotal(i.getValorHora(), i.getHoraTrabajada(), i.getCarga()));
        });
    }

    public static void main(String[] args) throws Exception {
        boolean exit = true;
        int op;
        while (exit) {
            try {
                System.out.println("1. Agregar - 2. Ver - 3. Salir");
                System.out.println("ingrese Opcion");
                op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Agregar trabajador");
                        agregarTrabajador();
                        break;
                    case 2:
                        System.out.println("Ver Trabajador");
                        verTrabajador();
                        break;
                    case 3:
                        exit = false;
                }
            } catch (NumberFormatException e) {
                    System.out.println("[ERROR] Ingrese numero" + e);
            }

        }

    }

}
