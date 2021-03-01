package com.roo.mulmod.application.web;

import com.roo.mulmod.model.Attachment;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.roo.mulmod.model.Attachment;

/**
 * = AttachmentsItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Attachment.class, type = ControllerType.ITEM)
@RooThymeleaf
public class AttachmentsItemThymeleafController implements ConcurrencyManager<Attachment> {

    private static final String VIEW = "/attachments/create";

    @GetMapping(value = "/create-form", name = "create-form") // @Transactional (value=TxType.REQUIRED)
    public ModelAndView saveAttachment(@ModelAttribute Attachment attachment, Model model) {
        populateForm(model);
        model.addAttribute("attachment", attachment);
        // model.addAttribute("attachment", attachment);
        return new ModelAndView(VIEW);
    }

    // @PostMapping
    // public ModelAndView saveFile(@RequestParam("fileContent") MultipartFile file)
    // {

    // }
}
