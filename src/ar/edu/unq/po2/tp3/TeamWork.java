package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TeamWork {

	private String name;
	private ArrayList<Person> members = new ArrayList<Person>();
	
	public TeamWork(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private ArrayList<Person> getMembers() {
		return members;
	}
	
	public void addMembers(Person p) {
		this.getMembers().add(p);
	}
	
	public double membersAverageAge() {
		return this.getMembers()
				   .stream()
				   .collect(Collectors.averagingLong(Person::age));
	}
	
}
