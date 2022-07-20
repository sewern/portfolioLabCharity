package pl.coderslab.charity.domain;

public class Stats {
  private Integer quantity;
  private Long count;

  //public Stats(Integer quantity, Long count) {
  public Stats(long quantity, long count) {
    this.quantity = (int) quantity;
    this.count = count;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public Long getCount() {
    return count;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public void setCount(Long count) {
    this.count = count;
  }
}
