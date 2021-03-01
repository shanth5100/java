// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.mulmod.application.web;

import com.roo.mulmod.application.web.AttachmentsCollectionThymeleafController;
import com.roo.mulmod.application.web.AttachmentsItemThymeleafController;
import com.roo.mulmod.application.web.AttachmentsItemThymeleafLinkFactory;
import com.roo.mulmod.model.Attachment;
import com.roo.mulmod.service.api.AttachmentService;
import io.springlets.data.web.validation.GenericValidator;
import io.springlets.web.NotFoundException;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import io.springlets.web.mvc.util.concurrency.ConcurrencyCallback;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import io.springlets.web.mvc.util.concurrency.ConcurrencyTemplate;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;

privileged aspect AttachmentsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: AttachmentsItemThymeleafController: @Controller;
    
    declare @type: AttachmentsItemThymeleafController: @RequestMapping(value = "/attachments/{attachment}", name = "AttachmentsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AttachmentService AttachmentsItemThymeleafController.attachmentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource AttachmentsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<AttachmentsItemThymeleafController> AttachmentsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<AttachmentsCollectionThymeleafController> AttachmentsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<Attachment> AttachmentsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<Attachment>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param attachmentService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public AttachmentsItemThymeleafController.new(AttachmentService attachmentService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setAttachmentService(attachmentService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(AttachmentsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(AttachmentsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AttachmentService
     */
    public AttachmentService AttachmentsItemThymeleafController.getAttachmentService() {
        return attachmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param attachmentService
     */
    public void AttachmentsItemThymeleafController.setAttachmentService(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource AttachmentsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void AttachmentsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<AttachmentsItemThymeleafController> AttachmentsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void AttachmentsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<AttachmentsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<AttachmentsCollectionThymeleafController> AttachmentsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void AttachmentsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<AttachmentsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Attachment
     */
    @ModelAttribute
    public Attachment AttachmentsItemThymeleafController.getAttachment(@PathVariable("attachment") Long id, Locale locale, HttpMethod method) {
        Attachment attachment = null;
        if (HttpMethod.PUT.equals(method)) {
            attachment = attachmentService.findOneForUpdate(id);
        } else {
            attachment = attachmentService.findOne(id);
        }
        
        if (attachment == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Attachment", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return attachment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param attachment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView AttachmentsItemThymeleafController.show(@ModelAttribute Attachment attachment, Model model) {
        model.addAttribute("attachment", attachment);
        return new ModelAndView("attachments/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param attachment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView AttachmentsItemThymeleafController.showInline(@ModelAttribute Attachment attachment, Model model) {
        model.addAttribute("attachment", attachment);
        return new ModelAndView("attachments/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void AttachmentsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void AttachmentsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<Attachment> AttachmentsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String AttachmentsItemThymeleafController.getModelName() {
        return "attachment";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String AttachmentsItemThymeleafController.getEditViewPath() {
        return "attachments/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer AttachmentsItemThymeleafController.getLastVersion(Attachment record) {
        return getAttachmentService().findOne(record.getId()).getVersion();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView AttachmentsItemThymeleafController.populateAndGetFormView(Attachment entity, Model model) {
        // Populate the form with all the necessary elements
        populateForm(model);
        // Add concurrency attribute to the model to show the concurrency form
        // in the current edit view
        model.addAttribute("concurrency", true);
        // Add the new version value to the model.
        model.addAttribute("newVersion", getLastVersion(entity));
        // Add the current pet values to maintain the values introduced by the user
        model.addAttribute(getModelName(), entity);
        // Return the edit view path
        return new org.springframework.web.servlet.ModelAndView(getEditViewPath(), model.asMap());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("attachment")
    public void AttachmentsItemThymeleafController.initAttachmentBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(Attachment.class, getAttachmentService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param attachment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView AttachmentsItemThymeleafController.editForm(@ModelAttribute Attachment attachment, Model model) {
        populateForm(model);
        
        model.addAttribute("attachment", attachment);
        return new ModelAndView("attachments/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param attachment
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView AttachmentsItemThymeleafController.update(@Valid @ModelAttribute Attachment attachment, BindingResult result, @RequestParam("version") Integer version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        Attachment savedAttachment = getConcurrencyTemplate().execute(attachment, model, new ConcurrencyCallback<Attachment>() {
            @Override
            public Attachment doInConcurrency(Attachment attachment) throws Exception {
                return getAttachmentService().save(attachment);
            }
        });
        UriComponents showURI = getItemLink().to(AttachmentsItemThymeleafLinkFactory.SHOW).with("attachment", savedAttachment.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param attachment
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> AttachmentsItemThymeleafController.delete(@ModelAttribute Attachment attachment) {
        getAttachmentService().delete(attachment);
        return ResponseEntity.ok().build();
    }
    
}
