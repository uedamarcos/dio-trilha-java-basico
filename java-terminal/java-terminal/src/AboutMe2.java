import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
    public static void main(String[] args) {
        // criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);



        System.out.println("Digite seu nome: ");
        String nome=scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome=scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade=scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura=scanner.nextDouble();

        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Idade: " + idade);
    }
}
