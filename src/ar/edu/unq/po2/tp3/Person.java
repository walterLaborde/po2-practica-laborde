package ar.edu.unq.po2.tp3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Person {

	private String name;
	private LocalDateTime fechaNac;
	
	public Person(String name, LocalDateTime fechaNac) {
		super();
		this.setName(name);
		this.setFechaNac(fechaNac);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private LocalDateTime getFechaNac() {
		return fechaNac;
	}

	private void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public long edad() {
		LocalDateTime curDate = LocalDateTime.now();
		return ChronoUnit.YEARS.between(curDate, this.getFechaNac());
	}
	
	public boolean youngerThan(Person p) {
		return this.edad() < p.edad();
	}
	
	
}
