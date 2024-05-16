import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();

        System.out.println("Moneda base: USD");
        System.out.println("Moneda destino: MXN");

        System.out.println("Ingresa la cantidad a convertir: ");
        Double cantidad = leer.nextDouble();

        consulta.buscaMoneda("USD", "MXN", cantidad);
    }
}
