package hotel;

import lombok.Getter;

import java.util.List;

public class Reserva {
    private List<Hospede> hospedes;
    @Getter
    private DataCustom dataReservaInicial;
    @Getter
    private DataCustom dataReservaFinal;
    @Getter
    private int quantidadeDiasReservado;
    @Getter
    private Quarto quarto;
    private double valorTotal;

    public Reserva(List<Hospede> hospedes, String dataReserva, int quantidadeDiasReservado, TipoQuartoEnum quarto) throws Exception {
        this.verificaDataReservaAte60Dias(dataReserva);

        this.hospedes = hospedes;
        this.dataReservaInicial = new DataCustom(dataReserva);
        this.quantidadeDiasReservado = quantidadeDiasReservado;
        this.dataReservaFinal = new DataCustom(dataReserva).adicionaDias(quantidadeDiasReservado);
        this.quarto = new Quarto(quarto);
        this.valorTotal = this.calculaValorTotal();
    }

    private void verificaDataReservaAte60Dias(String dataReserva) throws Exception {
        String dataReservada = new DataCustom(dataReserva).obtemDataEmString();
        String dataAtual = new DataCustom().criaDataAtual();
        int diasDiferenca = new DataCustom().verificaDiferencaEntreDatas(dataAtual, dataReservada);

        if (!(diasDiferenca <= 60)) throw new Exception("Data de reserva deve ser inferior a 60 dias");
    }

    private double calculaValorTotal() {
        return 100;
    }

    private boolean cancelaReserva() {
        return true;
    }
}
