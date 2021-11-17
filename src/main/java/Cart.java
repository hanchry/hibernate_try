import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="CART")
public class Cart {

  //...
  @Id
  @Column(name = "id")
  private int id;

  @OneToMany(mappedBy="cart")
  private Set<Items> items;

  // getters and setters
}
