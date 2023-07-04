package Main;

import Controller.LoginController;
import Controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

public class Rongsokin extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stg = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Login.fxml"));
        AnchorPane root = loader.load();
        LoginController controller = loader.getController();

        // Mengatur aksi tombol login untuk pindah ke halaman berikutnya
        

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
