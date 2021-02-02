// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.qwiqapp.demo.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.qwiqapp.demo.model.Address;
import com.qwiqapp.demo.service.api.AddressService;
import com.qwiqapp.demo.web.AddressDeserializer;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;

privileged aspect AddressDeserializer_Roo_EntityDeserializer {
    
    declare @type: AddressDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return AddressService
     */
    public AddressService AddressDeserializer.getAddressService() {
        return addressService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param addressService
     */
    public void AddressDeserializer.setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService AddressDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void AddressDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return Address
     * @throws IOException
     */
    public Address AddressDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        Address address = addressService.findOne(id);
        if (address == null) {
            throw new NotFoundException("Address not found");
        }
        return address;
    }
    
}
