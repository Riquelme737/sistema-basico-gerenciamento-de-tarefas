import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sistema {

    public static void sistema(Scanner scanner) {
        boolean flag = true;
        while (flag) {
            Menu.principal();
            try {

                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Qual tarefa deseja adicionar? ");
                        String tarefa = scanner.nextLine();
                        Tarefa.adicionarTarefa(tarefa);
                        break;
                    case 2:
                        System.out.println("As suas tarefas são: ");
                        Tarefa.listarTarefas();
                        break;
                    case 3:
                        System.out.println("Escolha pelo número a qual a sua tarefa pertence");
                        int numero = scanner.nextInt();
                        scanner.nextLine();
                        Tarefa.removeTarefas(numero);
                        break;
                    case 9:
                        System.out.println("Encerrando o gerenciador ...");
                        encerrarPrograma();
                        flag = false;
                    default:
                        throw new IllegalArgumentException("Escolha um número da tabela.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número da tabela.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        }
    }

    public static void encerrarPrograma() {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Obrigado pelo uso!");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Erro ao encerrar o programa.");
        }
    }
}
