package lk.ijse.controller;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lk.ijse.bo.BookBoImpl;
import lk.ijse.confi.FactoryConfiguration;
import lk.ijse.dto.BookDTO;
import org.hibernate.Session;

import java.util.ArrayList;

public class dashbordFormController {

    @FXML
    private JFXTextArea txtArea;
    BookBoImpl bookBo = new BookBoImpl();

    @FXML
    void btn1OnAction(ActionEvent event) {
        ArrayList<BookDTO> books = bookBo.getBooks();
        for (BookDTO b : books) {
            txtArea.appendText(b+"\n");
        }
    }

    @FXML
    void btn2OnAction(ActionEvent event) {

    }

    @FXML
    void btn3OnAction(ActionEvent event) {

    }

    @FXML
    void btn4OnAction(ActionEvent event) {

    }

    @FXML
    void btn5OnAction(ActionEvent event) {

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

}
