package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.IStats;
import pl.coderslab.charity.domain.Stats;
import javax.persistence.Tuple;

public interface DonationRepo extends JpaRepository<Donation, Long> {
  @Query("select coalesce(sum(d.quantity), 0), count(d) from Donation d")
  public Object getStatsAsObj();

  @Query("select coalesce(sum(d.quantity), 0), count(d) from Donation d")
  public Tuple getStatsAsTuple();

  @Query("select coalesce(sum(d.quantity), 0) as quantity, count(d) as count from Donation d")
  public IStats getStatsAsIntf();

  @Query("select new pl.coderslab.charity.domain.Stats(coalesce(sum(d.quantity), 0), count(d)) from Donation d")
  public Stats getStatsAsClass();
}
