package tallertrabajadorpractica;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class TallerTrabajadorPractica {

    static Scanner input;
    private ArrayList<Trabajador> dataE;

    public TallerTrabajadorPractica() {
        input = new Scanner(System.in);
        dataE = new ArrayList<>();
    }

    /**
     * @todo agregar datos al arreglo de trabajadores
     */
    public void addDataE() {
        try {
            System.out.println("~ ingrese nombre: ");
            String nombre = input.next();
            assert nombre == "" : "DATO VACIO";
            System.out.println("~ ingrese valor hora: ");
            int valorHora = input.nextInt();
            System.out.println("~ ingrese horas trabajadas: ");
            int horaTrabajada = input.nextInt();
            System.out.println("~ ingrese cargas: ");
            int carga = input.nextInt();
            System.out.println("~ ingrese cargo: ");
            String estado = input.next();
            VerificState v = new VerificState(estado);
            if (v.vS()) {
                Trabajador tD = new Trabajador(nombre, valorHora, horaTrabajada, carga, Cargo.valueOf(v.getState()));
                dataE.add(tD);
            } else {
                System.out.println("[ERROR] ~ no existe el enumerador");
            }
        } catch (NumberFormatException e) {
            System.out.println("[error]");
        } catch (InputMismatchException e) {
            System.out.println("[error] input match");
        }
    }

    /**
     * @todo ver datos del trabajador
     */
    public void viewDataE() {
        if (!dataE.isEmpty()) {
            System.out.println("Nombre \t valor_hora \t hora_trabajada \t sueldo_total \n");
            dataE.forEach((Trabajador item) -> {
                System.out.printf("%s \t %d \t %d \t \t$%d \n", item.getNombre(), item.getValorHora(), item.getHorasTrabajada(), item.calcularSueldo(item.getValorHora(), item.getHorasTrabajada(), item.getCarga()));
            });
        } else {
            System.out.println("[warning] ~ No hay datos ingresados");
        }

    }

    /**
     * @since 1.0
     * @todo Verificar si existe el cargo ingresado en el enumerador
     */
    class VerificState {

        private String state;
        private boolean r;

        VerificState(String state) {
            this.state = state;
            this.r = false;
        }

        public String getState() {
            return state.toUpperCase();
        }

        public void setState(String state) {
            this.state = state;
        }

        public boolean vS() {
            for (Cargo eS : Cargo.values()) {
                if (eS.name().equals(this.getState().toUpperCase())) {
                    return this.r = true;
                }
            }
            return this.r;
        }

    }

    /**
     * -----------------------------------------------------------------------------------------|
     *
     * @param args
     * @Main
     * -----------------------------------------------------------------------------------------|
     */
    public static void main(String[] args) {
        TallerTrabajadorPractica t = new TallerTrabajadorPractica();
        boolean bucle = true;
        int opcion;
        while (bucle) {
            System.out.println(" 1. Agregar ~ 2. Ver ~ 3. Salir ");
            System.out.println("~> opcion: ");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("~> Ingreso de trabajadores");
                        t.addDataE();
                        break;
                    case 2:
                        System.out.println("~> Vista de trabajadores");
                        t.viewDataE();
                        break;
                    case 3:
                        bucle = false;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] se a producido un error ~>  " + e);
                break;
            }

        }
    }

}
