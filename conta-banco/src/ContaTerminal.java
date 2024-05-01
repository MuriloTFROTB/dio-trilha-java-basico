import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, voce entrou na sua criacao de conta bancaria, qual e o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite e o numero da sua Agencia?");
        String agencia = scanner.next();

        System.out.println("Digite e o numero da sua Conta?");
        int numeroConta=scanner.nextInt();

        System.out.println("Digite aqui o seu saldo");
        double saldo=scanner.nextDouble();

        System.out.println("Ola"+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia e"+ agencia +", conta"+numeroConta+" e seu saldo $"+saldo+" ja esta disponivel para saque");
    }
}
