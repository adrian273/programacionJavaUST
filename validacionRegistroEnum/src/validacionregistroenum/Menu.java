package validacionregistroenum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Menu {

    // Variable que iniciara Scanner
    static Scanner input;
    /*
        * Inicia o termina el bucle infinito
        * @default boolean false
     */
    private boolean salir;

    // Registro donde se guardaran los datos del cantante
    private ArrayList<Cantante> cantante;

    public Menu() {
        input = new Scanner(System.in);
        this.salir = true;
        cantante = new ArrayList<>();
    }

    public void Main() {
        // Menu de opciones del sistema
        String[] options = {"1. Agregar Nuevo", "2. Ver ", "3. Salir"};
        try {
            while (this.salir) {
                // Mostrando menu de opciones
                for (String ops : options) {
                    System.out.println(ops);
                }
                // @var { op } valor donde se guarda la opcion ingresada
                int op = input.nextInt();
                switch (op) {
                    case 1:
                        Singer s = new Singer();
                        /* 
                            * @method verification 
                            * @return false no existe en el enumerador 
                        */
                        if (s.verification() == false) {
                            System.out.println("![ERROR]No existe este registro");
                        }
                        break;
                    case 2:
                        Singer singerView = new Singer();
                        /**
                         * @void muestra los cantantes ingresados
                         */
                        singerView.viewSinger();
                        break;
                    case 3:
                        /*
                            *@var salir 
                            *@return false para terminar el bucle
                        */
                        this.salir = false;
                }

            }
        } catch (Exception ex) {
            // mensaje de exception
            System.out.println(ex);
        }
    }

    /**
     * @version 1.0
     * @info agregar y ver cantantes.
     */
    class Singer {

        private String generoMusical, nombre, nacionalidad;
        private int edad, carga;
        boolean request = false;

        public Singer() {
        }

        /**
         *
         * @return true para verificar si existe el dato ingresado en el
         * enumerador
         */
        public boolean verification() throws ExceptValidation {
            System.out.println("Ingrese genero musical");
            // @metodo toUpperCase() convierte las palabras en mayusculas
            generoMusical = input.next().toUpperCase();
            // Recorro los datos existentes en el enumerador
            for (GeneroMusicalData g : GeneroMusicalData.values()) {
                /**
                 * @var request 
                 * @return true si existe el enumerador ingresado
                 */
                if (g.name().equals(generoMusical)) {
                    /**
                     * @param g genero musical validado
                     */
                    addSinger(g);
                    request = true;
                }
            }
            return request;
        }

        /**
         *
         * @param gm generomusical existente.
         */
        public void addSinger(GeneroMusicalData gm) throws ExceptValidation {
            try {
                System.out.println("nombre: ");
                nombre = input.next();
                System.out.println("Nacionalidad");
                nacionalidad = input.next();
                System.out.println("Edad");
                edad = input.nextInt();
                System.out.println("Cantidad de hijos");
                carga = input.nextInt();
                Cantante c = new Cantante(nombre, nacionalidad, edad, gm, carga);
                cantante.add(c);
            } catch (Exception e) {
                throw new ExceptValidation(carga, "Valor de carga no numerico");
            }
        }

        public void viewSinger() {
            /**
             * @isEmpty si no esta vacio el registro que muestre lso datos
             */
            if (!cantante.isEmpty()) {
                for (Cantante c : cantante) {
                    System.out.println("Nombre \t nacionalidad \t edad \t genero musical");
                    System.out.printf("%s \t %s \t %d \t %s \n", c.getNombre(), c.getNacionalidad(),
                            c.getEdad(), c.getgM().name());
                }
            } else {
                System.out.println("![Warning] no hay datos ingresados");
            }

        }

    } // fin clase  -> Singer

}
