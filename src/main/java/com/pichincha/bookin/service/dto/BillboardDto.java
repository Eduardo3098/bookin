package com.pichincha.bookin.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillboardDto {
    Integer id;
    Boolean status;
    LocalDateTime date;
    LocalDateTime endTime;
    LocalDateTime startTime;
    Integer idMovie;
    Integer idRoom;
}
