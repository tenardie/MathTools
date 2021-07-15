package xyz.ylmzr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    public static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainScene"), 300, 200);
        stage.setScene(scene);
        stage.setTitle("Matematik Araçları");
        stage.getIcons().add(new Image("icon.png"));
        stage.setResizable(false);
        App.stage = stage;
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void changeSize(int Width, int Height) throws IOException{
        stage.setWidth(Width);
        stage.setHeight(Height);
    }

    public static void main(String[] args) {
        launch();
    }

}