package net.javaguides.sms.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	private String ngaysinh;
	private String madt;
	public Student() {
		this.firstName=null;
		this.lastName=null;
		this.email=null;
		this.ngaysinh=null;
		this.madt=null;
	}
	public Student(String firstName, String lastName, String email,String ngaysinh,String madt) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.ngaysinh=ngaysinh;
		this.madt=madt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ns) {
		this.ngaysinh = ns;
	}
	public String getMadt() {
		return madt;
	}
	public void setMadt(String madt) {
		this.madt = madt;
	}
	public String getName() {
		return firstName+" "+lastName;
	}
}
