package com.example.Hahhahaahah.yossef.business.service.serviceimpl;

import com.example.Hahhahaahah.yossef.business.dto.YossefMapper;
import com.example.Hahhahaahah.yossef.business.dto.request.YossefRequestDto;
import com.example.Hahhahaahah.yossef.business.dto.response.YossefResponseDto;
import com.example.Hahhahaahah.yossef.business.service.services.YossefService;
import com.example.Hahhahaahah.yossef.presistance.entity.Yossef;
import com.example.Hahhahaahah.yossef.presistance.repo.YossefRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class YossefServiceImpl implements YossefService {

    private final YossefMapper yossefMapper;
    private final YossefRepo yossefRepo;
    @Override
    public YossefResponseDto create(YossefRequestDto yossefRequestDto) {
        Yossef yossef = yossefRepo.save(yossefMapper.dtoToEntity(yossefRequestDto));
        return yossefMapper.entityToDto(yossef);
    }

    @Override
    public YossefResponseDto update(String refNo, YossefRequestDto yossefRequestDto) {
        Yossef oldYossef = yossefRepo.getByRefNo(refNo);
        Yossef newYossef = yossefMapper.dtoToEntity(yossefRequestDto);
        oldYossef.setId(newYossef.getId());
        return yossefMapper.entityToDto(yossefRepo.save(newYossef));
    }

    @Override
    public void delete(Long id) {
        yossefRepo.deleteById(id);
    }


    @Override
    public YossefResponseDto getById(Long id) {
        Yossef yossef = yossefRepo.findById(id).orElse(null);
        return yossefMapper.entityToDto(yossef);
    }

    @Override
    public Set<YossefResponseDto> getAll() {
        List<Yossef> yossef = yossefRepo.findAll();
        return yossefMapper.entityToDto(new HashSet<>(yossef));
    }

    @Override
    public YossefResponseDto getByRefNo(String refNo) {
        Yossef yossef = yossefRepo.getByRefNo(refNo);
        return yossefMapper.entityToDto(yossef);
    }
}
