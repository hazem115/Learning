package com.example.Hahhahaahah.hazem.presintation.controller;

import com.example.Hahhahaahah.hazem.business.dto.request.HazemRequestDto;
import com.example.Hahhahaahah.hazem.business.dto.response.HazemResponseDto;
import com.example.Hahhahaahah.hazem.business.service.services.HazemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/hazem")
public class HazemController {
    private final HazemService hazemService;
    @PostMapping("saveHazem")
    public HazemResponseDto createHazem(@RequestBody HazemRequestDto hazemRequestDto){
        return hazemService.create(hazemRequestDto);
    }
    @PutMapping("update/{refNo}")
    public HazemResponseDto updateHazem(@RequestBody HazemRequestDto hazemRequestDto,@PathVariable String refNo){
        return hazemService.update(refNo, hazemRequestDto);
    }
    @DeleteMapping
    public void deleteHazem(@PathVariable Long id){
        hazemService.delete(id);
    }
    @GetMapping
    public HazemResponseDto getHazemById(@PathVariable Long id){
        return hazemService.getById(id);
    }
    @GetMapping
    public HazemResponseDto getHazemByRefNo(@PathVariable String refNo){
        return hazemService.getByRefNo(refNo);
    }
    @GetMapping
    public Set<HazemResponseDto> getAllHazems(){
        return hazemService.getAll();
    }
}
