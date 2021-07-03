package test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPage;


@Listeners(TestNgListeners.class)
public class LoginTest extends Baseclass {
	
	
@Test(enabled=false)
@Parameters({"UserName","Password"})
public void LoginTest1(String uname, String pass) {
	
LoginPage Loginobj = new LoginPage();
Loginobj.login(uname, pass);

}
	
@Test
public void LoginTest2(){
	
LoginPage Loginobj = new LoginPage();

String uname =sheet.getRow(1).getCell(0).getStringCellValue();
String pass =sheet.getRow(1).getCell(1).getStringCellValue();

Loginobj.login(uname, pass);

}	
	
}

