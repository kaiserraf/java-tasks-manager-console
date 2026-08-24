package Objects;

import java.time.LocalDate;

public class Task {
    private int idTask;
    private String taskName;
    private LocalDate createdDate;
    private LocalDate finalDate;
    private int timeToTask;

    public int getId() { return idTask; }
    public void setId(int id){ this.idTask = id; }

    public String getName(){ return taskName; }
    public void setName(String taskName){
        if(taskName == null || taskName.isBlank()) throw new IllegalArgumentException("nome não pode ser vazio");
        this.taskName = taskName;
    }

    public LocalDate getCreatedDate(){ return createdDate; }
    public void setCreatedDate(LocalDate createdDate){ this.createdDate = createdDate; }

    public LocalDate getFinalDate() { return finalDate; }
    public void setFinalDate(LocalDate finalDate){ this.finalDate = finalDate; }

    public int getTimeToTask(){ return timeToTask; }
    public void setTimeToTask(int daysToTask){ this.timeToTask = daysToTask; }
    
}
