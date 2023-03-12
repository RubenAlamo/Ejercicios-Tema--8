package ejercicio1;
import java.util.Scanner;
public class JugadorGuerra {
    int fichaNombre1 = 10;
    int fichaNombre2 = 10;
    String nombre1;
    String nombre2;

    public JugadorGuerra() {
        this.fichaNombre1 = fichaNombre1;
        this.fichaNombre2 = fichaNombre2;
    }

    //metodo para pedir nombre
    public void pedirNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador 1");
        nombre1 = sc.nextLine();
        System.out.println("Introduce el nombre del jugador 2");
        nombre2 = sc.nextLine();
    }

    //método lanzar dado
    public int lanzarDado() {
        return (int) (Math.random() * 6 + 1);
    }

    //método para comparar los dados
    public void compararDados(int dado1, int dado2) {
        do {
            if (dado1 > dado2) {
                System.out.println("El jugador " + nombre1 + " gana la ronda");
                this.fichaNombre1 = fichaNombre1 + 1;
                this.fichaNombre2 = fichaNombre2 - 1;
                System.out.println(nombre1 + " " + this.fichaNombre1 + "-" + nombre2 + " " + this.fichaNombre2);
            } else if (dado1 < dado2) {
                System.out.println("El jugador " + nombre2 + " gana la ronda");
                this.fichaNombre1 = fichaNombre1 - 1;
                this.fichaNombre2 = fichaNombre2 + 1;
                System.out.println(nombre1 + " " + this.fichaNombre1 + "-" + nombre2 + " " + this.fichaNombre2);
            } else {
                System.out.println("Empate");
            }
        } while (this.fichaNombre1 <= 20 && this.fichaNombre2 <= 20);
    }
}
