package net.javaguides.sms.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
public class Jointheclass {
	@Id
	private Long id;
	private String idClass;
	private Long idStudent;
	private float diemso;
	private String diemchu;
	
}
