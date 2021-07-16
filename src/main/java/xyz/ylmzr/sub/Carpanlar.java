package xyz.ylmzr.sub;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import xyz.ylmzr.App;
import xyz.ylmzr.mathlib.MathLib;

import java.io.IOException;

public class Carpanlar {
    @FXML
    public ImageView imgBack;
    public TextField inputText;
    public TextArea outText1;
    public TextArea outText2;
    public Label labelGuide;

    public void onBtnBack() throws IOException{
        App.setRoot("mainScene");
    }
    public void onBtnRun() throws IOException{
        if(inputText.getText().matches("([0-9])+")){
            labelGuide.setText("Çarpanlarına ayırmak istediğiniz sayıyı yazınız. ");
            labelGuide.setTextFill(Color.GRAY);
            String Carpan = MathLib.Carpan.getCarpan(Integer.parseInt(inputText.getText())).toString();
            String AsalCarpan = MathLib.Carpan.getAsalCarpan(Integer.parseInt(inputText.getText())).toString();
            outText1.setText(Carpan);
            outText2.setText(AsalCarpan);
        }
        else{
            labelGuide.setText("Lütfen geçerli bir değer giriniz!");
            labelGuide.setTextFill(Color.RED);
        }
    }
}
