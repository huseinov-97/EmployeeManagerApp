package com.bme.employeemanager.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee implements Serializable {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(nullable = false, updatable = false)
		private Long id;
		private String name;
		private String email;
		private String jobTitle;
		private String imageUrl;
		private String phone;
		
		@Column(nullable = false, updatable = false)
		private String employeeCode;
		
		public Employee(String name,
						String email,
						String jobTitle,
						String imageUrl,
						String phone,
						String employeeCode) {
				this.name = name;
				this.email = email;
				this.jobTitle = jobTitle;
				this.imageUrl = imageUrl;
				this.phone = phone;
				this.employeeCode = employeeCode;
		}
		
}
