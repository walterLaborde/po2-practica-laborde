package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeamWorkTestCase {

	private TeamWork t;
	private Person p;
	private Person p1;
	private Person p2;
	private Person p3;
	private Person p4;
	
	@BeforeEach
	public void setup() throws Exception {
		t = new TeamWork("Asociación Civil Los desfachatados");
		p = new Person("Micho", LocalDate.of(1976,7,2));
		p1 = new Person("Tito", LocalDate.of(1977,7,2));
		p2 = new Person("Gordo", LocalDate.of(1978,7,2));
		p3 = new Person("Negro", LocalDate.of(1979,7,2));
		p4 = new Person("Cabezon", LocalDate.of(1980,7,2));
		
		t.addMembers(p);
		t.addMembers(p1);
		t.addMembers(p2);
		t.addMembers(p3);
		t.addMembers(p4);
	}
	
	@Test
	void membersAverageAgeTest() {
		assertEquals(44,t.membersAverageAge());
	}
}
