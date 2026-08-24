import TasksOptions.MenuOptions;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try {
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
                    case 1 -> MenuOptions.createTask();
                    case 2 -> MenuOptions.readTasks();
                    case 3 -> MenuOptions.updateTaskById();
                    case 4 -> MenuOptions.deleteTaskById();
                    case 5 -> System.exit(0);
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}