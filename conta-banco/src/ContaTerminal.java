import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite a agencia: ");
        agencia = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        sc.close();
    }
}
