package F_Calendario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste {
    public static void main(String args[]){
        Date data = new Date();
        System.out.print(data);
        
        DateFormat formatador_completo = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.print("\n\n" + formatador_completo.format(data));
        
        String aniversario = "23/2/2009";
        DateFormat formatador_dia = new SimpleDateFormat("dd/MM/yyyy");
        
        Calendar calendario = new GregorianCalendar();
        int dia= calendario.get(Calendar.DAY_OF_WEEK);
        System.out.println("\n\n" + dia);
    }
}