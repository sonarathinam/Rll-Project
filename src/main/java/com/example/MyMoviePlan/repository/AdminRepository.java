package com.example.MyMoviePlan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MyMoviePlan.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	@Query(value = "SELECT * FROM Admin WHERE Id = :Id AND email = :email AND password= :password", nativeQuery = true)
	public Optional<Admin> getAdminDetails(@Param("Id") Long Id,@Param("email") String email,
															@Param("password") String password);
	
}
