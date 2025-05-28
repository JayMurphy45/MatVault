package com.bjj.bjjbackend.controller;

import com.bjj.bjjbackend.model.Technique;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/techniques") // Base URL for the techniques API
@CrossOrigin(origins = "*") // Allow requests from frontend
public class TechniqueController {

    private final List<Technique> techniques = new ArrayList<>();

    @PostMapping
    public Technique addTechnique(@RequestBody Technique technique) {
        techniques.add(technique);
        return technique;
    }

    @GetMapping
    public List<Technique> getAllTechniques() {
        return techniques;
    }
}