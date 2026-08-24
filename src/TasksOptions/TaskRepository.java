package TasksOptions;
import Objects.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class TaskRepository {
    public static List<Task> tasksList = new ArrayList<>();


    public static Task createTaskRepository(Task task){
        tasksList.add(task);
        return task;
    }

    public static List<Task> readAllTasks(){
        return tasksList;
    }

    public static void updateTaskRepository(int id, String newName, int newTimeToTask){
        Optional<Task> taskOpt = tasksList.stream().filter(t -> t.getId() == id).findFirst();
        System.out.println(taskOpt);
    }

    public static void deleteTaskRepository(int id){

    }
}
