package com.crt2.posttest.que10;

import com.crt2.posttest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByCity(String city);

    List<Student> findByNameAndCity(String name, String city);

    List<Student> findByEmailContaining(String keyword);

    long countByCity(String city);
}