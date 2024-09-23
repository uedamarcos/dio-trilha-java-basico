import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta corrente bancária:");
        int numeroContaCorrente= scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência bancária:");
        String numeroAgenciaBancaria=scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente=scanner.next();

        System.out.println("Por favor, digite o sobrenome do cliente:");
        String sobrenomeCliente=scanner.next();

        System.out.println("Por favor, digite o saldo atual da conta bancária: ");
        double saldoAtual=scanner.nextDouble();
   

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgenciaBancaria + ", conta " + numeroContaCorrente + " e seu saldo " + saldoAtual + " já está disponível para saque");
     
    }
}