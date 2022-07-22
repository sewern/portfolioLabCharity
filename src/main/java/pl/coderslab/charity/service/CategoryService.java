package pl.coderslab.charity.service;


import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.repository.CategoryRepo;

import java.util.Set;

@Service
public class CategoryService {
  private final CategoryRepo categoryRepo;

  public CategoryService(CategoryRepo categoryRepo) {
    this.categoryRepo = categoryRepo;
  }

  public Set<Category> getCategories() {
    return categoryRepo.findAllSet();
  }
}
