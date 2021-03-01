package com.roo.mulmod.application.web;
import com.roo.mulmod.model.Attachment;
import com.roo.mulmod.service.api.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AttachmentDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Attachment.class)
public class AttachmentDeserializer extends JsonObjectDeserializer<Attachment> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AttachmentService attachmentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param attachmentService
     * @param conversionService
     */
    @Autowired
    public AttachmentDeserializer(@Lazy AttachmentService attachmentService, ConversionService conversionService) {
        this.attachmentService = attachmentService;
        this.conversionService = conversionService;
    }
}
