package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

//@Repository
//public interface UserDao extends JpaRepository<User, Long>{
//
//	Optional<User> findById(Long id);
////	User findById(Long id);
//	
////	@Query(value = "SELECT * FROM user WHERE username = :username or email = : email", nativeQuery = true)
////	User findByUsernameOREmail(String username, String email);
//	
//}

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Long>{

	Optional<User> findById(Long id);
//	User findById(Long id);
	
//	@Query(value = "SELECT * FROM user WHERE username = :username or email = : email", nativeQuery = true)
//	User findByUsernameOREmail(String username, String email);
	
}
