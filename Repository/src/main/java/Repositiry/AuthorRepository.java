package Repositiry;

import Utils.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorRepository extends GenericRepository {

    private EntityManagerFactory managerFactory;
    private EntityManager entityManager;

    public AuthorRepository(){
        managerFactory = Persistence.createEntityManagerFactory("webLibrary");
        entityManager = EntityManagerSingleton.getInstance().getEntityManager();
    }

}
