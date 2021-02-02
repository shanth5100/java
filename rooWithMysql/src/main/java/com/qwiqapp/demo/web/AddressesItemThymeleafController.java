package com.qwiqapp.demo.web;
import com.qwiqapp.demo.model.Address;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AddressesItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Address.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooThymeleaf
public class AddressesItemThymeleafController implements ConcurrencyManager<Address> {
}
