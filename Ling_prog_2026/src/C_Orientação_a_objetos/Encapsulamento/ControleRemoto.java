package C_Orientação_a_objetos.Encapsulamento;

public class ControleRemoto {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();

        while (true) {
            ar.temperatura = ar.MudarTemperatura();
            System.out.println("Temperatura atual: " + ar.temperatura);
        }
    }
}
