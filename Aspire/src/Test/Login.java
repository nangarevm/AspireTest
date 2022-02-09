package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ad\\Desktop\\selenium-java-4.1.2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://aspireapp.odoo.com");
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement login= driver.findElement(By.xpath("/html//input[@id='login']"));
		login.sendKeys("user@aspireapp.com");
		WebElement Pass=driver.findElement(By.xpath("/html//input[@id='password']"));
		Pass.sendKeys("@sp1r3app");
		WebElement Login=driver.findElement(By.xpath("/html//div[@id='wrapwrap']//div[@class='container py-5']/div//form[@role='form']//button[@type='submit']"));
		Login.click();
		
		WebElement Inventory=driver.findElement(By.xpath("//body//div[@role='listbox']/a[2]/div[@class='o_app_icon']"));
		WebElement ManuFact=driver.findElement(By.xpath("//div[@role='listbox']/a[3]"));
    	Inventory.click();
	
		WebElement prd=driver.findElement(By.xpath("//nav[@class='o_main_navbar']/div[1]//button[@title='Products']/span[.='Products']"));
		prd.click();
		WebElement Iprd=driver.findElement(By.xpath("//body[@class='o_web_client']//nav[@class='o_main_navbar']/div[1]//a[@href='#menu_id=124']"));
		Iprd.click();
        
		WebElement Create=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']//div[@class='o_control_panel']//div[@role='toolbar']//button[@title='Create record']"));
	    Create.click();
		
	    WebElement Prd=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']/div[@class='o_content']//div[@class='o_form_sheet_bg']//input[@name='name']"));
	    Prd.clear();
	    Prd.sendKeys("MyTestPrd10");
	    
	    WebElement Save=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']//div[@class='o_control_panel']//div[@class='o_cp_bottom_left']/div[@role='toolbar']/div/div[2]/button[@title='Save record']"));
	    Save.click();
	    
	 //   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    WebElement UpQ=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']//div[@class='o_form_sheet_bg']//button[@name='action_update_quantity_on_hand']/span[.='Update Quantity']"));
      UpQ.click();	  
	
	 //   Actions actions = new Actions(driver);		   
	  //  actions.moveToElement(UpQ).click().perform();
	    
	  //  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  //  jse.executeScript("arguments[0].scrollIntoView()", UpQ); 
	 //  UpQ.submit();
	 //   WebDriverWait wait = new WebDriverWait(driver,30);
	 //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']//div[@class='o_form_sheet_bg']//button[@name='action_update_quantity_on_hand']/span[.='Update Quantity']")));
	    // click on the compose button as soon as the "compose" button is visible
	  //  driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']//div[@class='o_form_sheet_bg']//button[@name='action_update_quantity_on_hand']/span[.='Update Quantity']")).click();
	  //  System.out.println("UpQ");
    
	   WebElement UpCr=driver.findElement(By.xpath("//body[@class='o_web_client']//div[@class='o_control_panel']//div[@class='o_cp_bottom_left']/div[@role='toolbar']/div[@role='toolbar']/button[4]"));
	    UpCr.click();
	    System.out.println("UpCr");
	    WebElement UpQN=driver.findElement(By.cssSelector(".o_counted_quantity_widget_cell.o_data_cell.o_field_cell.o_list_number > input[name='inventory_quantity']"));
	    UpQN.clear();
	    UpQN.sendKeys("100");
	    System.out.println("UpQN");
	    WebElement SvQ=driver.findElement(By.cssSelector("div[role='toolbar'] > button[title='Save record']"));
	    SvQ.click();
	    System.out.println("SvQ");
	    
	     
     
	    driver.findElement(By.xpath("//body[@class='o_web_client']//nav[@class='o_main_navbar']/a[@title='Home menu']")).click();
	    ManuFact.click();
	    
	    WebElement Mcrt=driver.findElement(By.xpath("//body[@class='o_web_client']//div[@class='o_control_panel']//div[@class='o_cp_bottom_left']/div[@role='toolbar']/div[@role='toolbar']/button[3]"));
	    Mcrt.click();
		// driver.close();
	    
	    WebElement send=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']/div[@class='o_content']/div/div[@class='o_form_sheet_bg']/div[2]/div[@class='o_group']/table[1]//div[@name='product_id']//input[@type='text']"));
	    send.clear();
	    send.sendKeys("MyTestPrd");
	    
	   WebElement Conferm=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']//div[@class='o_form_sheet_bg']//button[@name='action_confirm']/span[.='Confirm']"));
	  Conferm.click();
	  
	  WebElement MAdone=driver.findElement(By.xpath("//body[@class='o_web_client']/div[@class='o_action_manager']/div[@class='o_action o_view_controller']//div[@class='o_form_sheet_bg']//div[@class='o_statusbar_buttons']/button[4]/span[.='Mark as Done']"));
	  MAdone.click();
	
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	  
	  
	  alert.accept();
	  
      driver.close();
	
	}

}
