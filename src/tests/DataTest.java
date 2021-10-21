package tests;

import hotel.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DataTest {
    public static void main(String[] args) throws ParseException {
        Hospede hospede1 = new Hospede("0001234", "04/12/1996");
        List<Hospede> hospedes = new ArrayList<>();
        hospedes.add(hospede1);

        Reserva reserva1 = new Reserva(hospedes, "21/10/2021", 2, TipoQuartoEnum.LUXO);
        System.out.println(reserva1.getQuarto());
    }
}
