package libreria1;

import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Menu {

    private final Scanner sc;
    private final AutorServicio servAut;
    private final EditorialServicio servEdit;
    private final LibroServicio servLibro;

    public Menu() {
        sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        servAut = new AutorServicio();
        servEdit = new EditorialServicio();
        servLibro = new LibroServicio();
    }

    public void menu() {
        int op = 0;

        do {
            try {
                System.out.println("*****      BIBLIOTECA     ******");
                System.out.println("** 1. ADMINISTRAR LIBROS      **");
                System.out.println("** 2. ADMINISTRAR AUTORES     **");
                System.out.println("** 3. ADMINISTRAR EDITORIALES **");
                System.out.println("** 4. PARA SALIR              **");
                System.out.println("********************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        menuLibro();
                        break;
                    case 2:
                        menuAutor();
                        break;
                    case 3:

                        break;
                    case 4:

                        System.out.println("\nCHAU!!  \n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 4);
    }

    private void menuLibro() {
        int op = 0;

        do {
            try {
                System.out.println("*****   LIBROS    ******");
                System.out.println("** 1. MOSTRAR LIBROS **");
                System.out.println("** 2. PRESTAMO       **");
                System.out.println("** 3. DEVOLUCION     **");
                System.out.println("** 4. VENTA          **");
                System.out.println("** 5. AGREGAR LIBRO  **");
                System.out.println("** 6. BORRAR LIBRO   **");
                System.out.println("** 7. BUSCAR LIBRO   **");
                System.out.println("** 8. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:

                        break;
                    case 2:
                        System.out.println("OPCION EN DESARROLLO");
                        break;
                    case 3:
                        System.out.println("OPCION EN DESARROLLO");
                        break;
                    case 4:
                        System.out.println("OPCION EN DESARROLLO");
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        buscaLibro();
                        break;
                    case 8:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 8);
    }

    private void menuAutor() {
        int op = 0;

        do {
            try {
                System.out.println("*****  AUTORES    ******");
                System.out.println("** 1. MOSTRAR AUTORES **");
                System.out.println("** 2. AGREGAR AUTOR   **");
                System.out.println("** 3. BORRAR AUTOR    **");
                System.out.println("** 4. BUSCAR AUTOR    **");
                System.out.println("** 5. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 5);
    }

    private void buscaLibro() {
        int op = 0;
        do {
            try {
                System.out.println("*****   BUSCAR    *****");
                System.out.println("** 1. POR ISBN       **");
                System.out.println("** 2. POR TITULO     **");
                System.out.println("** 3. POR EDITORIAL  **");
                System.out.println("** 4. POR AUTOR      **");
                System.out.println("** 5. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        porISBN();
                        break;
                    case 2:
                        porTitulo();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 5);

    }

    private void porISBN() {
        System.out.println("Ingrese el codigo ISBN");
        Libro l1 = servLibro.buscaISBN(sc.nextLong());

        System.out.println("RESULTADO:");
        System.out.println(l1);

    }

    private void porTitulo() {
        System.out.println("Ingrese el titulo a buscar");
        Libro l1 = servLibro.buscaLibro(sc.next());

        System.out.println("RESULTADO:");
        System.out.println(l1);

    }

    /*
    
     */
}
