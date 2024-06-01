import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      double saldo = 0.00;
    
      System.err.println("Bem vindo ao Banco XPTO");
      System.err.println("Digite o número da sua Agência:");
      String agencia = scanner.next();
      System.err.println("Digite o número da sua conta");
      int numero = scanner.nextInt();
      System.err.println("Diga como queria ser chamado:");
      String nome = scanner.next();
      System.err.println("Seu saldo atual é R$ " + saldo);
      System.err.println("Deposite uma quantia para aumentar seu saldo");
      double deposito = scanner.nextDouble();
      saldo = saldo + deposito;
      System.err.println("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
