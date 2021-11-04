package Calculadora;

import javafx.scene.control.Label;
import lombok.Data;

@Data
public class ControladorCalculadora {

    private ModeloCalculadora modelo = new ModeloCalculadora();
    private String num1="0",num2,operador;

    public void controlador(){}

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String calcular(){
        return String.valueOf(modelo.calcular(Double.parseDouble(num1),operador,Double.parseDouble(num2)));
    }
}
