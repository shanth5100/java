package com.qwiqapp.demo.repository;
import com.qwiqapp.demo.model.Users;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = UsersRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Users.class)
public interface UsersRepository extends DetachableJpaRepository<Users, Long>, UsersRepositoryCustom {
}
