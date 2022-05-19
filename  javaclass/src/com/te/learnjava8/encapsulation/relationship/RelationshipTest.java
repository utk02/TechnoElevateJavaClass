package com.te.learnjava8.encapsulation.relationship;

public class RelationshipTest {
	public static void main(String[] args) {
		Employee employee = new Employee("TY001","Name01",22,123456789l);
		
		employee.getBatch().createMentorObject();
		
		//employee.getBatch().setMentor(Batch.createMentorObject2());
		
		System.out.println(employee);
		
	}

}
