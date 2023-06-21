package Controller;

import java.io.IOException;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class UniformLastController {
  @FXML
  Button lastToSecond, Home, PoloPsycM, PoloPsycF;

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
        if (sourceButton.equals(PoloPsycM)) {
            LoginController.unifPsychM.setProductStatus(true);
            LoginController.unifPsychM.setProductQuantity(1);
            
        }

        else if (sourceButton == PoloPsycF) {
           LoginController.unifPsychF.setProductStatus(true);
           LoginController.unifPsychF.setProductQuantity(1);
            
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
            public void gotoSecond(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/uniformNXT.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }

}
