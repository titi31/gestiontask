package co.simplon.gestiontask.controller;

import co.simplon.gestiontask.dao.TaskRepository;
import co.simplon.gestiontask.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TaskRestController {
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping(value="/tasks")
    public List<Task> listTasks(){
        return taskRepository.findAll();
    }
    @PostMapping(value="/tasks")
    public Task save(Task t){
        return taskRepository.save(t);
    }
}
