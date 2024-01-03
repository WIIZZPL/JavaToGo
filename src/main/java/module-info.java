module org.wiizz.projekt.javatogo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens org.wiizz.projekt.javatogo to javafx.fxml;
    exports org.wiizz.projekt.javatogo;
}