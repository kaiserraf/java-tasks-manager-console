package TasksOptions;
import Objects.Task;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import TasksOptions.TaskRepository;

public class TreatingData {
    public static Task t1 = new Task();

    public static void createTaskTreating(int id, String nameTask, int timeToTask){
        t1.setId(id);
        t1.setName(nameTask);
        t1.setCreatedDate(LocalDate.now());
        t1.setTimeToTask(timeToTask);
        LocalDate finalDate = t1.getCreatedDate().plusDays(t1.getTimeToTask());
        t1.setFinalDate(finalDate);
        TaskRepository.createTaskRepository(t1);
    }
    public static List<Task> readTaskTreating(){
        return TaskRepository.readAllTasks();
    }
    public static void updateTaskTreating(int id, String newName, int newTimeToTask){
        TaskRepository.updateTaskRepository(id, newName, newTimeToTask);
    }
    public static void deleteTaskTreating(int id){

    }
}
