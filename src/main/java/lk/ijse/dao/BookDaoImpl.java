package lk.ijse.dao;

import lk.ijse.confi.FactoryConfiguration;
import lk.ijse.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class BookDaoImpl {
    public List<Book> getAllBooks(){
        Session session = FactoryConfiguration.getInstance().getSession();
        Query query = session.createQuery("from Book b where b.publicationYear > :Year");
        query.setParameter("Year",2010);
        return query.getResultList();
    }

    public boolean q2(int id){
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        int rowCount=0;
        List<Book> resultList = session.createQuery("from Book ").getResultList();
        Query query = session.createQuery("update Book  b set b.price = :NewPrice where b.id = :ID");
        for (Book b :  resultList){
            if (b.getAuthor().getId() == id){
                double old = b.getPrice();
                double newp = old+((old/100)*10);
                query.setParameter("NewPrice", newp);
                query.setParameter("ID", b.getId());
                rowCount = query.executeUpdate();
            }
        }
        transaction.commit();
        return rowCount > 0 ;
    }
   public List<Book> getBook(){
       Session session = FactoryConfiguration.getInstance().getSession();
       List<Book> resultList = session.createQuery("from  Book ").getResultList();
       return resultList;
   }
}

