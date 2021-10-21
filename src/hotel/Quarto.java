package hotel;

public class Quarto {
    private final TipoQuartoEnum tipoQuarto;
    private final int precoQuartoNormal;
    private final int precoQuartoTemporada;
    private final int numQuartosDisponiveis;

    public Quarto(TipoQuartoEnum tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
        this.precoQuartoNormal = tipoQuarto.getValorNormal();
        this.precoQuartoTemporada = tipoQuarto.getValorTemporada();
        this.numQuartosDisponiveis = tipoQuarto.getQuantidadeDisponiveis();
    }

    public int getPrecoQuartoNormal() {
        return precoQuartoNormal;
    }

    public int getPrecoQuartoTemporada() {
        return precoQuartoTemporada;
    }

    public int getNumQuartosDisponiveis() {
        return numQuartosDisponiveis;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "precoQuartoNormal=" + precoQuartoNormal +
                ", precoQuartoTemporada=" + precoQuartoTemporada +
                ", numQuartosDisponiveis=" + numQuartosDisponiveis +
                '}';
    }
}
