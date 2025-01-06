package dataprovider;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utilities.ExcelUtility;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class CreateProject {
	@Test(dataProvider = "getData")
	public void sampleTest(String createdBy,String projectName,String Status,int teamSize) {
		DemoPojo obj = new DemoPojo(createdBy, projectName, Status, teamSize);
		given()
		.contentType(ContentType.JSON).body(obj)
		.when()
		.post("http://49.249.28.218:8091/addProject")
		.then().log().all();
	}

	@DataProvider
	public Object[][] getData() throws Throwable, IOException {
		ExcelUtility elib = new ExcelUtility();
		int count=elib.getRowCount("Sheet1");
		Object [][] objarr = new Object[count][4];
		for(int i=0;i<count;i++) {
		objarr[i][0]=elib.getDataFromExcel("Sheet1", i+1, 0);
		objarr[i][1]=elib.getDataFromExcel("Sheet1", i+1, 1);
		objarr[i][1]=elib.getNumricDataFromExcelSheet("Sheet1", i+1, 2);
		}
		return objarr;
	}

}
