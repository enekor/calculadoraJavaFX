package Calculadora;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class VistaCalculadora extends GridPane {
    private Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,mas,menos,entre,por,coma,igual,c;
    private Label pantalla, pantalla2;

    private ControladorCalculadora controlador= new ControladorCalculadora();

    public VistaCalculadora(){
        init();
    }

    private void init(){
        uno = new Button("1");
        uno.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"1"));
        dos = new Button("2");
        dos.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"2"));
        tres = new Button("3");
        tres.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"3"));
        cuatro = new Button("4");
        cuatro.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"4"));
        cinco = new Button("5");
        cinco.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"5"));
        seis = new Button("6");
        seis.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"6"));
        siete = new Button("7");
        siete.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"7"));
        ocho = new Button("8");
        ocho.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"8"));
        nueve = new Button("9");
        nueve.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"9"));
        cero = new Button("0");
        cero.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"0"));
        mas = new Button("+");
        mas.setOnMouseClicked(e->{
            controlador.setNum1(pantalla.getText());
            controlador.setOperador("+");
            pantalla2.setText(pantalla.getText()+" + ");
            pantalla.setText("");
        });
        menos = new Button("-");
        menos.setOnMouseClicked(e->{
            controlador.setNum1(pantalla.getText());
            controlador.setOperador("-");
            pantalla2.setText(pantalla.getText()+" - ");
            pantalla.setText("");
        });
        entre = new Button("/");
        entre.setOnMouseClicked(e->{
            controlador.setNum1(pantalla.getText());
            controlador.setOperador("/");
            pantalla2.setText(pantalla.getText()+" / ");
            pantalla.setText("");
        });
        por = new Button("x");
        por.setOnMouseClicked(e->{
            controlador.setNum1(pantalla.getText());
            controlador.setOperador("X");
            pantalla2.setText(pantalla.getText()+" * ");
            pantalla.setText("");
        });
        igual = new Button("=");
        igual.setOnMouseClicked(e->{
            controlador.setNum2(pantalla.getText());
            pantalla2.setText(pantalla2.getText()+pantalla.getText()+" = ");
            pantalla.setText(controlador.calcular());
        });
        coma = new Button(".");
        coma.setOnMouseClicked(e-> pantalla.setText(pantalla.getText()+"."));
        pantalla = new Label("");
        c = new Button("C");
        c.setOnMouseClicked(e-> pantalla.setText(""));
        pantalla2 = new Label();

        posiciones();
        estetica();
    }

    private void estetica(){
        this.setHgrow(this, Priority.ALWAYS);
        this.setVgrow(this, Priority.ALWAYS);

        pantalla.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        pantalla.setFont(new Font(24));
        pantalla.setAlignment(Pos.CENTER);
        pantalla.setStyle("-fx-background-color: #FFFFFF");
        pantalla2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        pantalla2.setAlignment(Pos.CENTER);
        pantalla2.setTextFill(Color.DARKBLUE);
        pantalla2.setStyle("-fx-background-color: #FFFFFF");

        mas.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        mas.setStyle("-fx-background-color: #DA1700;");
        menos.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        menos.setStyle("-fx-background-color: #DA1700;");
        entre.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        entre.setStyle("-fx-background-color: #DA1700;");
        por.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        por.setStyle("-fx-background-color: #DA1700;");
        igual.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        igual.setStyle("-fx-background-color: #DA1700;");

        uno.setStyle("-fx-background-color: #0A0100;");
        dos.setStyle("-fx-background-color: #0A0100;");
        tres.setStyle("-fx-background-color: #0A0100;");
        cuatro.setStyle("-fx-background-color: #0A0100;");
        cinco.setStyle("-fx-background-color: #0A0100;");
        seis.setStyle("-fx-background-color: #0A0100;");
        siete.setStyle("-fx-background-color: #0A0100;");
        ocho.setStyle("-fx-background-color: #0A0100;");
        nueve.setStyle("-fx-background-color: #0A0100;");
        cero.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        cero.setStyle("-fx-background-color: #0A0100;");
        coma.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        coma.setStyle("-fx-background-color: #0A0100;");

        this.setStyle("-fx-background-color: #0A0100");
    }

    private void posiciones(){
        this.add(pantalla2,1,1,4,2);
        this.add(pantalla,1,3,4,2);
        this.add(cero,1,9,2,1);
        this.add(uno,1,8,1,1);
        this.add(dos,2,8,1,1);
        this.add(tres,3,8,1,1);
        this.add(cuatro,1,7,1,1);
        this.add(cinco,2,7,1,1);
        this.add(seis,3,7,1,1);
        this.add(siete,1,6,1,1);
        this.add(ocho,2,6,1,1);
        this.add(nueve,3,6,1,1);
        this.add(mas,4,6,1,2);
        this.add(igual,4,8,1,2);
        this.add(menos,4,5,1,1);
        this.add(por,3,5,1,1);
        this.add(entre,2,5,1,1);
        this.add(c,1,5,1,1);
        this.add(coma,3,9,1,1);
    }

}
