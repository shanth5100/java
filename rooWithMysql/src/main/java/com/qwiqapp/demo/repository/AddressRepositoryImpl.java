package com.qwiqapp.demo.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.qwiqapp.demo.model.Address;

/**
 * = AddressRepositoryImpl
 *
 * Implementation of AddressRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AddressRepositoryCustom.class)
public class AddressRepositoryImpl extends QueryDslRepositorySupportExt<Address> implements AddressRepositoryCustom{

    /**
     * Default constructor
     */
    AddressRepositoryImpl() {
        super(Address.class);
    }
}