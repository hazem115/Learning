package com.example.Hahhahaahah.hazem.business.service.serviceimpl;

import com.example.Hahhahaahah.hazem.business.dto.HazemMapper;
import com.example.Hahhahaahah.hazem.business.dto.request.HazemRequestDto;
import com.example.Hahhahaahah.hazem.business.dto.response.HazemResponseDto;
import com.example.Hahhahaahah.hazem.business.service.services.HazemService;
import com.example.Hahhahaahah.hazem.presistance.entity.Hazem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class HazemServiceImpl implements HazemService {
    private final HazemRepo hazemRepo;
    private final HazemMapper hazemMapper;
    @Override
    public HazemResponseDto create(HazemRequestDto hazemRequestDto) {
        Hazem hazem = hazemRepo.save(hazemMapper.dtoToEntity(hazemRequestDto));
        return hazemMapper.entityToDto(hazem);
    }

    @Override
    public HazemResponseDto update(String refNo, HazemRequestDto hazemRequestDto) {
        Hazem oldHazem = hazemRepo.getByRefNo(refNo);
        Hazem newHazem = hazemMapper.dtoToEntity(hazemRequestDto);
        oldHazem.setId(newHazem.getId());
        return hazemMapper.entityToDto(newHazem);
    }

    @Override
    public void delete(Long id) {
        hazemRepo.deleteById(id);
    }

    @Override
    public HazemResponseDto getById(Long id) {
        Hazem hazem = hazemRepo.findById(id).orElse(null);
        return hazemMapper.entityToDto(hazem);
    }

    @Override
    public Set<HazemResponseDto> getAll() {
        List<Hazem> hazem = hazemRepo.findAll();
        return hazemMapper.entityToDto(new HashSet<>(hazem));
    }

    @Override
    public HazemResponseDto getByRefNo(String refNo) {
        Hazem hazem = hazemRepo.getByRefNo(refNo);
        return hazemMapper.entityToDto(hazem);
    }

    @Override
    public HazemResponseDto getByName(String name) {
        Hazem hazem = hazemRepo.getByName(name);
        return hazemMapper.entityToDto(hazem);
    }

    @Override
    public HazemResponseDto getByIdAndName(Long id, String name) {
        Hazem hazem = hazemRepo.getByIdAndName(id, name);
        return hazemMapper.entityToDto(hazem);
    }

    @Override
    public HazemResponseDto getByPhone(String phone) {
        Hazem hazem = hazemRepo.getByPhone(phone);
        return hazemMapper.entityToDto(hazem);
    }
}
