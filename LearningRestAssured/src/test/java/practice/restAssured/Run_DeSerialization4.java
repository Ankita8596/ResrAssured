package practice.restAssured;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Run_DeSerialization4 {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		ObjectMapper obj2=new ObjectMapper();
		Project objin = obj2.readValue(new File("./aab.json"), Project.class);
		System.out.println(objin.getProjectname());
		System.out.println(objin.getCreatedBy());
		System.out.println(objin.getStatus());
		System.out.println(objin.getTeamSize());
		
	}

}
