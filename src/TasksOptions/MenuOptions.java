package TasksOptions;

import java.util.Scanner;

public class MenuOptions {
    public static Scanner sIn = new Scanner(System.in);

    public static void createTask(){
        System.out.println("DIGITE QUAL A TAREFA: ");
        String taskName = sIn.nextLine();

        System.out.println("DIGITE QUANTOS DIAS VOCÊ TEM PARA ESSA TAREFA: ");
        int timeToTask = sIn.nextInt();
        sIn.nextLine();

        TreatingData.createTaskTreating(taskName, timeToTask);
    }
    public static void readTasks(){

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

        TreatingData.updateTaskTreating(idTask);
    }
    public static void deleteTaskById(){

    }
}
