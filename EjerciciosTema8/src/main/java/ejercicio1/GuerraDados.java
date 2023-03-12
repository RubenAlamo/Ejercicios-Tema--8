package ejercicio1;
public class GuerraDados {
    public static void main(String[] args) {
        JugadorGuerra jugador = new JugadorGuerra();
        jugador.pedirNombre();
        int dado1 = jugador.lanzarDado();
        int dado2 = jugador.lanzarDado();
        jugador.compararDados(dado1, dado2);
    }
}

