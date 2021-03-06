package pl.coderslab.charity.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
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
  @ManyToMany
  //@JoinColumn(name = "donation_id")
  private Set<Category> categories = new HashSet<>();
  @ManyToOne(fetch = FetchType.LAZY)
  Institution institution;
  private String street;
  private String city;
  private String zipCode;
  //@Pattern(regexp = "(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
  private String phone;
  @Column(nullable= false)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate pickUpDate;
  @Column(nullable= false)
  private LocalTime pickUpTime;
  @Column(columnDefinition="TEXT")
  private String pickUpComment;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Set<Category> getCategories() {
    return categories;
  }

  public void setCategories(Set<Category> categories) {
    this.categories = categories;
  }

  public Institution getInstitution() {
    return institution;
  }

  public void setInstitution(Institution institution) {
    this.institution = institution;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getPhone() { return phone; }

  public void setPhone(String phone) { this.phone = phone; }

  public LocalDate getPickUpDate() {
    return pickUpDate;
  }

  public void setPickUpDate(LocalDate pickUpDate) {
    this.pickUpDate = pickUpDate;
  }

  public LocalTime getPickUpTime() {
    return pickUpTime;
  }

  public void setPickUpTime(LocalTime pickUpTime) {
    this.pickUpTime = pickUpTime;
  }

  public String getPickUpComment() {
    return pickUpComment;
  }

  public void setPickUpComment(String pickUpComment) {
    this.pickUpComment = pickUpComment;
  }

  @Override
  public String toString() {
    return "Donation{" +
      "id=" + id +
      ", quantity=" + quantity +
      ", categories=" + categories +
      ", institution=" + institution +
      ", street='" + street + '\'' +
      ", city='" + city + '\'' +
      ", zipCode='" + zipCode + '\'' +
      ", pickUpDate=" + pickUpDate +
      ", pickUpTime=" + pickUpTime +
      ", pickUpComment='" + pickUpComment + '\'' +
      '}';
  }

}

