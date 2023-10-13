
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

import org.junit.jupiter.api.Test;

public class test {
	
	  @Test
	  void goBackAndForce() {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://play1.automationcamp.ir/multi_window.html");
      Page page1 = page.waitForPopup(() -> {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Open New Window 1")).click();
      });
      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Click Me 2")).click();
    }
  }
}