package com.example.springdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id")
	private int id;
	 @Column(name = "email")
	private String email;
	 @Column(name = "password")
	private String password;
	 @Column(name = "username")
	private String username;
	 @Column(name = "mobilenumber")
		private String mobilenumber;
		 @Column(name = "userrole")
		private String userrole;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getUserrole() {
			return userrole;
		}
		public void setUserrole(String userrole) {
			this.userrole = userrole;
		}
		public UserModel(int id, String email, String password, String username, String mobilenumber, String userrole) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
			this.username = username;
			this.mobilenumber = mobilenumber;
			this.userrole = userrole;
		}
		 

	
}
