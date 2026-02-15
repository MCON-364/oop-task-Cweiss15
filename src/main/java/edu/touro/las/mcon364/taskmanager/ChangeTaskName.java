package edu.touro.las.mcon364.taskmanager;

public final class ChangeTaskName implements Command {
    private final TaskRegistry registry;
    private final String oldName;
    private final String newName;
    public ChangeTaskName(TaskRegistry registry, String oldName, String newName) {
        this.registry = registry;
        this.oldName = oldName;
        this.newName = newName;
    }

    public void execute() {
        Task existing = registry.get(oldName)
                .orElseThrow(() -> new TaskNotFoundException(oldName));
        Priority priority = existing.priority();
        // Create a new task with updated name (tasks are immutable)
        Task updated = new Task(newName, priority);
        registry.add(updated);  // This replaces the old task
    }
}
