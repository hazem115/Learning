package com.example.Hahhahaahah.yossef.presintation.controller;

import com.example.Hahhahaahah.yossef.business.dto.request.YossefRequestDto;
import com.example.Hahhahaahah.yossef.business.dto.response.YossefResponseDto;
import com.example.Hahhahaahah.yossef.business.service.services.YossefService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/yossef")
public class YossefController {
    private final YossefService yossefService;

    @PostMapping("/save")
    public YossefResponseDto create(@RequestBody YossefRequestDto yossefRequestDto){
        return yossefService.create(yossefRequestDto);
    }
    @PutMapping("/update/{refNo}")
    public YossefResponseDto update(@RequestBody YossefRequestDto yossefRequestDto,@PathVariable String refNo){
        return yossefService.update(refNo, yossefRequestDto);
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable Long id){
        yossefService.delete(id);
    }
    @GetMapping("/getById")
    public YossefResponseDto getById(@PathVariable Long id){
        return yossefService.getById(id);
    }
    @GetMapping("/getByRefNo")
    public YossefResponseDto getByRefNo(@PathVariable String refNo){
        return yossefService.getByRefNo(refNo);
    }
    @GetMapping("/getAll")
    public Set<YossefResponseDto> getAll() {
        return yossefService.getAll();
    }
}
