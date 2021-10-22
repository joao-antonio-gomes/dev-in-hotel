package tests;

import hotel.Hospede;
import hotel.Quarto;
import hotel.Reserva;
import hotel.TipoQuartoEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelTest {
    public static void main(String[] args) throws Exception {
        Hospede hospede = new Hospede("João", "0001112", "04/12/1996");
        List<Hospede> hospedes = new ArrayList<>();
        hospedes.add(hospede);
        Reserva reserva2 = new Reserva(hospedes, "23/11/2021", 2, TipoQuartoEnum.LUXO);
        Reserva reserva3 = new Reserva(hospedes, "23/11/2021", 2, TipoQuartoEnum.LUXO);
        Reserva reserva4 = new Reserva(hospedes, "23/11/2021", 2, TipoQuartoEnum.LUXO);
        Reserva reserva5 = new Reserva(hospedes, "23/11/2021", 2, TipoQuartoEnum.LUXO);
        Reserva reserva6 = new Reserva(hospedes, "23/11/2021", 2, TipoQuartoEnum.LUXO);
        Reserva reserva7 = new Reserva(hospedes, "23/11/2021", 2, TipoQuartoEnum.LUXO);
    }
}
