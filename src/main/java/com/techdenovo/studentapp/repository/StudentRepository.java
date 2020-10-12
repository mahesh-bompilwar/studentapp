package com.techdenovo.studentapp.repository;

import com.techdenovo.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByMobileNo(String mobileNo);
}
