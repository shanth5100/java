package com.qwiqapp.demo.web;
import com.qwiqapp.demo.model.Users;
import com.qwiqapp.demo.service.api.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = UsersDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Users.class)
public class UsersDeserializer extends JsonObjectDeserializer<Users> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private UsersService usersService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param usersService
     * @param conversionService
     */
    @Autowired
    public UsersDeserializer(@Lazy UsersService usersService, ConversionService conversionService) {
        this.usersService = usersService;
        this.conversionService = conversionService;
    }
}
