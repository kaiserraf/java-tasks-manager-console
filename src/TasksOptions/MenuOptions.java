package TasksOptions;

import Objects.Task;
import java.util.List;
import java.util.Scanner;

public class MenuOptions {
    public static Scanner sIn = new Scanner(System.in);

    public static void createTask() {
        System.out.println("ID DA TAREFA: ");
        int id = sIn.nextInt();
        sIn.nextLine();

        System.out.println("DIGITE QUAL A TAREFA: ");
        String taskName = sIn.nextLine();

        System.out.println("DIGITE QUANTOS DIAS VOCÊ TEM PARA ESSA TAREFA: ");
        int timeToTask = sIn.nextInt();
        sIn.nextLine();

        TreatingData.createTaskTreating(id, taskName, timeToTask);
    }
    public static void readTasks(){
        List<Task> tasksRead = TreatingData.readTaskTreating();

        System.out.println("ID | NOME | CRIADO EM | TEMPO PARA TASK | DATA FINAL");
        for (var task : tasksRead){
            String createdAt = task.getCreatedDate().toString();
            String finalDate = task.getFinalDate().toString();
            System.out.printf("%d | %s | %s | %d DIAS | %s \n",
                    task.getId(),
                    task.getName(),
                    createdAt,
                    task.getTimeToTask(),
                    finalDate
            );
        }
    }

    public static void updateTaskById(){
        System.out.println("DIGITE O ID DA TAREFA: ");
        int idTask = sIn.nextInt();
        sIn.nextLine();

        System.out.println("digite ENTER para não editar");
        System.out.println("DIGITE NOVO NOME PRA TAREFA: ");
        String newTaskName = sIn.nextLine();

        System.out.println("DIGITE NOVA QUANTIDADE DE DIAS PARA TAREFA: ");
        int newTimeToTask = sIn.nextInt();
        sIn.nextLine();

        TreatingData.updateTaskTreating(idTask, newTaskName, newTimeToTask);
    }
    public static void deleteTaskById(){
        System.out.println("DIGITE O ID DA TAREFA");
        int idTask = sIn.nextInt();
        sIn.nextLine();

        System.out.println("VOCÊ TEM CERTEZA QUE DESEJA EXCLUIR? (s/n)");
        String response = sIn.nextLine().toUpperCase();

        if(response.equals("S")) TreatingData.deleteTaskTreating(idTask);
        else System.out.println("Você não irá deletar a tarefa...");
    }
}
