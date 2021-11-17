import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "client")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="client_table")
public class Client
{
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(name = "name")
  private String name;


  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override public String toString()
  {
    return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
