package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {

	private String name;
	private LocalDate fechaNac;
	
	public Person(String name, LocalDate fechaNac) {
		super();
		this.setName(name);
		this.setFechaNac(fechaNac);
	}

	private void setName(String name) {
		this.name = name;
	}

	private LocalDate getFechaNac() {
		return fechaNac;
	}

	private void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public long age() {
		LocalDate curDate = LocalDate.now();
		return ChronoUnit.YEARS.between(curDate, this.getFechaNac());
	}
	
	// El receptor es menor en edad que el parametro
	public boolean youngerThan(Person p) {
		return this.age() < p.age();
	}
	
	
}
