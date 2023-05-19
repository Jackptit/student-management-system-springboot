package net.javaguides.sms.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
public class Classroom {	
	@Id
	private String idclass;
	private String idsubject;
	private Long idteacher;
	private Long semester;
	private Long quantity;
	public Classroom() {}
	public Classroom(String idclass,String idsubject,Long idteacher,Long semester,Long quantity) {
		this.idclass=idclass;
		this.idsubject=idsubject;
		this.idteacher=idteacher;
		this.semester=semester;
		this.quantity=quantity;
	}
}
