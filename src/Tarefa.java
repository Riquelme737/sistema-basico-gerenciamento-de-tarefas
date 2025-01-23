import java.util.ArrayList;

public class Tarefa {
    private static final ArrayList<String>  tarefasArraylist = new ArrayList<>();

    public static void adicionarTarefa (String tarefa) {
        if (tarefa != null && !tarefa.trim().isEmpty()) {
            tarefasArraylist.add(tarefa);
            System.out.println("Tarefa adicionada com sucesso!");
        }
    }

    public static void listarTarefas() {
        if (tarefasArraylist.isEmpty()) {
            System.out.println("Não há nenhuma tarefa. Por favor adiciona-a!");
            return;
        }

        for (int i = 0; i < tarefasArraylist.size(); i++) {
            System.out.println((i + 1) + ". " + tarefasArraylist.get(i));
        }
    }

    public static void removeTarefas(int numero) {
        try {
            if (numero < 1 || numero > tarefasArraylist.size()) {
                throw new IndexOutOfBoundsException("Número de tarefa inválida.");
            }
            tarefasArraylist.remove(numero - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
