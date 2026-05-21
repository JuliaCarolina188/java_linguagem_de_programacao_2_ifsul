package J_Manipuação_de_string;

public class parse {

    public static void main(String[] args) {
        double fraseDouble = 0.0;
        int fraseInt = 0;

        String frase = "192";
        System.out.println("Frase string: " + frase);

        try {
            fraseInt = Integer.parseInt(frase);
        } catch (NumberFormatException e) {
            System.out.print("Deu problema: " + e);
        }
        System.out.println(fraseInt + " + 2 = " + (fraseInt + 2));

        try {
            fraseDouble = Double.parseDouble(frase);
        } catch (NumberFormatException e) {
            System.out.print("Deu problema: " + e);
        }
        System.out.println(fraseDouble + " + 12.5 = " + (fraseDouble + 12));

    }

}
