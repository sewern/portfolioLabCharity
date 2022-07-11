package pl.coderslab.charity.domain;

import javax.persistence.*;

// Encja ta reprezentuje dane znajdujące się w aplikacji, np.
// name: ubrania, zabawki
@Entity
@Table(name= "categories")
public class Category {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  @Column(length= 100, nullable= false)
  private String name;
}
