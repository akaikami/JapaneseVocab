module com.akaikami.japanesegrammervocab {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.akaikami.japanesegrammervocab to javafx.fxml;
    exports com.akaikami.japanesegrammervocab;
}