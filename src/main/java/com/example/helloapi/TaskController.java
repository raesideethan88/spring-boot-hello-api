package com.example.helloapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/add")
    public Task addTask(@RequestParam String desc) {
        Task newTask = new Task();
        newTask.setDescription(desc);
        newTask.setCompleted(false);
        return repository.save(newTask);
    }

    @GetMapping
    public List<Task> getTasks() {
        return repository.findAll();
    }
}