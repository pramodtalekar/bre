package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Agent")
public class Agent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int agentId;

  private String name;
}
