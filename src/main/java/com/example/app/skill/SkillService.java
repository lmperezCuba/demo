package com.example.app.skill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

  @Autowired
  private SkillRepository repository;

  public String create(SkillSchema skill) {
    repository.save(skill);
    return "Added Successfully";
  }

  public List<SkillSchema> findAll() {
    return repository.findAll();
  }

  public String delete(String id) {
    repository.deleteById(id);
    return "Deleted Successfully";
  }
}
