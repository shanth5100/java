package com.roo.mulmod.repository;
import com.roo.mulmod.model.User;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = UserRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = User.class)
public interface UserRepository extends DetachableJpaRepository<User, Long>, UserRepositoryCustom {
}
