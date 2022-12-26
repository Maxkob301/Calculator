module com.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.naming;

    opens com.example.calculator to javafx.fxml;
    exports com.example.calculator;
}
