package com.mycompany.reservacoches;

import java.util.List;

public class Cliente {
    private String codigo, nombre, dni, direccion, telefono;
    private Cliente aval, avaladoPor;
    private List<Reservacion> reservasDelCliente;
    
}
