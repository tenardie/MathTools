package xyz.ylmzr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

import java.io.IOException;
import java.net.URI;

public class MainSceneController {
    @FXML
    private Button btnCarpanlar;
    @FXML
    private Hyperlink websiteLink;
    public void onBtnCarpanlar() throws IOException{
        App.setRoot("carpanlarScene");
    }
    public void onWebLink() throws IOException{

        try {
            URI uri= new URI("https://www.ylmzr.xyz");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
