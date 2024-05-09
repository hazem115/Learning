package com.example.giftcard.client.presintation.controller;

import com.example.giftcard.client.business.dto.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    ClientMapper clientMapper;
}
