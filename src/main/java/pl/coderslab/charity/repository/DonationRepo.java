package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.domain.Donation;

import javax.persistence.Tuple;

public interface DonationRepo extends JpaRepository<Donation, Long> {
  @Query("select coalesce(sum(d.quantity), 0), count(d) from Donation d")
  //public Object[] getStats();
  public Tuple getStats();
}
