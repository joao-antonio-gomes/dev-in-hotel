package hotel;

import lombok.Getter;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

@Getter
public class Reserva {
    private List<Hospede> hospedes;
    private DataCustom dataReservaInicial;
    private DataCustom dataReservaFinal;
    private int quantidadeDiasReservado;
    private Quarto quarto;
    private double valorDiaria;
    private double valorTotal;

    public Reserva(List<Hospede> hospedes, String dataReserva, int quantidadeDiasReservado, TipoQuartoEnum quarto) throws Exception {
        this.verificaDataReservaAte60Dias(dataReserva);
        this.hospedes = hospedes;
        this.dataReservaInicial = new DataCustom(dataReserva);
        this.quantidadeDiasReservado = quantidadeDiasReservado;
        this.dataReservaFinal = new DataCustom(dataReserva).adicionaDias(quantidadeDiasReservado);
        this.quarto = new Quarto(quarto);
        this.valorDiaria = this.calculaValorDiaria(dataReserva);
        this.valorTotal = this.valorDiaria * this.quantidadeDiasReservado;
    }

    private void verificaDataReservaAte60Dias(String dataReserva) throws Exception {
        String dataReservada = new DataCustom(dataReserva).obtemDataEmString();
        String dataAtual = new DataCustom().criaDataAtual();
        int diasDiferenca = new DataCustom().verificaDiferencaEntreDatas(dataAtual, dataReservada);

        if (!(diasDiferenca <= 60)) throw new Exception("Data de reserva deve ser inferior a 60 dias");
    }

    private double calculaValorDiaria(String dataReserva) throws ParseException {
        LocalDate data = dataReservaInicial.obtemDataLocalDatePorString(dataReserva);
        int mesDataReserva = data.getMonthValue();
        if (mesDataReserva >= 11 || mesDataReserva <= 3) {
            return this.quarto.getPrecoQuartoTemporada();
        }
        return this.quarto.getPrecoQuartoNormal();
    }

    private boolean cancelaReserva() {
        return true;
    }
}
