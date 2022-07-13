package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.repository.InstitutionRepo;

import java.util.List;

@Service
public class InstitutionService {
  private final InstitutionRepo institutionRepo;

  public InstitutionService(InstitutionRepo institutionRepo) {
    this.institutionRepo = institutionRepo;
  }

  public List<Institution> getInstitutions() {
    return institutionRepo.findAll();
  }
}
