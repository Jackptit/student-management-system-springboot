package net.javaguides.sms.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
public class Education_program {
	@Id
	private String id;
	private String name;
	private Long number; 
}
