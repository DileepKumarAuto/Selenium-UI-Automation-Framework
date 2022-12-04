package com.san.pages;

import com.san.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class OrangeHRMHomepage extends BasePage{

    private final By link_welcome = By.xpath("//p[@class='oxd-userdropdown-name']");
    private final By link_logout =  By.xpath("//a[contains(text(), 'Logout')]");

    public OrangeHRMHomepage clickWelcome(){
        click(link_welcome, WaitStrategy.CLICKABLE);
        return this;
    }

    public OrangeHRMLoginpage clickLogout(){
        click(link_logout, WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginpage();
    }
}
