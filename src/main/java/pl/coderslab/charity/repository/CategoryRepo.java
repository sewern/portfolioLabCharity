package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.domain.Category;

import java.util.Set;

public interface CategoryRepo extends JpaRepository<Category, Long> {
  @Query("select c from Category c")
  public Set<Category> findAllSet();
}
