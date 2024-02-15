package lk.ijse.dao;

import lk.ijse.confi.FactoryConfiguration;
import lk.ijse.entity.Author;
import org.hibernate.Session;

import java.util.List;

public class AuthorDaoImpl {
    public List<Author> getAllAuthor(){
        Session session = FactoryConfiguration.getInstance().getSession();
        List<Author> resultList = session.createQuery("from Author ").getResultList();
        return resultList;
    }
}
