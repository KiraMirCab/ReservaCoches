package com.mycompany.reservacoches;
import java.util.Currency;
import java.util.List;

public class Coche {
    private Currency precio;
    private Boolean cocheDisponible;
    private String matricula, marca, modelo, color;
    private List<Reservacion> reservasDeEsteCoche;
    private Garaje garaje;
}
