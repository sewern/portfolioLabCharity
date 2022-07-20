package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.repository.DonationRepo;

import javax.persistence.Tuple;
import java.util.List;

@Service
public class DonationService {
  private final DonationRepo donationRepo;

  public DonationService(DonationRepo donationRepo) {
    this.donationRepo = donationRepo;
  }

  //public Object[] getStats() { return donationRepo.getStats(); }
  public Tuple getStats() { return donationRepo.getStats(); }
}

