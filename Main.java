import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    static void menuPrincipal() {
        int opcion = 1;
        Scanner sn = new Scanner(System.in);
        while (opcion != 0) {
            try {
                System.out.println("CATALOGO \n");
                System.out.println("\t 1- Agregar dispositivo. \n");
                System.out.println("\t 3- Eliminar electronico. \n");
                System.out.println("\t 4- Mostrar electronicos. \n");
                System.out.println("\t 0- Salir \n");
                opcion = sn.nextInt();
                sn.nextLine();
                switch (opcion) {
                    case 1:
                        agregarDispositivo();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;

                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una opcion valida,");
            }

        }
    }

    static void agregarDispositivo(){
        ArrayList ListaInventario = new ArrayList<>();

        System.out.println("1- Telefono\n");
        System.out.println("2- Laptop\n");
        Scanner sn = new Scanner(System.in);
        int opcionDis = sn.nextInt();
        sn.nextLine();

        switch(opcionDis){
            case 1:
                System.out.println("Nombre \n");
                String nombre = sn.nextLine();
                System.out.println("Modelo \n");
                String modelo = sn.nextLine();
                System.out.println("Descripcion \n");
                String descripcion = sn.nextLine();
                System.out.println("Precio \n");
                String precio = sn.nextLine();
                System.out.println("No serial \n");
                int noSerial = sn.nextInt();
                System.out.println("Precio \n");
                int chipNumero = sn.nextInt();
    
                Telefonos telefono = new Telefonos(nombre, modelo, descripcion, precio, noSerial, chipNumero);
    
                ListaInventario.add(telefono);
                break;

            case 2:
                /*System.out.println("Nombre \n");
                String nombreLap = sn.nextLine();
                System.out.println("Modelo \n");
                String modeloLap = sn.nextLine();
                System.out.println("Descripcion \n");
                String descripcionLap = sn.nextLine();
                System.out.println("Precio \n");
                String precioLap = sn.nextLine();
                System.out.println("Procesador \n");
                String ProcesadorLap = sn.nextLine();
                System.out.println("RAM \n");
                int RAM = sn.nextInt();

                Laptops laptop = new Laptops(nombreLap, modeloLap, descripcionLap, precioLap, ProcesadorLap, RAM);

                ListaInventario.add(laptop);
                break;*/

            case 3:
                
            default:
                break;
        }


        }



    }







