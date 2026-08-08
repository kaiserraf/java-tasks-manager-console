import Objects.Task;
import TasksOptions.MenuOptions;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sIn = new Scanner(System.in);

        while(true){
            System.out.println("BEM VINDO AO GERENCIADOR DE TAREFAS");

            System.out.println("1 - Nova Tarefa");
            System.out.println("2 - Ver Tarefas");
            System.out.println("3 - Editar Tarefa");
            System.out.println("4 - Deletar Tarefa");
            System.out.println("5 - Sair");

            System.out.println("SELECIONE UMA DAS OPÇÕES: ");
            int option = sIn.nextInt();

            switch (option){
                case 1: MenuOptions.createTask(); break;
                case 2: MenuOptions.readTasks(); break;
                case 3: MenuOptions.updateTaskById(); break;
                case 4: MenuOptions.deleteTaskById(); break;
                case 5: System.exit(0);
            }
        }
    }
}