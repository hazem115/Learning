package com.example.talabat.userorders.business.service.serviceimpl;

import com.example.talabat.userorders.business.dto.UserOrdersMapper;
import com.example.talabat.userorders.business.dto.request.UserOrdersRequestDto;
import com.example.talabat.userorders.business.dto.response.UserOrdersResponseDto;
import com.example.talabat.userorders.business.service.services.UserOrdersService;
import com.example.talabat.userorders.presistance.entity.UserOrders;
import com.example.talabat.userorders.presistance.repo.UserOrdersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserOrdersServiceImpl implements UserOrdersService {

    private final UserOrdersRepo userOrdersRepo;
    private final UserOrdersMapper userOrdersMapper;
    @Override
    public Set<UserOrdersResponseDto> getUserOrders() {
        List<UserOrders> userOrder = userOrdersRepo.findAll();
        return userOrdersMapper.entityToDto(new HashSet<>(userOrder));
    }

    @Override
    public UserOrdersResponseDto saveUserOrders(UserOrdersRequestDto request) {
        UserOrders userOrders = userOrdersRepo.save(userOrdersMapper.dtoToEntity(request));
        return userOrdersMapper.entityToDto(userOrders);
    }

    @Override
    public UserOrdersResponseDto getUserOrdersByRefNo(String refNo) {
        UserOrders userOrders = userOrdersRepo.getUserOrdersByRefNo(refNo);
        return userOrdersMapper.entityToDto(userOrders);
    }

}
