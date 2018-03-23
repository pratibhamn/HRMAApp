package hrma.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import hrma.generics.BasePage;
import hrma.generics.BaseTest;
import hrma.generics.Excel;
import hrma.generics.genericUtils;
import hrma.pom.HomePage;

public class TestScripts extends BaseTest {
	@Test
	public void testCreateEmployee() throws EncryptedDocumentException, InvalidFormatException, IOException{
		HomePage pi=new HomePage(driver);
		pi.setUserName(Excel.ReadData("Sheet1", 0, 1));
		pi.setPwd(Excel.ReadData("Sheet1", 1, 1));
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPin_Menu();
		pi.clickAddEmp();
		pi.setFirstName("Pratibha");
		pi.setLastName("MN");
		pi.clickSaveBtn();
		pi.verifyFirstName("Pratibha");
		
		
	}
	@Test(enabled=false)
	public void testSortListBox(){
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPin_Menu();
		pi.clickAddEmpList();
		genericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
	}

}
