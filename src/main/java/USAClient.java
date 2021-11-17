import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Entity
@Table(name = "USA_client_table")
public class USAClient extends Client
{
  @Column(name = "country")
  private String country;

//  @OneToMany
//  private Collection<Items> items = new ArrayList<Items>();
  @OneToMany(mappedBy="usaclient")
  private Set<Items> items;

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }
}
