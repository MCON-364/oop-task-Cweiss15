package edu.touro.las.mcon364.taskmanager;

import java.util.*;

public class TaskRegistry {
    private final Map<String, Task> tasks = new HashMap<>();

    public void add(Task task) {
        if (tasks.containsKey(task.name()))
            throw new TaskAlreadyExistsException(this, task.name());
        tasks.put(task.name(), task);
    }

    public Optional<Task> get(String name) {
        return Optional.ofNullable(tasks.get(name));
    }

    public void remove(String name) {
        tasks.remove(name);
    }

    public Map<String, Task> getAll() {
        return tasks;
    }

    public Map<Priority, List<Task>> getTasksByPriority() {
        Map<Priority, List<Task>> map = new HashMap<>();
        for (Task task: tasks.values()) {
            if(!map.containsKey(task.priority())) {
                map.put(task.priority(), new ArrayList());
                map.get(task.priority()).add(task); }
            else
                map.get(task.priority()).add(task);

        }
        return map;
    }
}
