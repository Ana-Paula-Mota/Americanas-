package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);

	}

	public void abrirNavegador(String url) {
	   System.setProperty("webdriver.chromer,driver", "./driver/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
	   
   }

}
