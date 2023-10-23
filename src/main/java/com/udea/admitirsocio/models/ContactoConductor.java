package com.udea.admitirsocio.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ContactoConductor {
    @Id
    @ManyToOne
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;

    @Id
    @ManyToOne
    @JoinColumn(name = "contacto_id")
    private Contacto contacto;
}
