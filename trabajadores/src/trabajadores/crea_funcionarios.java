package trabajadores;

import java.util.ArrayList;
import java.util.Scanner;

public class crea_funcionarios {

    public static ArrayList<jefe> jefes = new ArrayList();
    public static ArrayList<trabajador> nomina = new ArrayList();

    public void ingresojefes() throws MyException {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese nombre:");
            String nombre = entrada.nextLine();//validad que no se ingrese vacia

            assert !"".equals(nombre) : "nombre nulo arregla la cuestion";//ejemplo de validacion de por assercion
            System.out.println("ingrese apellido: ");
            String ape = entrada.nextLine();//validad que no se ingrese vacia
            if (validation(ape) == true) {
                System.out.println("ingrese rut: ");
                String rut = entrada.nextLine();//validad que no se ingrese vacia
                if (validation(rut)) {
                    System.out.println("ingrese edad");
                    int edad = entrada.nextInt();//hasta aqui los datos estandar de la clase empleado
                    System.out.println("ingrese cargo: ");//validar cargon con enum, cargos son JefeDepto, JefeArea, JefeSeccion, JefeDivicion
                    String cargo = entrada.next();
                    if (validationCargo(cargo) == true) {
                        System.out.println("ingrese numero de oficina: ");
                        int num_of = entrada.nextInt(); //validad que no se ingrese vacia

                        System.out.println("ingrese anexo: ");
                        int anexo = entrada.nextInt();//validad que no se ingrese 

                        System.out.println("ingrese nombre del departamento");
                        String nom_depto = entrada.next();//validar con enum los departamentos son ventas, contavilidad, produccion, operacions, distribucion
                        if (validationEnumSeccion(nom_depto)) {
                            System.out.println("ingrese sueldo: ");
                            int sueldo = entrada.nextInt();//sueldo mayor o igual a sueldo minimo(280.000$ )clase anidada
                            validacionSueldo s = new validacionSueldo(sueldo);
                            if (s.validacionS() == false) {
                                System.out.println("[ERROR] Sueldo demasiado bajo");
                            } else {
                                System.out.println("ingrese bono");
                                int bono = entrada.nextInt();//bono puede ser desde cero
                                jefe boss = new jefe();
                                boss.ingresos(cargo, num_of, anexo, nom_depto, nombre, ape, edad, rut, sueldo, bono);
                                jefes.add(boss);
                            }

                        }

                    }

                }

            }
        } catch (Exception e) {
            new MyException("[ERROR]");
        }
    }

    public void ingresotrabajadores() throws MyException {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("ingrese nombre:");
            String nombre = entrada.next();//validad que no se ingrese vacia
            if (validation(nombre) == true) {
                System.out.println("ingrese apellido: ");
                String ape = entrada.next();//validad que no se ingrese vacia
                if (validation(ape) == true) {
                    System.out.println("ingrese rut: ");
                    String rut = entrada.next();//validad que no se ingrese vacia
                    if (validation(rut) == true) {
                        System.out.println("ingrese edad");
                        int edad = entrada.nextInt();//validar que sea mayor o igual a cero
                        if (edad >= 0) {
                            System.out.println("ingrese N° estacion de trabajo: ");
                            String n_estacion = entrada.next();//validad que no se ingrese vacia
                            if (validation(n_estacion) == true) {
                                System.out.println("ingrese seccion de trabajador: ");
                                String seccion = entrada.next().toUpperCase();//validar con enum los departamentos son ventas, contavilidad, produccion, operacions, distribucion
                                if (validationEnumSeccion(seccion) == true) {
                                    System.out.println("ingrese cargo: ");
                                    String rango = entrada.next();//validar con enum ayudante, operario, primeraClase, ejecutivo, trainer 
                                    if (validationEnumRango(rango) == true) {
                                        System.out.println("ingrese valor hora");
                                        int valor_hora = entrada.nextInt();//validar que sea mayor o igual a 3000
                                        if (valor_hora >= 3000) {
                                            System.out.println("ingrese cantidad de horas: ");
                                            int cantidad_horas = entrada.nextInt();//validar que sea mayor o igual a 45
                                            if (cantidad_horas >= 45) {
                                                trabajador job = new trabajador();
                                                job.ingresos(n_estacion, seccion, rango, nombre, ape, edad, rut, valor_hora, cantidad_horas);
                                                nomina.add(job);
                                            } else {
                                                System.out.println("[ERROR] al ingresar cantidad de horas");
                                            }
                                        } else {
                                            System.out.println("[ERROR] a sobrepasado los 3000 en el valor hora");
                                        }

                                    } else {
                                        System.out.println("[ERROR] No existe en el rango ingresado");
                                    }

                                } else {
                                    System.out.println("[ERROR] No existe seccion ingresada.");
                                }
                            } else {
                                System.out.println("[ERROR] n_estacion se encuentra vacia");
                            }
                        } else {
                            System.out.println("[ERROR] edad no valida");
                        }
                    }
                } else {
                    System.out.println("Apellido vacio");
                }
            } else {
                    System.out.println("Nombre vacio");
            }
        } catch (Exception e) {
            new MyException("ERROR" + e);
        }
    }

    /**
     *
     * @param sec Seccion ingresada por el usuario
     * @return boolean true si existe
     */
    public boolean validationEnumSeccion(String sec) {
        for (Seccion s : Seccion.values()) {
            if (s.name().equals(sec)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param rang Rango ingresado por el usuario
     * @return boolean true si existe
     */
    public boolean validationEnumRango(String rang) {
        for (Rango r : Rango.values()) {
            if (r.name().equals(rang)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param var variable ingresada
     * @return boolean
     */
    public boolean validation(String var) {
        if (!var.equals("")) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param var cargo ingresado por el usuario
     * @return boolean si existe en el sistema
     */
    public boolean validationCargo(String var) {
        for (Cargo c : Cargo.values()) {
            if (c.name().equals(var.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    class validacionSueldo {

        private int sueldo;

        validacionSueldo(int sueldo) {
            this.sueldo = sueldo;
        }

        public boolean validacionS() {
            if (this.sueldo >= 280000) {
                return true;
            }
            return false;
        }
    }
}
