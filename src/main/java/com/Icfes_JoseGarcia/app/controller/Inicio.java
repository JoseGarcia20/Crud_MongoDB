package com.Icfes_JoseGarcia.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Icfes_JoseGarcia.app.entity.Coordinador;
import com.Icfes_JoseGarcia.app.entity.Estudiante;
import com.Icfes_JoseGarcia.app.repository.CoordinadorRepository;
import com.Icfes_JoseGarcia.app.repository.EstudiantesRepository;

@Controller
public class Inicio {
	
	@Autowired
	private EstudiantesRepository estudiantesRepository;
	private CoordinadorRepository coordinadorRepostory;

	@GetMapping({"/index","/"})
	public String inicio() {
		return "index";
	}
	
	@GetMapping("/loginEstudiantes")
	public String loginEstudiante(Model model, @ModelAttribute Estudiante estudiante) {
		model.addAttribute("estudiante", estudiante);
		return "loginEstudiantes";
	}
	
	@PostMapping("/loginEstudiantes")
	public String loginEstudiantes(@ModelAttribute Estudiante estudiante) {
		
		for(Estudiante item :estudiantesRepository.findAll()) {
			if(item.getCorreo().equals(estudiante.getCorreo())) {
				if(item.getClave().equals(estudiante.getClave())) {
					return "redirect:/estudiantes/mostrar/" + item.getId();
				}
			}
		}
		return "redirect:/loginEstudiantes";
	}
	
	@GetMapping("/loginCoordinador")
	public String loginCoordinador(Model model, @ModelAttribute Coordinador coordinador) {
		model.addAttribute("coordinador", coordinador);
		return "loginCoordinador";
	}
	
	@PostMapping("/loginCoordinador")
	public String loginCoordinador(@ModelAttribute Coordinador coordi) {
		
		if(coordi.getCorreo().equals("ggg@gmail.com")) {
			if(coordi.getClave().equals("34567")) {
				return "redirect:/coordinador/";
			}
		}
	return "redirect:/loginCoordinador";
}

}
