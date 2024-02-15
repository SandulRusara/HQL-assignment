package lk.ijse.controller;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.text.Font;
import lk.ijse.bo.AuthorBoImpl;
import lk.ijse.bo.BookBoImpl;
import lk.ijse.confi.FactoryConfiguration;
import lk.ijse.dto.BookDTO;
import lk.ijse.entity.Author;
import org.hibernate.Session;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class dashbordFormController implements Initializable {

    @FXML
    private JFXTextArea txtArea;
    BookBoImpl bookBo = new BookBoImpl();
    AuthorBoImpl authorBo=new AuthorBoImpl();

    @FXML
    void btn1OnAction(ActionEvent event) {
        ArrayList<BookDTO> books = bookBo.getBooks();
        for (BookDTO b : books) {
            txtArea.appendText(b+"\n");
        }
    }

    @FXML
    void btn2OnAction(ActionEvent event) {
        txtArea.clear();
        boolean b = bookBo.q2(1);
        if(b){
            txtArea.appendText("update values");
        }else {
            new Alert(Alert.AlertType.ERROR,"cant update values");
        }
    }

    @FXML
    void btn3OnAction(ActionEvent event) {

    }

    @FXML
    void btn4OnAction(ActionEvent event) {
        txtArea.clear();
        ArrayList<Double> arrayList = bookBo.getBookPrice();
        int x=arrayList.size();
        int total=0;
        for (int i = 0; i <arrayList.size(); i++) {
            total+=arrayList.get(i);
        }
        txtArea.appendText("Average "+(total/x));
    }

    @FXML
    void btn5OnAction(ActionEvent event) {
        txtArea.clear();
        List<Author> allAuthor = authorBo.getAllAuthor();
        for (int i = 0; i <allAuthor.size(); i++) {
            txtArea.appendText(allAuthor.get(i).getName() +" -- "+ allAuthor.get(i).getBooks().size()+"\n");
        }
    }

    @FXML
    void btn6OnAction(ActionEvent event) {

    }

    @FXML
    void btn7OnAction(ActionEvent event) {

    }

    @FXML
    void btn8OnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtArea.setFont(Font.font(15));
    }
}
