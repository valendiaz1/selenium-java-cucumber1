package pages;

import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class GooglePage extends BasePage {
    private String inputToSearch = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]";
    private String buttonSearch = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]";
    private String resultsSearch = "//h3[contains(text(),'Gtx 1660 Ti | MercadoLibre')]";


    public GooglePage() {
        super(driver);
    }

    public void navigatetoGoogle() {
        navigateTo("https://www.google.com/");
    }
    public void enterCriteria(String criteria) {
        write(inputToSearch, criteria);
    }
    public void clickGoogleSearch() throws NoSuchElementException {
        clickElementByxpath(buttonSearch);
    }
    public String resultGoogleSearch() {
        return textFromElement(resultsSearch);
    }






}
