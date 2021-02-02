package com.qwiqapp.demo.web;
import com.qwiqapp.demo.model.Users;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = UserssCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Users.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooThymeleaf
public class UserssCollectionThymeleafController {
}
