package com.example.demo.skill;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository
    extends MongoRepository<SkillSchema, Integer> {
}