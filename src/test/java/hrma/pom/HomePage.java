package hrma.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hrma.generics.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver){
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;	
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="firstName")
	private WebElement fname;
	@FindBy(id="lastName")
	private WebElement lname;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement fname1;
	
	public void setUserName(String un){
		userTxtBox.sendKeys(un);
	}
	public void setPwd(String pwd){
		 pwdTxtBox.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBtn.click(); 
	}
	public void clickPin_Menu(){
		pim_Menu.click();
	}
	public void clickAddEmp(){
		addEmp_Menu.click();
	}
	public void setFirstName(String fn){
		fname.sendKeys(fn);
	}
	public void setLastName(String ln){
		lname.sendKeys(ln);
	}
	public void clickSaveBtn(){
		saveBtn.click();
	}
	public void verifyFirstName(String eFn){
		String aFn = fname1.getAttribute("value");
	Assert.assertEquals(aFn, eFn);
	}
	
	//to verify the elements are in the sorted order or not
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement addEmpList_Btn;
	
	public void clickAddEmpList(){
		addEmpList_Btn.click();	
	}
	
}
