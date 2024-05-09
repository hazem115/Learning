package com.example.talabat.offers.business.service.serviceimpl;

import com.example.talabat.offers.business.dto.OffersMapper;
import com.example.talabat.offers.business.dto.request.OffersRequestDto;
import com.example.talabat.offers.business.dto.response.OffersResponseDto;
import com.example.talabat.offers.business.service.services.OfferService;
import com.example.talabat.offers.presistance.entity.Offers;
import com.example.talabat.offers.presistance.repo.OffersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final OffersRepo offersRepo;
    private final OffersMapper offersMapper;
    @Override
    public Set<OffersResponseDto> getAllOffers() {
        List<Offers> offers = offersRepo.findAll();
        return offersMapper.entityToDto(new HashSet<>(offers));
    }

    @Override
    public OffersResponseDto saveOffers(OffersRequestDto request) {
        Offers offers = offersRepo.save(offersMapper.dtoToEntity(request));
        return offersMapper.entityToDto(offers);
    }

    @Override
    public OffersResponseDto findByRefNo(String refNo) {
        Offers offers = offersRepo.findByRefNo(refNo);
        return offersMapper.entityToDto(offers);
    }

    @Override
    public OffersResponseDto findRestaurantByRefNo(String refNo) {
        Offers offers = offersRepo.findRestaurantByRefNo(refNo);
        return offersMapper.entityToDto(offers);
    }

    @Override
    public void deleteOfferById(Long id) {
        offersRepo.deleteById(id);
    }
}
