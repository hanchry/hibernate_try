import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main
{
  public static void main(String[] args) throws ClassNotFoundException
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tryout");

    Client client = new Client();
    client.setName("bob");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();

    entityManager.persist(client);
    entityManager.getTransaction().commit();

    entityManagerFactory.close();
  }
}
