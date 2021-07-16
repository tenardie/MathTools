module xyz.ylmzr {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires mathlib;
    requires java.desktop;

    opens xyz.ylmzr to javafx.fxml;
    exports xyz.ylmzr;
    exports xyz.ylmzr.sub;
}