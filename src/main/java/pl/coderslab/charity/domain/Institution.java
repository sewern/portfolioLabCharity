package pl.coderslab.charity.domain;

import javax.persistence.*;

// Encja ta reprezentuje dane znajdujące się w aplikacji, np:
// name : Fundacja “Bez domu”
// description : Cel i misja: Pomoc dla osób nie posiadających miejsca zamieszkania
@Entity
@Table(name= "institutions")
public class Institution {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  @Column(length= 100, nullable= false)
  private String name;
  @Column(columnDefinition="TEXT")
  private String description;
}
