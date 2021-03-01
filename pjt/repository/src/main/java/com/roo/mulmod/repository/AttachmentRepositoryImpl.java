package com.roo.mulmod.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.roo.mulmod.model.Attachment;

/**
 * = AttachmentRepositoryImpl
 *
 * Implementation of AttachmentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = AttachmentRepositoryCustom.class)
public class AttachmentRepositoryImpl extends QueryDslRepositorySupportExt<Attachment> implements AttachmentRepositoryCustom{

    /**
     * Default constructor
     */
    AttachmentRepositoryImpl() {
        super(Attachment.class);
    }
}