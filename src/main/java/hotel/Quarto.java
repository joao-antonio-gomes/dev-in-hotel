package hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Quarto {
    private TipoQuartoEnum tipoQuarto;
    private int precoQuartoNormal;
    private int precoQuartoTemporada;
    private static int numQuartosSimplesDisponiveis = TipoQuartoEnum.SIMPLES.getQuantidadeDisponiveis();
    private static int numQuartosLuxoDisponiveis = TipoQuartoEnum.LUXO.getQuantidadeDisponiveis();
    private static int numQuartosSupremoDisponiveis = TipoQuartoEnum.SUPREMO.getQuantidadeDisponiveis();

    public Quarto(TipoQuartoEnum tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
        this.precoQuartoNormal = tipoQuarto.getValorNormal();
        this.precoQuartoTemporada = tipoQuarto.getValorTemporada();
        setNumQuartosDisponiveis(tipoQuarto);
    }

    private void setNumQuartosDisponiveis(TipoQuartoEnum tipoQuarto) {
        switch (tipoQuarto) {
            case LUXO -> numQuartosLuxoDisponiveis--;
            case SIMPLES -> numQuartosSimplesDisponiveis--;
            case SUPREMO -> numQuartosSupremoDisponiveis--;
        }
    }

    public static int getNumQuartosDisponiveis(TipoQuartoEnum tipoQuarto) {
        int numQuartos;
        switch (tipoQuarto) {
            case LUXO -> numQuartos = numQuartosLuxoDisponiveis;
            case SIMPLES -> numQuartos = numQuartosSimplesDisponiveis;
            case SUPREMO -> numQuartos = numQuartosSupremoDisponiveis;
            default -> throw new IllegalStateException("Unexpected value: " + tipoQuarto);
        }
        return numQuartos;
    }

    @Override
    public String toString() {
        return "Quarto tipo " + tipoQuarto;
    }
}
