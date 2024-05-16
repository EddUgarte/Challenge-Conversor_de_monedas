import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ConsultaApi consulta = new ConsultaApi();
        boolean bandera = true;
        double cantidad;

        while (bandera) {
            System.out.println("*********************************");
            System.out.println("******CONVERSOR DE MONEDAS*******");
            System.out.println("""
                    Seleccione la opción deseada:
                    A- Covertir Dólar Americano a Peso Mexicano
                    B- Convertir Peso Mexicano a Dólar Americano
                    C- Convertir Dólar Canadiense a Peso Mexicano
                    D- Convertir Peso Mexicano a Dólar Canadiense
                    E- Convertir Euros a Peso Mexicano
                    F- Convertir Peso Mexicano  a Euro
                    Z- Salir
                    """);
            String opcion = leer.nextLine();
            opcion = opcion.toUpperCase();

            switch (opcion) {
                case "A":
                    System.out.println("Moneda base: USD");
                    System.out.println("Moneda destino: MXN");

                    System.out.println("Ingresa la cantidad a convertir: ");
                    cantidad = Double.valueOf(leer.nextLine());

                    consulta.buscaMoneda("USD", "MXN", cantidad);
                    break;
                case "B":
                    System.out.println("Moneda base: MXN");
                    System.out.println("Moneda destino: USD");

                    System.out.println("Ingresa la cantidad a convertir: ");
                    cantidad = Double.valueOf(leer.nextLine());

                    consulta.buscaMoneda("MXN", "USD", cantidad);
                    break;
                case "C":
                    System.out.println("Moneda base: CAD");
                    System.out.println("Moneda destino: MXN");

                    System.out.println("Ingresa la cantidad a convertir: ");
                    cantidad = Double.valueOf(leer.nextLine());

                    consulta.buscaMoneda("CAD", "MXN", cantidad);
                    break;
                case "D":
                    System.out.println("Moneda base: MXN");
                    System.out.println("Moneda destino: CAD");

                    System.out.println("Ingresa la cantidad a convertir: ");
                    cantidad = Double.valueOf(leer.nextLine());

                    consulta.buscaMoneda("MXN", "CAD", cantidad);
                    break;
                case "E":
                    System.out.println("Moneda base: EUR");
                    System.out.println("Moneda destino: MXN");

                    System.out.println("Ingresa la cantidad a convertir: ");
                    cantidad = Double.valueOf(leer.nextLine());

                    consulta.buscaMoneda("EUR", "MXN", cantidad);
                    break;
                case "F":
                    System.out.println("Moneda base: MXN");
                    System.out.println("Moneda destino: EUR");

                    System.out.println("Ingresa la cantidad a convertir: ");
                    cantidad = Double.valueOf(leer.nextLine());

                    consulta.buscaMoneda("MXN", "EUR", cantidad);
                    break;
                case "Z":
                    System.out.println("El programa ha finalizado");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción no válida, ingresar nuevamente");
            }

        }

    }
}
