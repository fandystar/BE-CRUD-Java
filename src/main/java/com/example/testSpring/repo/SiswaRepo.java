package com.example.testSpring.repo;
import com.example.testSpring.model.SiswaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface SiswaRepo extends JpaRepository<SiswaModel,Integer> {

}
