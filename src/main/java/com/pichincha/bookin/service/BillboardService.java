package com.pichincha.bookin.service;

import com.pichincha.bookin.service.dto.BillboardDto;

import java.util.List;

public interface BillboardService {
    List<BillboardDto> getAllBillboard();
    Object getBillboardById();
    Object createBillboard();
    Object updateBillboard();
    void deleteBillboard();
}
