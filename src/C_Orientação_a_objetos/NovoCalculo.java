package C_Orientação_a_objetos;

public class NovoCalculo{
     public float soma(float n1, float n2){
        return n1 + n2;
    }
    public float sub(float n1, float n2){
        return n1 - n2;
    }
    public float div(float n1, float n2){
        return n1 / n2;
    }
    public float mult(float n1, float n2){
        return n1 * n2;
    }
    public String tab(float n1){
        String tab = "";
        for(int i = 1; i >= 10; i++){
            tab += n1 + " x " + i + " = " + i * n1 + "\n";
        }
        return tab;
    }
    public float fat(float n1){
        int fat = 1;
        for(float i = n1; i > 0; i--){
            fat *= i;
        }
        return fat;
    }
}