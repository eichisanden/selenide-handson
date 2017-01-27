package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RedminDemoPage {
    @FindBy(css = ".login")
    private SelenideElement loginLink1;

    private SelenideElement loginLink2 = $(byClassName("login"));

    public RedminDemoPage ログインリンクをクリック() {
        loginLink1.click();
        return this;
    }

    public RedminDemoPage ログイン() {
        $(byName("username")).val("manager");
        $(byName("password")).val("manager").pressEnter();
        return this;
    }

    public RedminDemoPage マイページをクリック() {
        $(byClassName("my-page")).click();
        return this;
    }

    public RedminDemoPage プロジェクトをクリック() {
        $(byClassName("projects")).click();
        return this;
    }

    public RedminDemoPage デモ用プロジェクトへ() {
        ElementsCollection links = $$(byClassName("project"));
        links.get(0).click();
        return this;
    }

    public RedminDemoPage デモ用プロジェクトへプルダウンから選択() {
        SelenideElement pulldown = $(byName("project_quick_jump_box"));
        pulldown.selectOptionContainingText("デモ");
        return this;
    }
}
