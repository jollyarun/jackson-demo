package com.wordpress.thenonsensetechlogs.json.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.wordpress.thenonsensetechlogs.json.artifacts.Department;
import com.wordpress.thenonsensetechlogs.json.artifacts.Employee;

public class JacksonDemo {

	public static void main(String[] args) {

		JacksonDemo jacksonDemo = new JacksonDemo();
		try {

			String jsonString = jacksonDemo.ObjectToJson();
			System.out.println("Generated JSON String : " + jsonString);
			System.out.println("Employee intsance from json : " + jacksonDemo.JSONToObject(jsonString));

		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String ObjectToJson() throws JsonGenerationException, JsonMappingException, IOException {

		Department department = new Department(1, "IT");
		List<String> teamMates = new ArrayList<String>() {

			private static final long serialVersionUID = 1L;

			{
				add("karian");
				add("jmm");
				add("cp");
			}
		};
		Employee employee = new Employee(101, "TJ", department, teamMates);

		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(employee);
	}

	public Employee JSONToObject(String json) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(json, Employee.class);
		return employee;
	}

}
