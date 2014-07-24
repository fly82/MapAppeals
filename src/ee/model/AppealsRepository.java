package ee.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppealsRepository {
    @Autowired HibernateOperations hibernate;

    public List<Appeals> getAll() {
        return hibernate.loadAll(Appeals.class);
    }
}
