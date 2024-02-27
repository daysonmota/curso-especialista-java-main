import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal1 {

    public static void main(String[] args) {
        
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

//      0Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        Period tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println(tempoEntrega);

        /*Retorna um long em semanas de diferença*/
        long tempoEntregaSemanas = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);

        //Outra forma
//        long tempoEntregaSemanas = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
        System.out.printf("%d semanas%n", tempoEntregaSemanas);
    }
}
