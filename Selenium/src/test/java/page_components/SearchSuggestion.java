package page_components;

import abstract_component.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchSuggestion extends AbstractComponent {

    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    private WebDriverWait wait;

    public SearchSuggestion(final WebDriver driver){
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver, this);
    }

    public void clickSuggestionByIndex(int index){
        this.suggestions.get(index - 1).click();
    }

    @Override
    public boolean isDisplayed(){
        return false;
    }

}
