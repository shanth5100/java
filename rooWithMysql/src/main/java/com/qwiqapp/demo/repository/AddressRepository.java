package com.qwiqapp.demo.repository;
import com.qwiqapp.demo.model.Address;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AddressRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Address.class)
public interface AddressRepository extends DetachableJpaRepository<Address, Long>, AddressRepositoryCustom {
}
