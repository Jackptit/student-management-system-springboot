package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.*;

import net.javaguides.sms.repository.*;
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TheclassRepository TheclassRepository;
	@Autowired
	private JointheclassRepository jcr;
	@Autowired
	private TeacherRepository tr;
	@Override
	public void run(String... args) throws Exception {
		
		
//		  Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com","12/11/2000","CN");
//		  studentRepository.save(student1);
//		  
//		  Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com","12/12/2002","DT");
//		  studentRepository.save(student2);
//		  
//		  Student student3 = new Student("tony", "stark", "tony@gmail.com","21/12/2001","VT");
//		  studentRepository.save(student3);
			for(Jointheclass jtc:jcr.findAll())
			{
				System.out.println(jtc);
			}
			for(Teacher t:tr.findAll())
			{
				System.out.println(t.getDate_of_birth());
			}
		 
		
	}

}
