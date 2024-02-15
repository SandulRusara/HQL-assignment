package lk.ijse.dao;

import lk.ijse.confi.FactoryConfiguration;
import lk.ijse.entity.Book;
import org.hibernate.Session;

import java.util.List;

public class BookDaoImpl {
    public List<Book> getAllBooks(){
        Session session = FactoryConfiguration.getInstance().getSession();
        List<Book> fromBook = session.createQuery("from Book where publicationYear>2010").getResultList();
        return fromBook;
    }
}

