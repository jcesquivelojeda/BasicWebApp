package tutorial.core.repositories.jpa;

import org.springframework.stereotype.Repository;
import tutorial.core.entities.Account;
import tutorial.core.entities.Blog;
import tutorial.core.repositories.AccountRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by nick on 2/09/15.
 */
@Repository
public class JpaAccountRepo implements AccountRepo{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Account findAccount(Long id) {
        return em.find(Account.class,id);
    }

    @Override
    public Account createAccount(Account data) {
        em.persist(data);
        return data;
    }

    @Override
    public Blog createBlog(Long accountId, Blog data) {
        return null;
    }
}
