package edu.touro.las.mcon364.taskmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {

    private final TaskRegistry registry;

    public TaskManager(TaskRegistry registry) {
        this.registry = registry;
    }

    public void run(Command command) {
        switch(command) {
            case AddTaskCommand add -> add.execute();
            case RemoveTaskCommand remove -> remove.execute();
            case UpdateTaskCommand update -> update.execute();
            case ChangeTaskName updateName -> updateName.execute();
    }
    }
}
