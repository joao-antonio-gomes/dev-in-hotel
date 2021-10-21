package hotel;

import java.lang.constant.Constable;
import java.text.ParseException;
import java.util.List;

public class Reserva {
    private List<Hospede> hospedes;
    private DataCustom dataReserva;
    private int quantidadeDiasReservado;
    private Quarto quarto;
    private double valorTotal;

    public Reserva(List<Hospede> hospedes, String dataReserva, int quantidadeDiasReservado, TipoQuartoEnum quarto) throws ParseException {
        this.hospedes = hospedes;
        this.dataReserva = new DataCustom(dataReserva);
        this.quantidadeDiasReservado = quantidadeDiasReservado;
        this.quarto = new Quarto(quarto);
        this.valorTotal = this.calculaValorTotal();
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public DataCustom getDataReserva() {
        return dataReserva;
    }

    public int getQuantidadeDiasReservado() {
        return quantidadeDiasReservado;
    }

    public Constable getQuarto() {
        return quarto.toString();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    private double calculaValorTotal() {
        return 100;
    }

    private boolean cancelaReserva() {
        return true;
    }
}
