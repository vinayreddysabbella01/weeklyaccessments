package com.mouritech.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Student {

	private 
	@Id
	@GeneratedValue
	Integer studentId;
	String studentName;
	
}
