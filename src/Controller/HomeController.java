package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController  {
  @FXML
  ImageView UnifLogo, ApparelsLogo, BooksLogo, AccesorieLogo, BulldogLogo;

  @FXML
  Button BOOKS, ACCESORIES, UNIFORMS, APPARELS, MyCart;

   @FXML
    private Stage stage;

  @FXML
    private Scene scene;

  @FXML
    private Parent root = null;

  @FXML
    HomeController checkoutController = null;

    FXMLLoader loader;
    public void Choose(ActionEvent event) throws IOException {    

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(UNIFORMS)) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/uniform.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        
        }

        else if (sourceButton == BOOKS) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Books.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else if (sourceButton == APPARELS) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Apparels.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if (sourceButton == ACCESORIES) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Accessories.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}


    

