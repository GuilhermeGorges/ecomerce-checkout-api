package com.guilherme.ecommerce.ecomercecheckout.repository;

import com.guilherme.ecommerce.ecomercecheckout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
}
