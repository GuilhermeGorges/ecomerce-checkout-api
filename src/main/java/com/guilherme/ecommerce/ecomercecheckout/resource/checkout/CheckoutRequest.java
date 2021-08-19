package com.guilherme.ecommerce.ecomercecheckout.resource.checkout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {

    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private String saveAddress;
    private boolean checkBox;
    private boolean saveInfo;
    private String paymentMethod;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCVV;
}
