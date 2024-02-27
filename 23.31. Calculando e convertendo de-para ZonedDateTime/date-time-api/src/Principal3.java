import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal3 {

    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
                .parse("2022-11-20T20:12:27-03:00[America/Sao_Paulo]");

        Instant instante = dataHoraFusoSaoPaulo.toInstant();

        LocalDateTime dataHoraLocalLosAngeles = LocalDateTime
                .ofInstant(instante, ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoSaoPaulo); //2022-11-20T20:00-03:00[America/Sao_Paulo]
        System.out.println(instante); //2022-11-20T23:00:00Z
        System.out.println(dataHoraLocalLosAngeles); //2022-11-20T15:00
    }

}
