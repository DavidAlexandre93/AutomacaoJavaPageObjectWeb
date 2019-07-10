package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaDigitarNome {
	
	private WebDriver driver;
	 
	 public TelaDigitarNome(WebDriver driver) {
	   this.driver = driver;
	 }

	 
/********************************************************************
* @category Digitar nome do usuario
********************************************************************/
	 public TelaDigitarNome Nome(String nome) {
		 driver.findElement(By.id("owner")).sendKeys(nome);
		 return new TelaDigitarNome(driver);
	}

/********************************************************************
* @category Clicar no botao para confirmar acesso
********************************************************************/
	public TelaDigitarNome Confirmar() {
		 driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		 return new TelaDigitarNome(driver);
	}

}
