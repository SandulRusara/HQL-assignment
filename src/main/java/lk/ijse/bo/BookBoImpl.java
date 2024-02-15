package lk.ijse.bo;

import lk.ijse.dao.BookDaoImpl;
import lk.ijse.dto.BookDTO;
import lk.ijse.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookBoImpl {
    BookDaoImpl bookDao = new BookDaoImpl();

    public ArrayList<BookDTO> getBooks(){
        List<Book> allBooks = bookDao.getAllBooks();
        ArrayList<BookDTO> bookDTOS = new ArrayList<>();
        for (Book b : allBooks) {
            bookDTOS.add(new BookDTO(b.getId(),b.getTitle(),b.getPublicationYear(),b.getPrice()));
        }

        return bookDTOS;

    }

   public boolean q2(int id){
        return bookDao.q2(id);
   }

   public ArrayList<Double> getBookPrice(){
       ArrayList<Double> arrayList = new ArrayList<>();
       List<Book> book = bookDao.getBook();
       for (Book b:book) {
         arrayList.add(b.getPrice());
       }
       return arrayList;
   }

}
