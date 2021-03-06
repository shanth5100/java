// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.mulmod.application.config.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.roo.mulmod.application.config.jackson.DomainModelModule;
import com.roo.mulmod.application.web.AttachmentJsonMixin;
import com.roo.mulmod.application.web.UserJsonMixin;
import com.roo.mulmod.model.Attachment;
import com.roo.mulmod.model.User;
import org.springframework.boot.jackson.JsonComponent;

privileged aspect DomainModelModule_Roo_DomainModelModule {
    
    declare parents: DomainModelModule extends SimpleModule;
    
    declare @type: DomainModelModule: @JsonComponent;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     */
    public DomainModelModule.new() {
        // Mixin registration
        
        setMixInAnnotation(Attachment.class, AttachmentJsonMixin.class);
        setMixInAnnotation(User.class, UserJsonMixin.class);
    }

}
