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

public class UniformNextController {
  @FXML
  Button SecondToLast, SecondToFirst, Home, dentMedM, dentMedF, medTechM, medTechF, nursingM, nursingF, pharmaM, pharmaF;

    @FXML
  UniformNextController uniformNextController = null;

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
        if (sourceButton.equals(dentMedM)) {
            LoginController.unifMedicineM.setProductStatus(true);
            LoginController.unifMedicineM.setProductQuantity(1);
            
        }

        else if (sourceButton == dentMedF) {
           LoginController.unifMedicineF.setProductStatus(true);
           LoginController.unifMedicineF.setProductQuantity(1);
            
        }

        else if (sourceButton == medTechM) {
            LoginController.unifMedTechM.setProductStatus(true);
            LoginController.unifMedTechM.setProductQuantity(1);
        }

        else if (sourceButton == medTechF) {
            LoginController.unifMedTechF.setProductStatus(true);
            LoginController.unifMedTechF.setProductQuantity(1);

        }

        else if (sourceButton == nursingM) {
            LoginController.unifNursingM.setProductStatus(true);
            LoginController.unifNursingM.setProductQuantity(1);

        }

        else if (sourceButton == nursingF) {
            LoginController.unifNursingF.setProductStatus(true);
            LoginController.unifNursingF.setProductQuantity(1);

        }
        else if (sourceButton == pharmaM) {
            LoginController.unifPharmaM.setProductStatus(true);
            LoginController.unifPharmaM.setProductQuantity(1);

        }
        else if (sourceButton == pharmaF) {
            LoginController.unifPharmaF.setProductStatus(true);
            LoginController.unifPharmaF.setProductQuantity(1);

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
    
            public void gotoLast(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/uniformLAST.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }
        
            public void gotoFirst(ActionEvent event) throws IOException {
            loader = new FXMLLoader(getClass().getResource("/view/uniform.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    }

}
