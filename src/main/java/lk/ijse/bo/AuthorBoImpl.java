package lk.ijse.bo;

import lk.ijse.dao.AuthorDaoImpl;
import lk.ijse.entity.Author;

import java.util.List;

public class AuthorBoImpl {
    AuthorDaoImpl authorDao=new AuthorDaoImpl();

    public List<Author>getAllAuthor(){
        return authorDao.getAllAuthor();
    }
}
