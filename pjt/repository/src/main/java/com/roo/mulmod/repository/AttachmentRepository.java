package com.roo.mulmod.repository;
import com.roo.mulmod.model.Attachment;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AttachmentRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Attachment.class)
public interface AttachmentRepository extends DetachableJpaRepository<Attachment, Long>, AttachmentRepositoryCustom {
}
