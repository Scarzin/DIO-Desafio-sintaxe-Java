import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o numero da agencia da conta:");
            String agencia = scanner.next();

            System.out.println("Digite o nome do titular da conta:");
            String nomeCliente = scanner.next();

            System.out.println("Qual o deposito inicial?");
            double saldo = scanner.nextDouble();

            String retorno = String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de %s reais já está disponível para saque.",
                    nomeCliente, numeroConta, agencia, saldo);

            System.out.println(retorno);
        } catch (Exception e) {
            System.out.println("Erro ao criar conta: " + e.getMessage());
        }
    }
}
