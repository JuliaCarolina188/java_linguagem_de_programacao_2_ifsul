package B_Repetição_e_seleção;

public class Ex03 {

    public static void main(String[] args) {
        int res = 1;
        for(byte i = 8; i > 0; i--){
            res *= i;
            System.out.println(res);
        }
    }
}

