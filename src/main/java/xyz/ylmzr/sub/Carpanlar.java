package xyz.ylmzr.sub;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import xyz.ylmzr.App;

import java.io.IOException;

public class Carpanlar<filter> {
    @FXML
    public ImageView imgBack;
    public TextArea textOut;
    public TextField inputText;
    public TextArea outText;

    public void onBtnBack() throws IOException{
        App.setRoot("mainScene");
    }
    public void onBtnRun() throws IOException{
        App.setRoot("mainScene");
    }

}
