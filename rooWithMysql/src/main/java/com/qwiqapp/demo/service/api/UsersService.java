package com.qwiqapp.demo.service.api;
import com.qwiqapp.demo.model.Users;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = UsersService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Users.class)
public interface UsersService extends EntityResolver<Users, Long>, ValidatorService<Users> {
}
