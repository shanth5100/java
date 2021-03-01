package com.roo.mulmod.service.api;
import com.roo.mulmod.model.User;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = UserService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = User.class)
public interface UserService extends EntityResolver<User, Long>, ValidatorService<User> {
}
