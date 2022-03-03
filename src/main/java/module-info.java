module com.example.java_fx_tp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.java_fx_tp to javafx.fxml;
    exports com.example.java_fx_tp;
    exports com.example.java_fx_tp.controller;
    opens com.example.java_fx_tp.controller to javafx.fxml;
}