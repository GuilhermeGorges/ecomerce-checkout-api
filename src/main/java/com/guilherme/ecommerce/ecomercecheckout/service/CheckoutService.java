package com.guilherme.ecommerce.ecomercecheckout.service;

import com.guilherme.ecommerce.ecomercecheckout.entity.CheckoutEntity;
import com.guilherme.ecommerce.ecomercecheckout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
