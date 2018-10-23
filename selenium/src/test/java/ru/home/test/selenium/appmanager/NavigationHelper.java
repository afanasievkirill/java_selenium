package ru.home.test.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void pages() {
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pages'])[1]/following::span[2]"));
  }
}
