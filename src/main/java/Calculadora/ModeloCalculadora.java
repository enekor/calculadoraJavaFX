package Calculadora;

import lombok.Data;

@Data
public class ModeloCalculadora {


    public double calcular(double calculando1, String calculo, double calculando2){

        switch (calculo){
            case "+":{
                return calculando1+calculando2;
            }
            case "-":{
                return calculando1-calculando2;
            }
            case "/":{
                return calculando1/calculando2;
            }
            case "X":{
                return calculando1*calculando2;
            }
        }
        return 0.0;
    }
}
