package Signos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Verificacao {

    String dataAgora() {
        LocalDate dataAgora = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        return dataAgora.format(formato).toString();
    }
}
