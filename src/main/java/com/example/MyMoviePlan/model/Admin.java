package com.example.MyMoviePlan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="Admin")
public class Admin {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Id;
		
		private String email;
		
		

		
		private String Password;
		
		
		public int getId() {
			return Id;
		}
		public void setId(int Id) {
			Id = Id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		

		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		@Override
		public String toString() {
			return "Users [Id=" + Id + ", email=" + email 
					+ ", Password=" + Password + "]";
		}
			
	}
	



