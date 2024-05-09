package com.example.Hahhahaahah.hossam.presintation.controller;

import com.example.Hahhahaahah.hossam.business.dto.request.HossamRequestDto;
import com.example.Hahhahaahah.hossam.business.dto.response.HossamResponseDto;
import com.example.Hahhahaahah.hossam.business.service.services.HossamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/hossam")
public class HossamController {

    private final HossamService hossamService;
    @PostMapping("save")
    public HossamResponseDto create(@RequestBody HossamRequestDto hossamRequestDto){
        return hossamService.create(hossamRequestDto);
    }
    @PutMapping("update/{refNo}")
    public HossamResponseDto update(@PathVariable String refNo,@RequestBody HossamRequestDto hossamRequestDto){
        return hossamService.update(refNo, hossamRequestDto);
    }
    @DeleteMapping("delete/{id}")
    private void delete(@PathVariable Long id){
        hossamService.delete(id);
    }
    @GetMapping("getById/{id}")
    public HossamResponseDto getById(@PathVariable Long id){
        return hossamService.getById(id);
    }
    @GetMapping("getByRefNo/{refNo}")
    public HossamResponseDto getByRefNo(@PathVariable String refNo){
        return hossamService.getByRefNo(refNo);
    }
    @GetMapping("getAll")
    public Set<HossamResponseDto> getAll(){
        return hossamService.getAll();
    }
}
