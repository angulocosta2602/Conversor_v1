import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMonedas consulta = new ConsultaMonedas();

        int opcion=0;
        while(opcion !=8){
            System.out.println("--------------------------------\n" +
                    "Bienvenidos Al Conversor de Monedas\n\n" +
                    "Ingresa la conversión que deseas realizar\n\n" +
                    "1. Dolar a peso Argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real Brasilero\n" +
                    "4. Real Brasilero a Dolar\n" +
                    "5. Dolar a peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMonedas.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    ConvertirMonedas.convertir("ARS","USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMonedas.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMonedas.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMonedas.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    ConvertirMonedas.convertir("COP","USD",consulta,lectura);
                    break;
                case 7:
                    ConvertirMonedas.convertirOtraMoneda(consulta,lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del Programa.........");
                    break;
                default:
                    System.out.println("Opción No Válida");
            }
        }
    }
}
