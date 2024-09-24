import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String stringInvertida = inverterString(entrada);
        int comprimento = entrada.length();

        System.out.println("String invertida: " + stringInvertida);
        System.out.println("Número de caracteres: " + comprimento); 

        scanner.close();
    }

    public static String inverterString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); 
    }
}
