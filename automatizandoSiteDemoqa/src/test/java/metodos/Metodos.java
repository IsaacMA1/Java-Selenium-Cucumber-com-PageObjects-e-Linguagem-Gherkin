package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import driver.Drivers;

public class Metodos extends Drivers {

	/**
	 * Método para escrever passando o parametro By e String com texto
	 * 
	 * @param elemento
	 * @param texto
	 */

	public void escrever(By elemento, String texto) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever no elemento " + elemento);
		}
	}

	/**
	 * Método para clicar passando o parametro By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {

		try {

			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento " + elemento);
		}
	}

	/**
	 * Método para validar url capturada
	 * 
	 * @param urlDesejada
	 */

	public void currentUrl(String urlDesejada) {

		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a url desejada" + urlDesejada);
		}

	}

	public void fecharNavegador() {

		driver.quit();
	}

	/**
	 * Método para validar mensagens passando o By e a mensagem esperada
	 * 
	 * @param elemento
	 * @param MensagemEsperada
	 */
	public void validarTexto(By elemento, String MensagemEsperada) {

		try {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(MensagemEsperada, msgCapturada);

		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem" + MensagemEsperada);

		}

	}

	public void evidencia(String nomeEvidencia) {

		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void pause(int tempo) {

		try {
			Thread.sleep(tempo);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void voltarAba() {

		String janelaAtual = driver.getWindowHandle();
		Set<String> janelas = driver.getWindowHandles();

		for (String janela : janelas) {
			driver.switchTo().window(janela);
			System.out.println("Endereço do site " + driver.getCurrentUrl());
		}

	}

	public void scroll(int valor) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0," + valor + ")", "");

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void avancarNavegacao() {

		driver.navigate().forward();
	}

	public void scrollAteOFinal() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void mouseClickDireito(By locator) throws AWTException {

		try {
			Actions actions = new Actions(driver);
			WebElement elemento = driver.findElement(locator);
			actions.contextClick(elemento).perform();
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem");

		}
	}

	public void mouseDoubleClick(By locator) throws AWTException {

		try {
			Actions actions = new Actions(driver);
			WebElement elemento = driver.findElement(locator);
			actions.doubleClick(elemento).perform();
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem");

		}
	}

	public void uploadArquivo(String descricaoPasso) throws AWTException {

		try {
		Robot robot = new Robot();
		robot.delay(1000);
		StringSelection ss = new StringSelection("C:\\Users\\isaac\\Downloads\\images");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000);
		} catch (Exception e) {
			
			System.err.println("Erro ao tentar validar a mensagem" + descricaoPasso);
		}
	}
	public void clicarEmUmaParteComCoordenadas(By locator) throws AWTException {
		
		Actions actions = new Actions(driver);
		WebElement elemento = driver.findElement(locator);
		actions.moveToElement(elemento, -10, -10);
		actions.click();
		actions.perform();
		
		
	}
	public void pressionarEMover(By locator) {
		
		Actions actions = new Actions(driver);
		WebElement elemento = driver.findElement(locator);
		actions.clickAndHold(elemento).build().perform();
		actions.moveByOffset(250, 50).build().perform();
		actions.release().build().perform();
	}
}
