package com.taskmanager.controller;

import com.taskmanager.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody Task task) {
        tasks.add(task);
        return "Task added";
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable int id, @RequestBody Task updatedTask) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setTitle(updatedTask.getTitle());
                t.setPriority(updatedTask.getPriority());
                t.setDeadline(updatedTask.getDeadline());
                return "Task updated";
            }
        }
        return "Task not found";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        tasks.removeIf(t -> t.getId() == id);
        return "Task deleted";
    }
}
