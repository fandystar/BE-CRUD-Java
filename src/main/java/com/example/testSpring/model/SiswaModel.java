package com.example.testSpring.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table; 
import javax.persistence.GenerationType;

@Entity
@Table(name = "siswa")
public class SiswaModel { 
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    
    public SiswaModel ( String name) {
        this.name =name;
       
    }
   
    public SiswaModel () {
       
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
