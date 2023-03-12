package ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<String> clientes = new ArrayList<String>();
    static ArrayList<String> obras = new ArrayList<String>();
    static ArrayList<String> pedidos = new ArrayList<String>();

    public static void main(String[] args) {
        boolean salir = false;
        do {
            int opcion;
            System.out.println("--Menu--");
            System.out.println("1.- Mostrar clientes");
            System.out.println("2.- Añadir cliente");
            System.out.println("3.- Crear una obra");
            System.out.println("4.- Crear un pedido");
            System.out.println("5.- Mostrar pedidos");
            System.out.println("6.- salir");
            opcion = teclado.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("--Clientes--");
                        mostrarClientes();
                        break;
                    case 2:
                        anadirCliente();
                        break;
                    case 3:
                        crearObra();
                        break;
                    case 4:
                        crearPedido();
                        break;
                    case 5:
                        mostrarPedidos();
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe ingresar un numero entre el 1 y 7");
                }
            }
            catch (Exception e) {
                System.out.println("Debe ingresar un numero entre el 1 y 7");
            }
        }while (!salir);
    }

    static void mostrarClientes(){
        System.out.println("Se van a mostrar todos los clientes de la compañia");
        for (String cliente : clientes)
            System.out.println(cliente);
    }

    static void anadirCliente(){
        System.out.println("¿Cual es el nombre del cliente?");
        String nombre = teclado.next();
        System.out.println("Apellido:");
        String apellido = teclado.next();
        clientes.add(nombre + " " + apellido);
    }
    static void crearObra(){
        System.out.println("tipo de obra: (1) libro, (2) video");
        int tipo = teclado.nextInt();
        System.out.println("¿Cual es el nombre de la obra?");
        String nombre = teclado.next();
        System.out.println("¿Cual es el nombre del autor de la obra?");
        String autor = teclado.next();
        if(tipo == 2){
            System.out.println("¿Cual es la duracion del video?");
            int duracion = teclado.nextInt();
            System.out.println("Video " + nombre + " de " + autor + "(" + duracion + ")");
            obras.add("Video " + nombre + " de " + autor + "(" + duracion + ")");
        }else if(tipo == 1){
            System.out.println("¿Cual es el numero de paginas del libro?");
            int paginas = teclado.nextInt();
            System.out.println("Libro " + nombre + " de " + autor + "(" + paginas + ")");
            obras.add("Libro " + nombre + " de " + autor + "(" + paginas + ")");
        }
    }

    //metodo para crear un pedido que recibe los nombres de los clientes y la obras almacenadas en el arraylist
    static void crearPedido(){
        mostrarClientes();
        mostrarObras();
        System.out.println("¿Cual es el nombre del cliente que quiere el pedido?");
        String cliente = teclado.next();
        System.out.println("¿Cual es el nombre de la obra que quiere el cliente?");
        String obra = teclado.next();
        String pedido = cliente + " - " + obra;
        pedidos.add(pedido);
    }

    static void mostrarPedidos(){
        System.out.println("Se van a mostrar todos los pedidos de la compañia");
        for (String pedido : pedidos)
            System.out.println(pedido);
    }
    static void mostrarObras(){
        System.out.println("Se van a mostrar todas las obras de la compañia");
        for (String obra : obras)
            System.out.println(obra);
    }
}
