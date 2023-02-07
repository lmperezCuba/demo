package com.example.app.skill;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository
    extends MongoRepository<SkillSchema, String> {

        List<SkillSchema> findByLastName(@Param("name") String name);

}