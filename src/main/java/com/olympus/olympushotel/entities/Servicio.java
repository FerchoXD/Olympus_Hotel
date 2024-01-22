package com.olympus.olympushotel.entities;

import com.olympus.olympushotel.entities.enums.TipoServicio;
import com.olympus.olympushotel.entities.pivots.Reservacion_Servicio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "servicios")
@Getter @Setter
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoServicio tipoServicio;

    private String descripcion;

    private Long precio;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
    private List<Reservacion_Servicio> reservacionServicios;
}
