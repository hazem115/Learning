package com.example.talabat3.offers.business.service.serviceimpl;

import com.example.talabat3.offers.business.dto.OfferMapper;
import com.example.talabat3.offers.business.dto.request.OfferRequestDto;
import com.example.talabat3.offers.business.dto.response.OfferResponseDto;
import com.example.talabat3.offers.business.service.services.OfferService;
import com.example.talabat3.offers.presistance.entity.Offer;
import com.example.talabat3.offers.presistance.repo.OfferRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService{
    private final OfferMapper offerMapper;
    private final OfferRepo offerRepo;

    @Override
    public OfferResponseDto saveOffer(OfferRequestDto request) {
        Offer offer = offerRepo.save(offerMapper.dtoToEntity(request));
        return offerMapper.entityToDto(offer);
    }

    @Override
    public OfferResponseDto updateOffer(String refNo, OfferRequestDto request) {
        Offer oldOffer = offerRepo.getByRefNo(refNo);
        Offer offerToUpdate = offerMapper.dtoToEntity(request);
        offerToUpdate.setId(oldOffer.getId());
        return offerMapper.entityToDto(offerRepo.save(offerToUpdate));
    }

    @Override
    public void deleteOffer(Long id) {
        offerRepo.deleteById(id);
    }

    @Override
    public OfferResponseDto getOfferByRefNo(String refNo) {
        Offer offer = offerRepo.getByRefNo(refNo);
        return offerMapper.entityToDto(offer);
    }

    @Override
    public Set<OfferResponseDto> getAllOffers() {
        List<Offer> offers = offerRepo.findAll();
        return offerMapper.entityToDto(new HashSet<>(offers));
    }

    @Override
    public OfferResponseDto getOfferById(Long id) {
        Offer offer = offerRepo.findById(id).orElse(null);
        return offerMapper.entityToDto(offer);
    }
}
