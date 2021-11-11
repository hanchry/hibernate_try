import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity(name = "client")
@Table(name="client_table")
public class Client
{
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
