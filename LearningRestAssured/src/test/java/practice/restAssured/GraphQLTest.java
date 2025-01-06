package practice.restAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GraphQLTest {
	@Test
	public void graphQlApiTest() {
		
		
		String graphQuery="{ findProject(projectId:\"NH_PROJ_931\"){ projectId projectName status createdBy teamSize } }";
		
		Response res = given()
		.header("Content-Type" , "application/json")
		.body(graphQuery)
		.post("http://49.249.28.218:8091/getProjectByProjectId");
		String responseBody = res.getBody().asString();
		System.out.println(responseBody);
		res.then().log().all();
	}

}


