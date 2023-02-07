package com.example.app.skill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class SkillController {

  @Autowired
  private SkillService skillService;

  @PostMapping("/skills")
  public String create(@RequestBody SkillSchema skill) {
    System.out.println(skill);
    skillService.create(skill);
    return "Added Successfully";
  }

  @GetMapping("/skills")
  public List<SkillSchema> findAll() {
    return skillService.findAll();
  }

  @DeleteMapping("/skills/{id}")
  public String delete(@PathVariable String id) {
    skillService.delete(id);
    return "Deleted Successfully";
  }
}
