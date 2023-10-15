package com.udea.admitirsocio.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
public class Socio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cedula;

    @Column(length = 55)
    private String nombre;

    @Column(length = 55)
    private String apellido;

    @Column(length = 100)
    private String email;

    @Column(length = 12)
    private String celular;

    private int edad;

    @Column(length = 120)
    private String direccion;

    @Column(length = 45)
    private String contrasena;

    @Temporal(TemporalType.DATE)
    private Date fecha_Vencimiento_Licencia;

    private char genero;

    @Column(length = 30)
    private String estado_actividad;

    @Column(precision = 2, scale = 1)
    @Digits(integer = 2, fraction = 1)
    private BigDecimal calificacion;

    private int numero_Servicios;

    @Column(length = 45)
    private String clasificacion;

    @Column(length = 45)
    private String ciudad;

    private int strikes;
}
