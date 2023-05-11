package com.Icfes_JoseGarcia.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Icfes_JoseGarcia.app.entity.Estudiante;
import com.Icfes_JoseGarcia.app.exception.NotFoundException;
import com.Icfes_JoseGarcia.app.repository.EstudiantesRepository;


@Controller
public class EstudiantesTemplatesController {
	
    @Autowired
    private EstudiantesRepository estudiantesRepository;

    @GetMapping("/coordinador/")
    public String mostrarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudiantesRepository.findAll());
        return "coordinador";
    }

    @GetMapping("/coordinador/nuevoEstudiante")
    public String nuevoeEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "ingresarEstudiante";
    }

    @GetMapping("/coordinador/edit/{id}")
    public String editarEstudiante(@PathVariable("id") String id, Model model) {
        model.addAttribute("estudiante", estudiantesRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
        return "ingresarEstudiante";
    }
    
    @GetMapping("/coordinador/mostrar/{id}")
    public String mostrarEstudianteg(@PathVariable("id") String id, Model model) {
        model.addAttribute("estudiante", estudiantesRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
        return "estudiantes";
    }
    
    @GetMapping("/estudiantes/mostrar/{id}")
    public String mostrarEstudiantes(@PathVariable("id") String id, Model model) {
        model.addAttribute("estudiante", estudiantesRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
        return "mostrarEstudiantes";
    }

    @PostMapping("/coordinador/guardar")
    public String estudianteGuardarProcess(@ModelAttribute("estudiante") Estudiante estudiante) {
        if (estudiante.getId().isEmpty()) {
        	estudiante.setId(null);
        }
        estudiantesRepository.save(estudiante);
        return "redirect:/coordinador/";
    }

    @GetMapping("/coordinador/eliminar/{id}")
    public String eliminarEstudianteProcess(@PathVariable("id") String id) {
    	estudiantesRepository.deleteById(id);
        return "redirect:/coordinador/";
    }
}
