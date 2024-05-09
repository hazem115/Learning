package com.example.giftcard.giftcard.presintation.controller;

import com.example.giftcard.giftcard.business.dto.GiftCardMapper;
import com.example.giftcard.giftcard.business.dto.request.GiftCardDtoRequest;
import com.example.giftcard.giftcard.business.service.services.GiftCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/giftcard")
@RequiredArgsConstructor
public class GiftCardController {

    private final GiftCardService giftCardService;
    private final GiftCardMapper giftCardMapper;

    @PostMapping("/create")
    public ResponseEntity<Void> createGiftCard(@RequestBody GiftCardDtoRequest giftCardDtoRequest) {
        giftCardService.createGiftCard(giftCardMapper.requestDtoToEntity(giftCardDtoRequest));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteGiftCard(@PathVariable Long id) {
        giftCardService.deleteGiftCard(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateGiftCard(@PathVariable Long id, @RequestBody GiftCardDtoRequest giftCardDtoRequest) {
        giftCardService.updateGiftCard(id, giftCardMapper.requestDtoToEntity(giftCardDtoRequest));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
