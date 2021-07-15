module xyz.ylmzr {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    opens xyz.ylmzr to javafx.fxml;
    exports xyz.ylmzr;
    exports xyz.ylmzr.sub;
}