package Controller;

import Item.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;


public class LoginController implements Initializable {
  @FXML
  TextField emailAddress;

  @FXML
  PasswordField passwordField;

  @FXML
  Button createAccount, signIn;

  @FXML
  Label Incorrect;

  @FXML
  Hyperlink ForgotPass;

  @FXML
  Text or;

  @FXML
  FXMLLoader loader;

  @FXML
  private Parent root = null;

  @FXML
  static Parent homeRoot = null;

  @FXML
  LoginController loginController = null;

    static Anatomy anatomy = new Anatomy();
    static BagTag bagTag = new BagTag();
    static BGLace bgLace = new BGLace();
    static Biochem biochem = new Biochem();
    static Bluelace bluelace = new Bluelace();
    static BulldogsTeeBlack bulldogsTeeBlack = new BulldogsTeeBlack();
    static BulldogsTeeBlue bulldogsTeeBlue = new BulldogsTeeBlue();
    static CapGold capGold = new CapGold();
    static CustomTee customTee = new CustomTee();
    static GoldLace goldLace = new GoldLace();
    static Hoodie hoodie = new Hoodie();
    static NUSGPoloFemale nusgPoloFemale = new NUSGPoloFemale();
    static NUSGPoloMale nusgPoloMale = new NUSGPoloMale();
    static PharmaBook pharmaBook = new PharmaBook();
    static RLEOne rleOne = new RLEOne();
    static RLETwo rleTwo = new RLETwo();
    static RLEThree rleThree = new RLEThree();
    static RLEFour rleFour = new RLEFour();
    static StickerPack stickerPack = new StickerPack();
    static Taxonomy taxonomy = new Taxonomy();
    static UnifDentHygF unifDentHygF = new UnifDentHygF();
    static UnifDentHygM unifDentHygM = new UnifDentHygM();
    static UnifDentLabF unifDentLabF = new UnifDentLabF();
    static UnifDentLabM unifDentLabM = new UnifDentLabM();
    static UnifMedicineF unifMedicineF = new UnifMedicineF();
    static UnifMedicineM unifMedicineM = new UnifMedicineM();
    static UnifMedTechF unifMedTechF = new UnifMedTechF();
    static UnifMedTechM unifMedTechM = new UnifMedTechM();
    static UnifNursingF unifNursingF = new UnifNursingF();
    static UnifNursingM unifNursingM = new UnifNursingM();
    static UnifPharmaF unifPharmaF = new UnifPharmaF();
    static UnifPharmaM unifPharmaM = new UnifPharmaM();
    static UnifPsychF unifPsychF = new UnifPsychF();
    static UnifPsychM unifPsychM = new UnifPsychM();
    static UnifTourF unifTourF = new UnifTourF();
    static UnifTourM unifTourM = new UnifTourM();
    static UnifTradF unifTradF = new UnifTradF();
    static UnifTradM unifTradM = new UnifTradM();
    static Windbreaker windbreaker = new Windbreaker();
    static BulldogsTeeN bulldogsTeeN = new BulldogsTeeN();
    static BulldogsTeeDB bulldogsTeeDB = new BulldogsTeeDB();

  @Override
    public void initialize(URL location, ResourceBundle resources) {

    // ---------------BOOKS----------------
        anatomy.setProductName("Human Anatomy & Psychology Laboratory Manual");
        anatomy.setProductPrice(1300.00);
        anatomy.setProductImage("images/HumanAnatomy.png");

        rleOne.setProductName("RLE Manual Level 1");
        rleOne.setProductPrice(1000.00);
        rleOne.setProductImage("images/RLELevel1.png");

        rleTwo.setProductName("RLE Manual Level 2");
        rleTwo.setProductPrice(1000.00);
        rleTwo.setProductImage("images/RLELevel2.png");

        rleThree.setProductName("RLE Manual Level 3");
        rleThree.setProductPrice(1300.00);
        rleThree.setProductImage("images/RLELevel3.png");

        rleFour.setProductName("RLE Manual Level 4");
        rleFour.setProductPrice(1300.00);
        rleFour.setProductImage("images/RLELevel4.png");

        biochem.setProductName("Biochemistry Laboratory Manual 1st Edition");
        biochem.setProductPrice(1300.00);
        biochem.setProductImage("images/BioChemManual.png");

        taxonomy.setProductName("Botany with Taxonomy Laboratory Manual 1st Edition");
        taxonomy.setProductPrice(1300.00);
        taxonomy.setProductImage("images/BotanyTaxonomy.png");

        pharmaBook.setProductName("Pharmaceutical Organic Medicinal Laboratory Manual");
        pharmaBook.setProductPrice(1300.00);
        pharmaBook.setProductImage("images/Pharmaceutical.png");

        
        // ---------------ACCESSORIES----------------
        bagTag.setProductName("Bag Tag");
        bagTag.setProductPrice(250.00);
        bagTag.setProductImage("images/bagTag.png");

        windbreaker.setProductName("NU Windbreaker");
        windbreaker.setProductPrice(1000.00);
        windbreaker.setProductImage("images/NUWindBreaker.png");

        capGold.setProductName("NU Cap Gold");
        capGold.setProductPrice(1300.00);
        capGold.setProductImage("images/NUCap.png");

        bluelace.setProductName("NU ID Lace (Blue)");
        bluelace.setProductPrice(1300.00);
        bluelace.setProductImage("images/IDLace1.png");

        goldLace.setProductName("NU ID Lace (Gold)");
        goldLace.setProductPrice(1300.00);
        goldLace.setProductImage("images/IDLace2.png");

        bgLace.setProductName("NU ID Lace (Blue/Gold)");
        bgLace.setProductPrice(1300.00);
        bgLace.setProductImage("images/IDLace3.png");


        // ---------------APPARELS----------------
        hoodie.setProductName("NU Hoddie");
        hoodie.setProductPrice(1000.00);
        hoodie.setProductImage("images/NUHoodie.png");

        nusgPoloMale.setProductName("NUSG Polo (for Male)");
        nusgPoloMale.setProductPrice(500.00);
        nusgPoloMale.setProductImage("images/PoloNU.jpg");

        nusgPoloFemale.setProductName("NUSG Polo (for Female)");
        nusgPoloFemale.setProductPrice(500.00);
        nusgPoloFemale.setProductImage("images/NUPolo.jpg");

        bulldogsTeeN.setProductName("Bulldogs Tee");
        bulldogsTeeN.setProductPrice(500.00);
        bulldogsTeeN.setProductImage("images/BULLDOGbigLogo.png");

        bulldogsTeeBlue.setProductName("NU Bulldogs Tee (Blue)");
        bulldogsTeeBlue.setProductPrice(500.00);
        bulldogsTeeBlue.setProductImage("images/NUBlueWhiteTee.png");

        bulldogsTeeDB.setProductName("NU Bulldogs Tee (Dark Blue)");
        bulldogsTeeDB.setProductPrice(500.00);
        bulldogsTeeDB.setProductImage("images/NUBulldogLogo.png");

        bulldogsTeeBlack.setProductName("NU Custom Tee (With Name at the back)");
        bulldogsTeeBlack.setProductPrice(800.00);
        bulldogsTeeBlack.setProductImage("images/NUCustomJersey.png");

        // ---------------UNIFORM----------------
        unifTradF.setProductName("Traditional Uniform (1 Set for Female)");
        unifTradF.setProductPrice(1000.00);
        unifTradF.setProductImage("images/TradUni.png");

        unifTradM.setProductName("Traditional Uniform (1 Set for Male)");
        unifTradM.setProductPrice(1000.00);
        unifTradM.setProductImage("images/TradUni.png");

        unifTourF.setProductName("Tourism Uniform (1 Set for Female)");
        unifTourF.setProductPrice(1300.00);
        unifTourF.setProductImage("images/TourUni.png");

        unifTourM.setProductName("Tourism Uniform (1 Set for Male)");
        unifTourM.setProductPrice(1300.00);
        unifTourM.setProductImage("images/TourUni.png");

        unifDentHygM.setProductName("Dental Hygiene NC IV Uniform (1 Set for Male)");
        unifDentHygM.setProductPrice(1300.00);
        unifDentHygM.setProductImage("images/DenHyUni.png");

        unifDentHygF.setProductName("Dental Hygiene NC IV Uniform (1 Set for Female)");
        unifDentHygF.setProductPrice(1300.00);
        unifDentHygF.setProductImage("images/DenHyUni.png");

        unifDentLabF.setProductName("Dental Laboratory Technology (1 Set for Female)");
        unifDentLabF.setProductPrice(1300.00);
        unifDentLabF.setProductImage("images/DenLabTechUni.png");

        unifDentHygF.setProductName("Dental Laboratory Technology (1 Set for Male)");
        unifDentHygF.setProductPrice(1300.00);
        unifDentHygF.setProductImage("images/DenLabTechUni.png");

        unifDentLabF.setProductName("Dental Medicine Uniform (1 Set for Female)");
        unifDentLabF.setProductPrice(1300.00);
        unifDentLabF.setProductImage("images/DenMedUni.png");

        unifDentLabM.setProductName("Dental Medicine Uniform (1 Set for Male)");
        unifDentLabM.setProductPrice(1300.00);
        unifDentLabM.setProductImage("images/DenMedUni.png");

        unifMedTechF.setProductName("Medical Technology Uniform (1 Set for Female)");
        unifMedTechF.setProductPrice(1300.00);
        unifMedTechF.setProductImage("images/medTechUni.png");

        unifMedTechM.setProductName("Medical Technology Uniform (1 Set for Male)");
        unifMedTechM.setProductPrice(1300.00);
        unifMedTechM.setProductImage("images/medTechUni.png");

        unifPharmaF.setProductName("Pharmacy Uniform (1 Set for Female)");
        unifPharmaF.setProductPrice(1300.00);
        unifPharmaF.setProductImage("images/PharmaUni.png");

        unifPharmaM.setProductName("Pharmacy Uniform (1 Set for Male)");
        unifPharmaM.setProductPrice(1300.00);
        unifPharmaM.setProductImage("images/PharmaUni.png");

        unifNursingM.setProductName("Nursing Uniform (1 Set for Male)");
        unifNursingM.setProductPrice(1300.00);
        unifNursingM.setProductImage("images/NurUni.png");

        unifMedicineF.setProductName("Nursing Uniform (1 Set for Female)");
        unifMedicineF.setProductPrice(1300.00);
        unifMedicineF.setProductImage("images/NurUni.png");

        unifPsychF.setProductName("Psychology Uniform (1 Set for Female)");
        unifPsychF.setProductPrice(1300.00);
        unifPsychF.setProductImage("images/PsyUni.png");

        unifPsychM.setProductName("Psychology Uniform (1 Set for Male)");
        unifPsychM.setProductPrice(1300.00);
        unifPsychM.setProductImage("images/PsyUni.png");




        
        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    




    public void Enter(ActionEvent event) throws IOException {

        String username = emailAddress.getText();
        String password = passwordField.getText();
        String command = "@national-u.edu.ph";

        if (username.endsWith(command) && !password.isEmpty()) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            Incorrect.setVisible(true);
        }
    }














}

  


