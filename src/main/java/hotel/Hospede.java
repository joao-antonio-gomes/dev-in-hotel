package hotel;

import java.text.ParseException;

public class Hospede {
    private String documentoIdentificacao;
    private DataCustom dataNascimento;

    public Hospede(String documentoIdentificacao, String dataNascimento) throws ParseException {
        this.documentoIdentificacao = documentoIdentificacao;
        this.dataNascimento = new DataCustom(dataNascimento);
    }
}
