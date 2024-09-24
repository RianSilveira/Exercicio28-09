import java.util.Scanner;



public class Media {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número: ");
        int numero = scanner.nextInt();
        
        System.out.println ("Digite o Segundo Número: ");
        int numero2 = scanner.nextInt();

        System.out.println ("Digite o Terceiro Número: ");
        int numero3 = scanner.nextInt();

        System.out.println ("Digite o Quarto Número: ");
        int numero4 = scanner.nextInt();

        System.out.println ("Digite o Quinto Número: ");
        int numero5 = scanner.nextInt();


       int soma = numero + numero2 + numero3 + numero4 + numero5 / 5;
            


        System.out.println("A media dos 5 Números que vc digitou é: " + soma);
    }
}
