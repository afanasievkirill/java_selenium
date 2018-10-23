package ru.home.test.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
    sessionHelper = new SessionHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper.login("admin", "admin");
  }

  public void stop() {
    wd.quit();
  }

  public NavigationHelper goTo(){
    return navigationHelper;
  }

}
