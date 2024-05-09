package com.example.talabat2.userorders.business.service.serviceimpl;

import com.example.talabat2.userorders.business.dto.UserOrderMapper;
import com.example.talabat2.userorders.business.dto.response.UserOrderResponseDto;
import com.example.talabat2.userorders.business.service.services.UserOrderService;
import com.example.talabat2.userorders.presistance.entity.UserOrder;
import com.example.talabat2.userorders.presistance.repo.UserOrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserOrderServiceImpl implements UserOrderService {

    private final UserOrderRepo userOrderRepo;
    private final UserOrderMapper userOrderMapper;

    @Override
    public Set<UserOrderResponseDto> getAllUserOrders() {
        List<UserOrder> userOrders = userOrderRepo.findAll();
        return userOrderMapper.entityToDto(new HashSet<>(userOrders));
    }
}
