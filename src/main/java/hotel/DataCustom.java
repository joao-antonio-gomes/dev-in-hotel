package hotel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataCustom {
    private LocalDate data;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public DataCustom() {
    }

    public DataCustom(String data) throws ParseException {
        this.data = formataDataPorString(data);
    }

    public String obtemDataEmString() {
        return data.format(formato);
    }

    private LocalDate formataDataPorString(String data) throws ParseException {
        return LocalDate.parse(data, formato);
    }

    public String criaDataAtual() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.format(formato);
    }

    public int verificaDiferencaEntreDatas(String dataInicial, String dataFinal) throws ParseException {
        LocalDate dataI = formataDataPorString(dataInicial);
        LocalDate dataF = formataDataPorString(dataFinal);

        return (int) ChronoUnit.DAYS.between(dataI, dataF);
    }

    public DataCustom adicionaDias(int dias) throws ParseException {
        LocalDate date = this.data.plusDays(dias);
        return new DataCustom(date.format(formato));
    }

    @Override
    public String toString() {
        return obtemDataEmString();
    }
}
