import javax.persistence.*;

@Entity
@Table(name="ITEMS")
public class Items {

  //...
  @Id
  @Column(name = "id")
  private int id;


  @ManyToOne
  @JoinColumn(name="cart_id", nullable=false)
  private Cart cart;

  @ManyToOne
  @JoinColumn(name="usaclient_id", nullable=false)
  private USAClient usaclient;

  public Items() {}

  // getters and setters
}
