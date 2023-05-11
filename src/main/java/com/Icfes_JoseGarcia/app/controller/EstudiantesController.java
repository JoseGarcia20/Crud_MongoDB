package com.Icfes_JoseGarcia.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Icfes_JoseGarcia.app.entity.Estudiante;
import com.Icfes_JoseGarcia.app.exception.NotFoundException;
import com.Icfes_JoseGarcia.app.repository.EstudiantesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value = "/api/coordinador")
public class EstudiantesController {
    
	@Autowired
    private EstudiantesRepository estudiantesRepository;

    @GetMapping("/")
    public List<Estudiante> getAllEstudiantes() {
        return estudiantesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante getEstudiantesById(@PathVariable String id) {
        return estudiantesRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
    }

    @PostMapping("/")
    public Estudiante guardarEstudiante(@RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Estudiante estudiante = mapper.convertValue(body, Estudiante.class);
        return estudiantesRepository.save(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante updateEstudiante(@PathVariable String id, @RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Estudiante estudiante = mapper.convertValue(body, Estudiante.class);
        estudiante.setId(id);
        return estudiantesRepository.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public Estudiante eliminarEstudiante(@PathVariable String id) {
    	Estudiante estudiante = estudiantesRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
    	estudiantesRepository.deleteById(id);
        return estudiante;
    }
}
