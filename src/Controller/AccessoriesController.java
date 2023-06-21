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

public class AccessoriesController {
  
  @FXML
  Button Home, bagTag, windB, capG, laceB, laceG, laceBG;
  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;

  public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(bagTag)) {
            LoginController.bagTag.setProductStatus(true);
            LoginController.bagTag.setProductQuantity(1);
            
        }

        else if (sourceButton == windB) {
           LoginController.windbreaker.setProductStatus(true);
           LoginController.windbreaker.setProductQuantity(1);
            
        }

        else if (sourceButton == capG) {
           LoginController.capGold.setProductStatus(true);
           LoginController.capGold.setProductQuantity(1);
            
        }

        else if (sourceButton == laceB) {
           LoginController.bluelace.setProductStatus(true);
           LoginController.bluelace.setProductQuantity(1);
            
        }

        else if (sourceButton == laceG) {
           LoginController.goldLace.setProductStatus(true);
           LoginController.goldLace.setProductQuantity(1);
            
        }

        else if (sourceButton == laceBG) {
           LoginController.bgLace.setProductStatus(true);
           LoginController.bgLace.setProductQuantity(1);
            
        }
  }

  
    AccessoriesController accessoriesController = null;
            public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
}

