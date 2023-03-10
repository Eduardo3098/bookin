package com.pichincha.bookin.service.impl;

import com.pichincha.bookin.entity.BillboardEntity;
import com.pichincha.bookin.repository.BillboardRepository;
import com.pichincha.bookin.service.BillboardService;
import com.pichincha.bookin.service.dto.BillboardDto;
import com.pichincha.bookin.service.mapper.BillboardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillboardServiceImpl implements BillboardService {

    final BillboardRepository billboardRepository;
    final BillboardMapper billboardMapper;

    @Override
    public List<BillboardDto> getAllBillboard() {
        List<BillboardEntity> billboardEntities = billboardRepository.findAll();
        return billboardEntities.stream().map(this::entityToDto).toList();
    }

    @Override
    public BillboardDto getBillboardById() {
        return null;
    }

    @Override
    public BillboardDto createBillboard() {
        return null;
    }

    @Override
    public BillboardDto updateBillboard() {
        return null;
    }

    @Override
    public void deleteBillboard() {

    }

    private BillboardDto entityToDto(BillboardEntity billboardEntity) {
        return billboardMapper.toBillBoardDto(billboardEntity);
    }

    private BillboardEntity dtoToEntity(BillboardDto billboardEntity) {
        return billboardMapper.toBillboardEntity(billboardEntity);
    }
}
