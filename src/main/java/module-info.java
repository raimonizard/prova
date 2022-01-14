module com.example.finestraambcolors {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.finestraambcolors to javafx.fxml;
    exports com.example.finestraambcolors;
}