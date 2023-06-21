package Controller;

import java.io.IOException;
import alert.AlertMaker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BooksController {
  @FXML
  Button Home, anatomy, rleOne, rleTwo, rleThree, rleFour, biochem, taxonomy, pharmaBook;

  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;

  public void buy(ActionEvent event) throws IOException {
    AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(anatomy)) {
            LoginController.anatomy.setProductStatus(true);
            LoginController.anatomy.setProductQuantity(1);
            
        }

        else if (sourceButton == rleOne) {
           LoginController.rleOne.setProductStatus(true);
           LoginController.rleOne.setProductQuantity(1);
            
        }

        else if (sourceButton == rleTwo) {
           LoginController.rleTwo.setProductStatus(true);
           LoginController.rleTwo.setProductQuantity(1);
            
        }

        else if (sourceButton == rleThree) {
           LoginController.rleThree.setProductStatus(true);
           LoginController.rleThree.setProductQuantity(1);
            
        }

        else if (sourceButton == rleFour) {
           LoginController.rleFour.setProductStatus(true);
           LoginController.rleFour.setProductQuantity(1);
            
        }

        else if (sourceButton == biochem) {
           LoginController.biochem.setProductStatus(true);
           LoginController.biochem.setProductQuantity(1);
            
        }

        else if (sourceButton == taxonomy) {
           LoginController.taxonomy.setProductStatus(true);
           LoginController.taxonomy.setProductQuantity(1);
            
        }

        else if (sourceButton == pharmaBook) {
           LoginController.pharmaBook.setProductStatus(true);
           LoginController.pharmaBook.setProductQuantity(1);
            
        }
  }

    BooksController booksController = null;
            public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
}
