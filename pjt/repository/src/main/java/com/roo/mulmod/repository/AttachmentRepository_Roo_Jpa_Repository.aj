// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.mulmod.repository;

import com.roo.mulmod.model.User;
import com.roo.mulmod.repository.AttachmentRepository;
import org.springframework.transaction.annotation.Transactional;

privileged aspect AttachmentRepository_Roo_Jpa_Repository {
    
    declare @type: AttachmentRepository: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param uzer
     * @return Long
     */
    public abstract long AttachmentRepository.countByUzer(User uzer);
    
}