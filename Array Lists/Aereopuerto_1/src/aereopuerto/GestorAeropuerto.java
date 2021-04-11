/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author charlie
 */
public class GestorAeropuerto {

    public static void main(String[] args) {

        final int MAX_AEROPUERTOS = 20;
        final int TIPO_PUBLICO = 1;
        final int TIPO_PRIVADO = 2;
        final int ACTIVO = 1;
        final int NO_ACTIVO = 2;

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        Aereopuerto aereopuertos[] = new Aereopuerto[MAX_AEROPUERTOS];
        int numAereopuertos = 0; // es índice y contador a la vez

        Aereopuerto areopuertoAux;
        Direccion dAux;

        Avion avionAux;

        boolean salir = false;
        int opcion, num, anio_in, capacidad, tipo, numTrabajadoresDiscapacitados, numSocios, asientos, eleccionActivo, idAereopuerto; //Aqui se guardará la opción del usuario.

        String nombre, pais = "", ciudad = "", calle = "", modelo;
        double financiacion, velocidadMax, cantidad;

        while (!salir) {

            System.out.println("1. Añadir Nuevo Aeropuerto");
            System.out.println("2. Añadir Avion");
            System.out.println("3. Mostrar Informaión del Aeropuerto");
            System.out.println("4. Mostrar Años ue lleva funcionando");
            System.out.println("5. Mostar gananciasde un aeropuerto");
            System.out.println("6. Salir");

            try {
                System.out.println("Escribe el número una de la opcioón elegida: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        if (numAereopuertos > MAX_AEROPUERTOS) {
                            System.out.println("No se pueden meter más aeropuertos");
                        } else {

                            System.out.println("Escribe el nombre del Aeropuerto: ");
                            nombre = sc.next();

                            System.out.println("Escribe el país del Aeropuerto: ");
                            nombre = sc.next();

                            System.out.println("Escribe la ciudad del Aeropuerto: ");
                            nombre = sc.next();

                            System.out.println("Escribe la calle del Aeropuerto: ");
                            nombre = sc.next();

                            System.out.println("Escribe el numero: ");
                            num = validaNumero(0, Integer.MAX_VALUE);

                            System.out.println("Escribe el  año de inauguración del Aeropuerto: ");
                            anio_in = validaNumero(0, Integer.MAX_VALUE);

                            System.out.println("Escribe la capacidad de operaciones de este Aeropuerto: ");
                            capacidad = validaNumero(0, Integer.MAX_VALUE);

                            System.out.println("Deseas crear Aeropuerto Publico (1) / Deseas Crear Aeropuerto Privado (2)");
                            tipo = validaNumero(TIPO_PUBLICO, TIPO_PRIVADO);

                            dAux = new Direccion(pais, ciudad, calle, num);

                            if (tipo == TIPO_PUBLICO) {
                                System.out.println("Escribe la financiación del Aereopuerto");
                                financiacion = sc.nextDouble();

                                System.out.println("Escribe el número de empledos con discapacidad");
                                numTrabajadoresDiscapacitados = validaNumero(0, Integer.MAX_VALUE);

                                areopuertoAux = new AereopuertoPublico(financiacion, numTrabajadoresDiscapacitados, nombre, dAux, anio_in, capacidad);

                            } else {

                                System.out.println("Escribe el número de socios ");
                                numSocios = validaNumero(0, Integer.MAX_VALUE);

                                areopuertoAux = new AereopuertoPrivado(numSocios, nombre, dAux, anio_in, capacidad);

                            }

                            aereopuertos[numAereopuertos] = areopuertoAux;
                            numAereopuertos++;
                        }
                        break;
                    case 2:

                        if (numAereopuertos == 0) {
                            System.out.println("No hay aeropuertos, debes añadir alguno.");
                        } else {

                            System.out.println("Escribe lmodelo del Avión: ");
                            modelo = sc.next();

                            System.out.println("Escribe el número de asientos ");
                            asientos = validaNumero(0, Integer.MAX_VALUE);

                            System.out.println("Escribe la velocidad máxima del Avión ");
                            velocidadMax = sc.nextDouble();

                            System.out.println("Activo (1) / No  (2)");
                            eleccionActivo = validaNumero(ACTIVO, NO_ACTIVO);

                            avionAux = new Avion(modelo, asientos, velocidadMax);

                            if (eleccionActivo == ACTIVO) {
                                avionAux.setActivado(true);
                            }

                            System.out.println("Elige un aeropuerto por su Id");
                            mostrarAereopuertos(aereopuertos, numAereopuertos);

                            System.out.println("----------------------------->>");
                            idAereopuerto = sc.nextInt();

                            areopuertoAux = seleccionarAereopuerto(aereopuertos, numAereopuertos, idAereopuerto);

                            if (areopuertoAux != null) {
                                areopuertoAux.aniadirAviones(avionAux);
                            } else {
                                System.out.println("No existe ese Aeropuerto. El Avión es desechado.");
                            }

                        }
                        break;

                    case 3:

                        System.out.println("Elige un aeropuerto por su Id");
                        mostrarAereopuertos(aereopuertos, numAereopuertos);

                        System.out.println("----------------------------->>");
                        idAereopuerto = sc.nextInt();

                        areopuertoAux = seleccionarAereopuerto(aereopuertos, numAereopuertos, idAereopuerto);

                        if (areopuertoAux != null) {
                            System.out.println(areopuertoAux);

                        } else {
                            System.out.println("No existe ese Aeropuerto.");
                        }

                        break;

                    case 4:

                        System.out.println("Elige un aeropuerto por su Id");
                        mostrarAereopuertos(aereopuertos, numAereopuertos);

                        System.out.println("----------------------------->>");
                        idAereopuerto = sc.nextInt();

                        areopuertoAux = seleccionarAereopuerto(aereopuertos, numAereopuertos, idAereopuerto);

                        if (areopuertoAux != null) {
                            System.out.println(areopuertoAux);
                            System.out.println("Lleva." + areopuertoAux.aniosAbierto() + " años abierto");
                        } else {
                            System.out.println("No existe ese Aeropuerto.");
                        }

                        break;

                    case 5:

                        System.out.println("Elige un aeropuerto por su Id");
                        mostrarAereopuertos(aereopuertos, numAereopuertos);

                        System.out.println("----------------------------->>");
                        idAereopuerto = sc.nextInt();

                        areopuertoAux = seleccionarAereopuerto(aereopuertos, numAereopuertos, idAereopuerto);

                        if (areopuertoAux != null) {
                            System.out.println("Escribe la cantidad acumulada por operaciones del aereopuerto");
                            cantidad = sc.nextDouble();

                            areopuertoAux.gananciasTotales(cantidad);
                        } else {
                            System.out.println("No existe ese Aeropuerto.");
                        }

                        break;
                    case 6:
                        salir =true;
                        break;
                }
            } catch (Exception e) {
            }

        }

    }

    public static int validaNumero(int min, int max) {

        Scanner sc = new Scanner(System.in);

        if (min > max) {

            int aux = min;
            min = max;
            max = aux;
        }

        int num;

        do {
            System.out.println("");
            num = sc.nextInt();

            if (!(min >= 0 && num <= max)) {

                System.out.println("Debes escribir un numero entre " + min + " y" + max);
            }
        } while (!(min >= 0 && num <= max));

        return num;

    }

    public static void mostrarAereopuertos(Aereopuerto aereopuertos[], int numAereopuertos) {

        for (int i = 0; i < numAereopuertos; i++) {

            if (aereopuertos[i] instanceof AereopuertoPrivado) {
                System.out.println("Id: " + aereopuertos[i].getId() + "Nombre: " + aereopuertos[i].getNombre() + "Clasificación:  Privado");
            } else {
                System.out.println("Id: " + aereopuertos[i].getId() + "Nombre: " + aereopuertos[i].getNombre() + "Clasificación:  Público");
            }

        }
    }

    public static Aereopuerto seleccionarAereopuerto(Aereopuerto aereopuertos[], int numAereopuertos, int idAp) {
        for (int i = 0; i < numAereopuertos; i++) {
            if (aereopuertos[i].getId() == idAp) {
                return aereopuertos[i];
            }
        }
        return null;
    }
}
