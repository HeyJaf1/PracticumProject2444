import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Order {
    private WebDriver driver;

    private final By orderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    private final By orderButton2 = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");
    //Поле ввод имени
    private final By name = By.xpath(".//input[contains(@placeholder, 'Имя')]");
    private final By surName = By.xpath(".//input[contains(@placeholder, 'Фамилия')]");
    private final By deliveryAddress = By.xpath(".//input[contains(@placeholder, 'Адрес: куда привезти заказ')]");
    private final By metroStation = By.xpath(".//input[@class='select-search__input']");
    private final By metroStation1 = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    private final By mobil = By.xpath(".//input[contains(@placeholder, 'Телефон: на него позвонит курьер')]");
    private final By next = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']");

    public Order(WebDriver driver) { this.driver = driver; }

    //кликнуть Заказать
    public void clickOrder(String userName, String surname, String address, String phoneNumber) {
        driver.findElement(orderButton).isEnabled();
        driver.findElement(orderButton).click();
        //проверяем есть ли поле имя
        driver.findElement(name).isEnabled();
        driver.findElement(name).sendKeys(userName);
        driver.findElement(surName).sendKeys(surname);
        driver.findElement(deliveryAddress).sendKeys(address);
        driver.findElement(metroStation).click();
        driver.findElement(metroStation1).click();
        driver.findElement(mobil).sendKeys(phoneNumber);
        driver.findElement(next).click();

    }
}
