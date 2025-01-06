package practice.restAssured;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Project {
	private String projectname;
	private String createdBy;
	private String status;
	private int teamSize;

	private Project() {
	}

	public Project(String projectname, String createdBy, String status, int teamSize) {
		super();
		this.projectname = projectname;
		this.createdBy = createdBy;
		this.status = status;
		this.teamSize = teamSize;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}

public class Run_JacksonTest {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
    Project obj= new Project("Rock", "Rocky", "Created", 0);
    ObjectMapper obj1=new ObjectMapper();
    obj1.writeValue(new File("./aab.json"), obj);
    System.out.println("============End===========");
	}
}
