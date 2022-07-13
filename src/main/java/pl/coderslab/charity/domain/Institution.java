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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Institution{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}
