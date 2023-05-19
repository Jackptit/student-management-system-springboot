package net.javaguides.sms.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
public class Subject {
	@Id
	private String idsubject;
	private String name;
	private Long number;
	private String idep;
	
}
