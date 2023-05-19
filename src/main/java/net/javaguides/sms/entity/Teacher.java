package net.javaguides.sms.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "teachers")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String date_of_birth;
	public Teacher() {}
	public Teacher(String firstName, String lastName, String ngaysinh) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.date_of_birth=ngaysinh;
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
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String ns) {
		this.date_of_birth = ns;
	}
}
