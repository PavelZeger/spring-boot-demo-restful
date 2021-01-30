package com.zeger.demorestful.controller;

import com.zeger.demorestful.entity.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavel Zeger
 * @implNote demo-restful
 * @since 30/01/2021
 */
@RestController
public class Controller {

    @GetMapping("/ping")
    public ResponseEntity main() {
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/task")
    public ResponseEntity task() {
        return ResponseEntity.ok(new Task(1l, "Send ping"));
    }
    
}
