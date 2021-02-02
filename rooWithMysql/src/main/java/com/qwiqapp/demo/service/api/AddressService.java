package com.qwiqapp.demo.service.api;
import com.qwiqapp.demo.model.Address;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AddressService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Address.class)
public interface AddressService extends EntityResolver<Address, Long>, ValidatorService<Address> {
}
