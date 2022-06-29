package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends libglobal {

	public loginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

@FindBy(id="username")
 WebElement txtUserName;
@FindBy(id="password")
 WebElement txtPassword;
@FindBy(id="login")
 WebElement btnLogin;

public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnLogin() {
	return btnLogin;
}
public void setTxtUserName(WebElement txtUserName) {
	this.txtUserName = txtUserName;
}
public void setTxtPassword(WebElement txtPassword) {
	this.txtPassword = txtPassword;
}
public void setBtnLogin(WebElement btnLogin) {
	this.btnLogin = btnLogin;
}
public void login(String username, String password) {
	insertText(getTxtUserName(), username);
	insertText(getTxtPassword(), password);
	btnClick(getBtnLogin());
}


}
