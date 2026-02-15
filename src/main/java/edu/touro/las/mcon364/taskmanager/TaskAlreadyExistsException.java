package edu.touro.las.mcon364.taskmanager;

public class TaskAlreadyExistsException extends RuntimeException{
    public TaskAlreadyExistsException(TaskRegistry registry, String name) {
        super("Task with name " + name + " is already on " + registry);
    }

}
