module com.example.newproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.newproject to javafx.fxml;
    exports com.example.newproject;
}