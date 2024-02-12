module ru.sinitsynme.rmifilword {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens ru.sinitsynme.rmifilword to javafx.fxml;
    exports ru.sinitsynme.rmifilword;
}