package com.qwiqapp.demo.web;
import com.qwiqapp.demo.model.Users;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = UserssItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Users.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooThymeleaf
public class UserssItemThymeleafController implements ConcurrencyManager<Users> {
}
