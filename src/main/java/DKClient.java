import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DK_client_table")
public class DKClient extends Client
{
  @Column(name = "state")
  private String state;

  //  @OneToMany(mappedBy="client")
  //  private Set<Items> items;

  public String getState()
  {
    return state;
  }

  public void setState(String country)
  {
    this.state = country;
  }
}