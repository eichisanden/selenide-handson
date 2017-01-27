package scinario;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import page.RedminDemoPage;

public class RedmineDemoTest {

    @BeforeClass
    public static void setUp() {
        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void testRedmneDemoSite() {
        RedminDemoPage redminDemoPage = Selenide.open("https://my.redmine.jp/demo/", RedminDemoPage.class);
        redminDemoPage
                .ログインリンクをクリック()
                .ログイン()
                .マイページをクリック()
                .プロジェクトをクリック()
                .マイページをクリック()
                .デモ用プロジェクトへプルダウンから選択();
    }
}
