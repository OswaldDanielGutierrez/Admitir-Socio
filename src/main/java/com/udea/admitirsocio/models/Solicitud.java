package com.udea.admitirsocio.models;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_id")
    private Long solicitudId;

    @Column(length = 15)
    private String cedula;

    @Column(length = 10, name = "estado_Solicitud")
    private String estadoSolicitud;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_Envio")
    private Date fechaEnvio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_Confirmacion")
    private Date fechaConfirmacion;


}
