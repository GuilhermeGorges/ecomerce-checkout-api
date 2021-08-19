package com.guilherme.ecommerce.ecomercecheckout.resource.checkout;

import com.guilherme.ecommerce.ecomercecheckout.service.CheckoutService;
import com.guilherme.ecommerce.ecomercecheckout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest){
        checkoutService.create(checkoutRequest);
        return ResponseEntity.ok().build();
    }

}
