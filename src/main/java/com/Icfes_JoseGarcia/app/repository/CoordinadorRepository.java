package com.Icfes_JoseGarcia.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Icfes_JoseGarcia.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String>{
}
