package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class UniformController {
  @FXML
  Button Next, Home, poloM1, poloF2, poloM3, poloF4, poloM5, poloF6, poloM7, poloF8;

  @FXML
  UniformLastController uniformLastController = null;

  @FXML
  FXMLLoader loader;

   @FXML
   private Stage stage;

  @FXML
  private Parent root = null;

        public void buy(ActionEvent event) throws IOException {   

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(poloM1)) {
            LoginController.unifTradM.setProductStatus(true);
            LoginController.unifTradM.setProductQuantity(1);
            
        }

        else if (sourceButton == poloF2) {
           LoginController.unifTradF.setProductStatus(true);
           LoginController.unifTradF.setProductQuantity(1);
            
        }

        else if (sourceButton == poloM3) {
            LoginController.unifTourM.setProductStatus(true);
            LoginController.unifTourM.setProductQuantity(1);
        }

        else if (sourceButton == poloF4) {
            LoginController.unifTourF.setProductStatus(true);
            LoginController.unifTourF.setProductQuantity(1);

        }

        else if (sourceButton == poloM5) {
            LoginController.unifDentHygM.setProductStatus(true);
            LoginController.unifDentHygM.setProductQuantity(1);

        }

        else if (sourceButton == poloF6) {
            LoginController.unifDentHygM.setProductStatus(true);
            LoginController.unifDentHygM.setProductQuantity(1);

        }
        else if (sourceButton == poloF8) {
            LoginController.unifDentLabF.setProductStatus(true);
            LoginController.unifDentLabF.setProductQuantity(1);

        }
        else if (sourceButton == poloM7) {
            LoginController.unifDentLabM.setProductStatus(true);
            LoginController.unifDentLabM.setProductQuantity(1);

        }

    }

        public void gotoHome(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
            public void NextOne(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/UniformNXT.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }

    
    
}

