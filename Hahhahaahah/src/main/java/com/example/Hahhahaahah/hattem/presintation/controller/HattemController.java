package com.example.Hahhahaahah.hattem.presintation.controller;

import com.example.Hahhahaahah.hattem.business.dto.request.HattemRequestDto;
import com.example.Hahhahaahah.hattem.business.dto.response.HattemResponseDto;
import com.example.Hahhahaahah.hattem.business.service.services.HattemServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/hattem")
public class HattemController {
    private final HattemServices hattemServices;
    @PostMapping("saveHattem")
    public HattemResponseDto createHattem(@RequestBody HattemRequestDto request){
        return hattemServices.create(request);
    }
    @PutMapping("updateHattem/{refNo}")
    public HattemResponseDto updateHattem(@PathVariable String refNo,@RequestBody HattemRequestDto request){
        return hattemServices.update(refNo,request);
    }
    @DeleteMapping("delete/{id}")
    public void deleteHattem(@PathVariable Long id){
        hattemServices.deleteById(id);
    }
    @GetMapping("getById/{id}")
    public HattemResponseDto getById(@PathVariable Long id){
        return hattemServices.getById(id);
    }
    @GetMapping("getAll")
    public Set<HattemResponseDto> getAll() {
        return hattemServices.getAll();
    }
    @GetMapping("getByRefNo/{refNo}")
    public HattemResponseDto getByRefNo(@PathVariable String refNo){
        return hattemServices.findByRefNo(refNo);
    }
}