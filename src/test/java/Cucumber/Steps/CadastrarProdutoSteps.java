package Cucumber.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ScreenShotCapture;

public class CadastrarProdutoSteps {
	
private static WebDriver driver;
	
public static void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://desafio-qa.geofusion.com.br/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ScreenShotCapture.screenShot();
	}
	
public static void DigitarNome() {	
		 driver.findElement(By.id("owner")).sendKeys("Juliano");
		 ScreenShotCapture.screenShot();
	}

public static void  ClicarConfirmar() {	
	 driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();	
}

public static void NovoProduto() {	
	ScreenShotCapture.screenShot();
    driver.findElement(By.linkText("Novo Produto")).click();
}
	
public static void NomeProduto() {	
	ScreenShotCapture.screenShot();
    driver.findElement(By.id("campo1")).sendKeys("Iphone X");
}

public static void PrecoProduto() {	
	ScreenShotCapture.screenShot();
    driver.findElement(By.name("price")).sendKeys("3000");
}

public static void ClicarCampoCalendar() {	
	ScreenShotCapture.screenShot();
    driver.findElement(By.id("campo3")).click();
}

public static void SelecionarDate() {
	ScreenShotCapture.screenShot();
    driver.findElement(By.cssSelector("td[class='day'")).click();
}

public static void ClicarSalvar() {	
	ScreenShotCapture.screenShot();
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}

public static void ValidarProdutoCadastrado() {	
	ScreenShotCapture.screenShot();
	driver.findElement(By.cssSelector("tr[class='ng-scope']")).getText().equals("Iphone X");
}

public static void ClicarOK() {	
	ScreenShotCapture.screenShot();
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

public static void Evidencias() throws Exception {
	ScreenShotCapture.screenShot();
	ScreenShotCapture.arquivosDir();	
	}

}
