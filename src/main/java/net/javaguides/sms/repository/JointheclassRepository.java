package net.javaguides.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.*;

public interface JointheclassRepository extends JpaRepository<Jointheclass, Long>{
		List<Jointheclass> findAllByIdClass(String idClass);
}
