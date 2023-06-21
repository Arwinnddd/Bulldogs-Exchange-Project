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

public class ApparelsController {
  @FXML
  Button Home, hoodie, nusgPM, nusgPF, nuTee, nuTeeB, nuTeeDB, nuTeeBl;
  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;
  public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        if (sourceButton.equals(hoodie)) {
            LoginController.hoodie.setProductStatus(true);
            LoginController.hoodie.setProductQuantity(1);
            
        }

        else if (sourceButton == nusgPM) {
           LoginController.nusgPoloMale.setProductStatus(true);
           LoginController.nusgPoloMale.setProductQuantity(1);
            
        }

        else if (sourceButton == nusgPF) {
           LoginController.nusgPoloFemale.setProductStatus(true);
           LoginController.nusgPoloFemale.setProductQuantity(1);
            
        }

        else if (sourceButton == nuTee) {
           LoginController.bulldogsTeeN.setProductStatus(true);
           LoginController.bulldogsTeeN.setProductQuantity(1);
            
        }

        else if (sourceButton == nuTeeB) {
           LoginController.bulldogsTeeBlue.setProductStatus(true);
           LoginController.bulldogsTeeBlue.setProductQuantity(1);
            
        }

        else if (sourceButton == nuTeeDB) {
           LoginController.bulldogsTeeDB.setProductStatus(true);
           LoginController.bulldogsTeeDB.setProductQuantity(1);
            
        }

        else if (sourceButton == nuTeeBl) {
           LoginController.bulldogsTeeBlack.setProductStatus(true);
           LoginController.bulldogsTeeBlack.setProductQuantity(1);
            
        }
  }

  
    ApparelsController aparelsController = null;
            public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
}


