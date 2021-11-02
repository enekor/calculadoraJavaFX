module com.example.numerosumaresta {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens Calculadora to javafx.fxml;
    exports Calculadora;
}