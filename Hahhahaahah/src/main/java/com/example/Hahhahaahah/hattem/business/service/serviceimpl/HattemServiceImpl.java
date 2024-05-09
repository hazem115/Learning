package com.example.Hahhahaahah.hattem.business.service.serviceimpl;

import com.example.Hahhahaahah.hattem.business.dto.HattemMapper;
import com.example.Hahhahaahah.hattem.business.dto.request.HattemRequestDto;
import com.example.Hahhahaahah.hattem.business.dto.response.HattemResponseDto;
import com.example.Hahhahaahah.hattem.business.service.services.HattemServices;
import com.example.Hahhahaahah.hattem.presistance.entity.Hattem;
import com.example.Hahhahaahah.hattem.presistance.repo.HattemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class HattemServiceImpl implements HattemServices {

    private final HattemRepo hattemRepo;
    private final HattemMapper hattemMapper;
    @Override
    public HattemResponseDto create(HattemRequestDto hattemRequestDto) {
        Hattem hattem = hattemRepo.save(hattemMapper.dtoToEntity(hattemRequestDto));
        return hattemMapper.entityToDto(hattem);
    }

    @Override
    public HattemResponseDto update(String refNo, HattemRequestDto hattemRequestDto) {
        Hattem oldHattem = hattemRepo.findByRefNo(refNo);
        Hattem newHattem = hattemMapper.dtoToEntity(hattemRequestDto);
        newHattem.setId(oldHattem.getId());
        return hattemMapper.entityToDto(hattemRepo.save(newHattem));
    }

    @Override
    public void deleteById(Long id) {
        hattemRepo.deleteById(id);
    }

    @Override
    public HattemResponseDto findByRefNo(String refNo) {
        Hattem hattem = hattemRepo.findByRefNo(refNo);
        return hattemMapper.entityToDto(hattem);
    }

    @Override
    public Set<HattemResponseDto> getAll() {
        List<Hattem> hattem = hattemRepo.findAll();
        return hattemMapper.entityToDto(new HashSet<>(hattem));
    }

    @Override
    public HattemResponseDto getById(Long id) {
        Hattem hattem = hattemRepo.findById(id).orElse(null);
        return hattemMapper.entityToDto(hattem);
    }
}
