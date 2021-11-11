import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main
{
  public static void main(String[] args) throws ClassNotFoundException
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tryout");

    Client client = new Client();
    client.setName("bob");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

//    entityManager.persist(client);
//
//    entityManager.getTransaction().commit();
    Client emp = entityManager.find(Client.class, 1);
    System.out.println(emp.getName());
    List<Client> c = entityManager.createQuery("SELECT c FROM client c").getResultList();
    System.out.println(c);
    //System.out.println(c);

    entityManagerFactory.close();
  }
}
