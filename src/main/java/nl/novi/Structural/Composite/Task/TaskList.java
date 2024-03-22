package nl.novi.Structural.Composite.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{
    String title;
    List<Task> tasks;

    public TaskList(String title){
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Task List: " + title);
        for(Task task : tasks){
            task.display();
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
