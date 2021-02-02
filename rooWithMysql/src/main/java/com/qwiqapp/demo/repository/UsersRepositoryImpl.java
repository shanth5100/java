package com.qwiqapp.demo.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.qwiqapp.demo.model.Users;

/**
 * = UsersRepositoryImpl
 *
 * Implementation of UsersRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = UsersRepositoryCustom.class)
public class UsersRepositoryImpl extends QueryDslRepositorySupportExt<Users> implements UsersRepositoryCustom{

    /**
     * Default constructor
     */
    UsersRepositoryImpl() {
        super(Users.class);
    }
}