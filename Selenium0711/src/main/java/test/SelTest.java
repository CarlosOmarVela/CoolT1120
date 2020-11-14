package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {
	public static void main(String[] args) {
		System.out.println("print");
		//Setear el Path del driver
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;
		//Identificando el ejecutable para el driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");
		//Creación en tiempod e ejecución de nuestro ChromeDriver
		WebDriver driver = new ChromeDriver();
		//Abrir la url en el navegador
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
		
		driver.close();
		driver.quit();
	}
}
