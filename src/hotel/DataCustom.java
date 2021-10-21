package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataCustom {
    private Date data;

    public DataCustom(String data) throws ParseException {
        formataDataPorString(data);
    }

    public String obtemDataEmString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(this.data);
    }

    private void formataDataPorString(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formato.parse(data);
    }

    @Override
    public String toString() {
        return obtemDataEmString();
    }
}
