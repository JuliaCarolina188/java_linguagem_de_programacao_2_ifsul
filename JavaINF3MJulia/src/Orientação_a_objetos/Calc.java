package Orientação_a_objetos;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println(Calc(1, 2, "menos"));
        System.out.println(Calc(1, 2, "mais"));
        System.out.println(Calc(1, 2, "vezes"));
        System.out.println(Calc(1, 2, "dividir"));
        System.out.println(Calc(1, 2, "vezes"));
        
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        System.out.print(Calc(num1, num2, "vezes"));
    }
    public static float Calc(float a, float b, String opc){
        switch (opc){
            case "mais" -> {
                return a + b;
            } case "menos" -> {
                return a - b;
            } case "vezes" -> {
                return a * b;
            } case "dividir" -> {
                return a / b;
            } default -> {
                return 0;
            }
        }
    }
}

