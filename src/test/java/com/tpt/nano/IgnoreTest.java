package com.tpt.nano;

import java.util.Calendar;
import java.util.List;

import com.tpt.nano.annotation.Attribute;
import com.tpt.nano.annotation.Element;
import com.tpt.nano.annotation.RootElement;

import junit.framework.TestCase;

public class IgnoreTest extends TestCase {
	
	private static final String SOURCE = 
	"<?xml version = '1.0' encoding = 'UTF-8'?>\n" +
	"<employee-data id=\"10\" xmlns=\"examplenamespace\">\n" +
	   "<lastName>Smith</lastName>\n" +
	   "<firstName>Bob</firstName>\n" +
	   "<responsibilities>\n" +
	      "<responsibility>Fix Bugs</responsibility>\n" +
	      "<responsibility>Write JAXB2.0 Prototype</responsibility>\n" +
	      "<responsibility>Write Design Spec</responsibility>\n" +
	   "</responsibilities>\n" +
	   "<birthday>1985-07-18T07:51:32.000Z</birthday>\n" +
	"</employee-data>";
	
	@RootElement(name="employee-data", namespace="examplenamespace")
	private static class Employee {
		@Attribute
		public int id;
		
		@Element
		public String firstName;
		
		@Element
		public String lastName;
		
		@Element
		public Calendar birthday;
		
		//NO annotation means ignore this field
		public int age;
		
		@Element
		public Responsibility responsibilities;
		
	}
	
	private static class Responsibility {
		@Element(name="responsibility")
		public List<String> responsibilityList;
	}
	
	
	public void testEmployeeXML() throws Exception {
		IReader xmlReader = NanoFactory.getXMLReader();
		
		Employee employee = xmlReader.read(Employee.class, SOURCE);
		
		assertEquals(10, employee.id);
		assertEquals("Smith", employee.lastName);
		assertEquals("Bob", employee.firstName);
		assertTrue(employee.responsibilities.responsibilityList.size() == 3);
		assertTrue(employee.age == 0);
		
		IWriter xmlWriter = NanoFactory.getXMLWriter();
		String text = xmlWriter.write(employee);
		
		Employee copy = xmlReader.read(Employee.class, text);
		assertEquals(10, copy.id);
		assertEquals("Smith", copy.lastName);
		assertEquals("Bob", copy.firstName);
		assertTrue(copy.responsibilities.responsibilityList.size() == 3);
		assertTrue(copy.age == 0);
		assertEquals(employee.birthday, copy.birthday);
	}
	
	public void testEmployeeJSON() throws Exception {
		IReader xmlReader = NanoFactory.getXMLReader();
		
		Employee employee = xmlReader.read(Employee.class, SOURCE);
		
		assertEquals(10, employee.id);
		assertEquals("Smith", employee.lastName);
		assertEquals("Bob", employee.firstName);
		assertTrue(employee.responsibilities.responsibilityList.size() == 3);
		assertTrue(employee.age == 0);
		
		IWriter jsonWriter = NanoFactory.getJSONWriter();
		String text = jsonWriter.write(employee);
		
		IReader jsonReader = NanoFactory.getJSONReader();
		Employee copy = jsonReader.read(Employee.class, text);
		assertEquals(10, copy.id);
		assertEquals("Smith", copy.lastName);
		assertEquals("Bob", copy.firstName);
		assertTrue(copy.responsibilities.responsibilityList.size() == 3);
		assertTrue(copy.age == 0);
		assertEquals(employee.birthday, copy.birthday);
	}


}
