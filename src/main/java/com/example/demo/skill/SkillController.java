package com.example.demo.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {

  @Autowired
  private SkillRepository repository;

  @PostMapping("/skills")
  public String saveBook(@RequestBody SkillSchema skill) {
    repository.save(skill);

    return "Added Successfully";
  }

}
