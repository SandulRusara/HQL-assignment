package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent nood= FXMLLoader.load(getClass().getResource("/view/dashbordForm.fxml"));
        Scene scene = new Scene(nood);
        stage.setScene(scene);
        stage.show();
    }
}