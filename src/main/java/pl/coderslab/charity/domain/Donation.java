package pl.coderslab.charity.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "donations")
public class Donation {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;
  // liczba worków
  private Integer quantity;
  // lista obiektów typu Category
  @OneToMany
  @JoinColumn(name = "donation_id")
  private Set<Category> categories = new HashSet<>();
  @ManyToOne(fetch = FetchType.LAZY)
  Institution institution;
  private String street;
  private String city;
  private String zipCode;
  @Column(nullable= false)
  private LocalDate pickUpDate;
  @Column(nullable= false)
  private LocalTime pickUpTime;
  @Column(columnDefinition="TEXT")
  private String pickUpComment;
}

