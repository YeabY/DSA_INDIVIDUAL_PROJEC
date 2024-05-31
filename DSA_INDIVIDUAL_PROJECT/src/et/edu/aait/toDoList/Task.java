package et.edu.aait.toDoList;

public class Task {
    private String title;
    private String description;
    private boolean taskCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        taskCompleted = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.taskCompleted;
    }

    public void markCompleted() {
        this.taskCompleted = true;
    }
}
