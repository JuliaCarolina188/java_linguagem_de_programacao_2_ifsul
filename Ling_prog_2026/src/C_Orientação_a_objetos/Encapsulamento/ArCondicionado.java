package C_Orientação_a_objetos.Encapsulamento;

public class ArCondicionado {

    private int temperatura = 20;

    void MudarTemperatura(byte temp) {
        if (temp > 35 || temp < 15) {
            System.out.println("      Temperatura maior do que o possivel(15 - 35)");
        } else {
            if(temp > (temperatura + 1) || temperatura < (temp - 1)){
                System.out.println("      Diferenca de mais ou de menos que 1 da temperatura atual " + (temperatura + 1) + "/" + (temperatura - 1));
            }
            this.temperatura = temp;
        }
    }
    
    int Mostraremperatura(){
        return this.temperatura;
    }
}
