import javax.imageio.IIOException;
import java.util.ArrayList;

public class MultihiloCliente {
    static final int CALCULADORAS = 2;
    static final String[] NOMBRES = {"Calculadora 1", "Calculadora 2"};
    public static final String HOST = "localhost";

    public static void main(String[] args) throws IIOException {
        ArrayList<Thread> clientes = new ArrayList<>();

        for (int i = 0; i < CALCULADORAS; i++) {
            Thread cliente = new Thread(new Cliente(HOST, i + 1, NOMBRES[i]));
            clientes.add(cliente);
            cliente.start();
        }
    }
}
