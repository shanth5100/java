package com.roo.mulmod.application.web;

import com.roo.mulmod.model.Attachment;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponents;
import org.springframework.validation.BindingResult;

import com.roo.mulmod.model.Attachment;
import javax.validation.Valid;

/**
 * = AttachmentsCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Attachment.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class AttachmentsCollectionThymeleafController {
    // private static final String VIEW = "/attachments/create";
    private static final String VIEW1 = "attachments/create";

    // @GetMapping(value = "/create-form1", name = "createForm1")
    @RequestMapping(value = "/create-form1", name = "createForm1", method = RequestMethod.GET)
    public ModelAndView addFileView(Model model) {
        populateForm(model);
        Attachment attachment = new Attachment();
        model.addAttribute("attachment", attachment);
        return new ModelAndView(VIEW1);
    }

    // com.roo.mulmod.model.Attachment,org.springframework.validation.BindingResult,org.springframework.ui.Model
    @RequestMapping(name = "create1", method = RequestMethod.POST)
    // @PostMapping(name = "create1")
    public ModelAndView addFileController(@Valid Attachment attachment, BindingResult bindResult, Model model,
            @RequestParam("file") MultipartFile file) {
        System.out.println(attachment);
        System.out.println(file.getOriginalFilename());
        // System.out.println(file.getBytes() + "");
        if (bindResult.hasErrors()) {
            populateForm(model);
            return new ModelAndView(VIEW1);
        }
        // if (attachment != null) { // && attachment.getFileContent() != null
        attachment.setFileName("file.getBytes()");
        // }
        // Attachment newAttachment = getAttachmentService.save(attachment);//
        // AttachmentService
        UriComponents showURI = getItemLink().to(AttachmentsItemThymeleafLinkFactory.SHOW).with("attachment", 1)
                .toUri();
        // UriComponents showURI =
        // getItemLink().to(AttachmentsItemThymeleafLinkFactory.SHOW)
        // .with("attachment", newAttachment.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }

    // @PostMapping(name = "create")
    // public ModelAndView create(@Valid @ModelAttribute Attachment attachment,
    // BindingResult result, Model model) {
    // if (result.hasErrors()) {
    // populateForm(model);

    // return new ModelAndView("attachments/create");
    // }
    // Attachment newAttachment = getAttachmentService().save(attachment);
    // UriComponents showURI =
    // getItemLink().to(AttachmentsItemThymeleafLinkFactory.SHOW)
    // .with("attachment", newAttachment.getId()).toUri();
    // return new ModelAndView("redirect:" + showURI.toUriString());
    // }

}
