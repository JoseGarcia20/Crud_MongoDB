package com.Icfes_JoseGarcia.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Icfes_JoseGarcia.app.entity.Estudiante;

public interface EstudiantesRepository extends MongoRepository<Estudiante, String>{

}
