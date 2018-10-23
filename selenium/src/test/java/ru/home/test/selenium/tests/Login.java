package ru.home.test.selenium.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends TestBase {

  @Test
  public void testLogin()  {
    wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pages'])[1]/following::span[2]")).click();
  }

}




