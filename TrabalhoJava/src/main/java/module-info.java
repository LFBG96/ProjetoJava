module com.trabalho {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.trabalho to javafx.fxml;
    exports com.trabalho;
}