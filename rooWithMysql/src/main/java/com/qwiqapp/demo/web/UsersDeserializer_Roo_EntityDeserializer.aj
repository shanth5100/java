// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.qwiqapp.demo.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.qwiqapp.demo.model.Users;
import com.qwiqapp.demo.service.api.UsersService;
import com.qwiqapp.demo.web.UsersDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect UsersDeserializer_Roo_EntityDeserializer {
    
    declare @type: UsersDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UsersService
     */
    public UsersService UsersDeserializer.getUsersService() {
        return usersService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param usersService
     */
    public void UsersDeserializer.setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService UsersDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void UsersDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return Users
     * @throws IOException
     */
    public Users UsersDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Users users = usersService.findOne(id);
        if (users == null) {
            throw new NotFoundException("Users not found");
        }
        return users;
    }
    
}
