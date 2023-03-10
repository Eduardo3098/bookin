package com.pichincha.bookin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillboardEntity {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Integer id;
    @Column(name = "STATUS")
    @NotNull(message = "El status de la cartelera no puede ser nulo")
    Boolean status;
    @Column(name = "DATE")
    @NotNull(message = "El date de la cartelera no puede ser nulo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime date;
    @Column(name = "END_TIME")
    @NotNull(message = "La fecha de fin de la cartelera no puede ser nulo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    LocalDateTime endTime;
    @Column(name = "START_TIME")
    @NotNull(message = "La fecha de inicio de la cartelera no puede ser nulo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    LocalDateTime startTime;
    @Column(name = "ID_MOVIE")
    @NotNull(message = "El id de la pelicula no puede ser nulo")
    Integer idMovie;
    @Column(name = "ID_ROOM")
    @NotNull(message = "El id de la sala no puede ser nulo")
    Integer idRoom;
}
