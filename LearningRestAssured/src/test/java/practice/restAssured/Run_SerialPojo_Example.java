package practice.restAssured;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(value= {
		"projectName",
}
)

class Abc{
	String projectName;
	String status;
	List<String> teamMembers;
	List<projectManager> pmobj;
	public Abc() {
		
	}
	public Abc(String projectName, String status, List<String> teamMembers, List<projectManager> pmobj) {
		super();
		this.projectName = projectName;
		this.status = status;
		this.teamMembers = teamMembers;
		this.pmobj = pmobj;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public List<projectManager> getPmobj() {
		return pmobj;
	}
	public void setPmobj(List<projectManager> pmobj) {
		this.pmobj = pmobj;
	}
	@Override
	public String toString() {
	return "Abc[projectName="+projectName+",status="+status+",teamMembers="+teamMembers+",pmobj="+pmobj+"]";	
	}
}
class projectManager{
	String name;
	int id; 
	public projectManager() {
		
	}
	
	public projectManager(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
	return "projectManager[name="+name+",id="+id+"]";	
	}
}

public class Run_SerialPojo_Example {
	public static void main(String[] args) throws Throwable, DatabindException, IOException {
		List<String> lst =new ArrayList<String>();
		lst.add("jhon");
		lst.add("devid");
		lst.add("stev");
		projectManager pobj1 = new projectManager("sagar", 102);
		projectManager pobj2=new  projectManager("devid",101);
		List<projectManager> lst1=new  LinkedList<projectManager>();
		lst1.add(pobj1);
		lst1.add(pobj2);
		Abc e=new Abc("Aankita", "created", lst,lst1);
		System.out.println(pobj1.name);
		System.out.println(pobj1.id);
		System.out.println(e.projectName);
		ObjectMapper objm=new ObjectMapper();
		objm.writeValue(new File("./Abc.json"), e);
		
		
	}
}
