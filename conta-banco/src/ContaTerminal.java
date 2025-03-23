import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        //importar a classe scanner
        //Exibir mensagens para o nosso usuário
        //Obter pelo scanner os valores
        //exibir mensagem de conta criada    
    Scanner scanner = new Scanner(System.in);
    //pede o numero da agencia    
    System.out.print("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();
        scanner.nextLine();// Consome a quebra de linha pendente e o ENTER pendente.

    //pede o numero da agencia    
    System.out.print("Por favor, digite a Agência: ");
        String agencia = scanner.nextLine();

    //pede o primeiro nome do cliente
    System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

    //pede saldo do saque
    System.out.print("Por favor, digite seu saldo para saque: ");
        double saldo = scanner.nextDouble();

    
    //imprimindo os dados formatados obtidos do usuario
    System.out.println("Ola, " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ",conta " + numero +  " e seu saldo "+ String.format("%.2f", saldo)+ " já está disponível para saque." );

        scanner.close();
    }
}
