package com.qwiqapp.demo.web;
import com.qwiqapp.demo.model.Address;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AddressesCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Address.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooThymeleaf
public class AddressesCollectionThymeleafController {
}
