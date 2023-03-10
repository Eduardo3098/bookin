package com.pichincha.bookin.controller;

import com.pichincha.bookin.service.BillboardService;
import com.pichincha.bookin.service.dto.BillboardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillboardController {

    private final BillboardService billboardService;

    @GetMapping
    public ResponseEntity getBillBoardDtos() {
        return ResponseEntity.ok(billboardService.getAllBillboard());
    }
}
