package ru.home.test.selenium.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
  private WebDriver wd;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
    login("admin", "admin");
  }

  private void login(String username, String password) {
    wd.findElement(By.name("username")).click();
    wd.findElement(By.name("username")).clear();
    wd.findElement(By.name("username")).sendKeys(username);
    wd.findElement(By.name("password")).clear();
    wd.findElement(By.name("password")).sendKeys(password);
    wd.findElement(By.name("login")).click();
  }

  @Test
  public void testLogin() throws Exception {
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pages'])[1]/following::span[2]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}

