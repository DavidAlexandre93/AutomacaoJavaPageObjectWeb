package Testes;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ChamadaMassa;
import Constante.ScreenShotCapture;
import Constante.Utils;
import Funcoes.ConfigFunction;
import Telas.TelaCadastrarProduto;
import Telas.TelaDigitarNome;

/********************************************************************
 * @category Teste para realizar cadastro de produtos
 ********************************************************************/

public class CadastrarProduto {
	
	private WebDriver driver;
	
	ChamadaMassa massaDados = new ChamadaMassa();
	//ScreenShotCapture telaScreen = new ScreenShotCapture();
	
	@Before
	public void IniciarBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void RealizarCadastroProduto() {
		
		
		
		try {
			
			JSONObject obj = massaDados.dadosJson();
			
			ConfigFunction config = new ConfigFunction(driver);
			TelaCadastrarProduto produto = new TelaCadastrarProduto(driver);
			TelaDigitarNome nome = new TelaDigitarNome(driver);
			
		config.acessar();
		ScreenShotCapture.screenShot();
		nome.Nome((String)obj.get("nome"));
		ScreenShotCapture.screenShot();
		nome.Confirmar();
		ScreenShotCapture.screenShot();
		produto.NovoProduto();
		ScreenShotCapture.screenShot();
		produto.NomeProduto((String)obj.get("produto"));
		ScreenShotCapture.screenShot();
		produto.Preco((String)obj.get("valor"));
		ScreenShotCapture.screenShot();
		produto.TocarData();
		ScreenShotCapture.screenShot();
		produto.SelecionarData();
		ScreenShotCapture.screenShot();
		produto.Salvar();
		ScreenShotCapture.screenShot();
		Utils.WaitElement();
		Utils.AlertOK();
		Utils.WaitElement();
		ScreenShotCapture.screenShot();
		produto.VerificarProdutoCadastrado();
		ScreenShotCapture.arquivosDir();
		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	
	}
	
	@After
	public void FinalizarExecucao() {
		driver.quit();
	}
	
	
}
