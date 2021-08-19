package com.guilherme.ecommerce.ecomercecheckout.service;

import com.guilherme.ecommerce.ecomercecheckout.entity.CheckoutEntity;
import com.guilherme.ecommerce.ecomercecheckout.repository.CheckoutRepository;
import com.guilherme.ecommerce.ecomercecheckout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckOutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
