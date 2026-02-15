package edu.touro.las.mcon364.taskmanager;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String task) {
        super("Task not found: " + task);
    }

}
