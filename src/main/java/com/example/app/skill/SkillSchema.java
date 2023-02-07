package com.example.app.skill;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "skills")
public class SkillSchema {
  
  @Id
  private String id;

  @NotBlank
  @Size(max = 10)
  @Indexed(unique = true)
  private String name;

  private String description;

  private Date createdAt = new Date();

  private Date updatedAt = new Date();

  private int version;
}
