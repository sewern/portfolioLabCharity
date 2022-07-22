package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.IStats;
import pl.coderslab.charity.domain.Stats;
import pl.coderslab.charity.repository.DonationRepo;

import javax.persistence.Tuple;
import java.util.List;

@Service
public class DonationService {
  private final DonationRepo donationRepo;

  public DonationService(DonationRepo donationRepo) {
    this.donationRepo = donationRepo;
  }

  public int quantity() { return donationRepo.quantity(); }

  public long count() { return donationRepo.count(); }

  public Object[] getStatsAsObjArr() { return (Object[]) donationRepo.getStatsAsObj(); }

  public Tuple getStatsAsTuple() { return donationRepo.getStatsAsTuple(); }

  public IStats getStatsAsIntf() { return donationRepo.getStatsAsIntf(); }

  public Stats getStatsAsClass() { return donationRepo.getStatsAsClass(); }

}

