package fr.epita.datamodel;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Reviewer {
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}