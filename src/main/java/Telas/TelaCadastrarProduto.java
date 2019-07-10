package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaCadastrarProduto {
	
	private WebDriver driver;
	 
    public TelaCadastrarProduto(WebDriver driver) {
      this.driver = driver;
    }

/********************************************************************
* @category Clicar no botao para cadastrar novo produto
********************************************************************/
    public TelaCadastrarProduto NovoProduto() {
      driver.findElement(By.linkText("Novo Produto")).click();
      return this;
    }

/********************************************************************
* @category Digitar o nome do produto para cadastro
********************************************************************/
    public TelaCadastrarProduto NomeProduto(String produto) {
      driver.findElement(By.id("campo1")).sendKeys(produto);
      return this;
    }

/********************************************************************
* @category Digitar o preco do produto digitado
*********************************************************************/
    public TelaCadastrarProduto Preco(String preco) {
        driver.findElement(By.name("price")).sendKeys(preco);
        return this;
      }
   
/********************************************************************
* @category Clicar no campo do calendario
********************************************************************/    
    public TelaCadastrarProduto TocarData() {
        driver.findElement(By.id("campo3")).click();
        return this;
      }
    
/********************************************************************
* @category Selecionar data no calendario
* ********************************************************************/    
    public TelaCadastrarProduto SelecionarData() {
        driver.findElement(By.cssSelector("td[class='day'")).click();
        return this;
      }
    
/********************************************************************
* @category Clicar no botao para salvar produto
********************************************************************/    
    public TelaCadastrarProduto Salvar() {
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
        return this;
      }
    
    public TelaCadastrarProduto VerificarProdutoCadastrado() {
		 driver.findElement(By.cssSelector("tr[class='ng-scope']")).getText().equals("Iphone X");
       return this;
     }
    
    

}
