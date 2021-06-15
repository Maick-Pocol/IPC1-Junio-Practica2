package src;

import java.util.*;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int opcion = 0;
        boolean condicion = true;

        int cantpersonas = 0;
        String personaNombre[] = new String[cantpersonas];
        int personaTelefono[] = new int[cantpersonas];
        boolean peliculaprestada[] = new boolean[cantpersonas];
        int personaId[] = new int[cantpersonas];
        //Definimos las variables de stock en la tienda de peliculas

        int cantpeliculas = 0;
        String peliculaNombre[] = new String[cantpeliculas];
        int peliculaId[] = new int[cantpeliculas];
        int peliculaAnio = new int[cantpeliculas];
        

        while (condicion) {
            System.out.println("-----------MENU-----------");
            System.out.println("[1] ingresar clientes");
            System.out.println("[2] indicar cantidad de peliculas disponibles");
            System.out.println("[3] prestar pelicula.");
            System.out.println("[4] indicar cantidad de clientes");
            System.out.println("[0] salir");
            System.out.println("------------------------------------------");
            System.out.println("opcion: ");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-- opcion 1 --");
                    System.out.print("cantidad de clientes a ingresar: ");
                    cantpersonas = tec.nextInt();
                    tec.nextLine();

                    personaNombre = new String[cantpersonas];
                    personaTelefono = new int[cantpersonas];
                    peliculaprestada = new boolean[cantpersonas];
                    personaId = new int[cantpersonas];

                    for (int i = 0; i < cantpersonas; i++) {
                        System.out.println("--> persona " + (i + 1));
                        System.out.print("nombre: ");
                        personaNombre[i] = tec.nextLine();
                        System.out.print("Telefono: ");
                        personaTelefono[i] = tec.nextInt();
                        tec.nextLine();
                        System.out.print("Id: ");
                        personaId[i] = tec.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("-- opcion 2 --");
                    int cont = 0;
                    System.out.println("ingrese pelicula: ");
                    int cantpeliculaX = tec.nextInt();
                    for (int i = 0; i < cantpeliculas; i++) {
                        if (cantpeliculaId == cantpeliculaId[i]) {
                            cont = cont + 1;
                        }
                    }
                    System.out.println("cantidad de peliculas con " + peliculaId + " " + cont);
                    break;

                case 3:
                    System.out.println("-- opcion 3 --");
                    int contId = 0;
                    int contAnio = 0;
                    for (int i = 0; i < cantpeliculas; i++) {
                        if (peliculaId[i].equals("Id")) {
                            contId = contId + 1;
                        } else {
                            contnombre = contnombre + 1;
                        }
                    }
                    System.out.println("nombre: " + contId);
                    System.out.println("Anio: " + contAnio);
                    break;

                case 4:
                    System.out.println("-- opcion 4 --");
                    for (int i = 0; i < cantpersonas; i++) {
                        System.out.println("--> persona " + (i + 1));
                        System.out.println("nombre: " + personaNombre[i]);
                        System.out.println("Telefono: " + personaTelefono[i]);
                        System.out.println("Id: " + personaId[i]);
                    }
                case 0:
                    condicion = false;
                    System.out.println("-- saliste !! --");
                    break;

                default:
                    System.out.println("-- opcion no encontrada --");

            }

        }
    }
}