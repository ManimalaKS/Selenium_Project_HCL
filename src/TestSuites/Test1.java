package TestSuites;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestNG;
import org.testng.annotations.Test;


public class Test1 extends TestBase{

    @Test(dataProvider = "StudentData")
    public void fillUserForm(String name, String subject1,String subject2,String subject3,String subject4,String subject5) throws InterruptedException
    {
    	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("pass");
		WebElement login_button=driver.findElement(By.xpath("//button[text()='Login']"));
		login_button.click();
		Thread.sleep(5000);
		WebElement add_student=driver.findElement(By.xpath("//a[contains(text(),'Add Student')]"));
		add_student.click();
        WebElement name1=driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println("Entering the Name of the Student");
		name1.sendKeys(name);
		WebElement subject_01=driver.findElement(By.xpath("//app-create-student/div/form/div[2]/input"));
		System.out.println("Entering the Subject 1 Mark");
		subject_01.sendKeys(subject1);
		WebElement subject_02=driver.findElement(By.xpath("//app-create-student/div/form/div[3]/input"));
		System.out.println("Entering the Subject 2 Mark");
		subject_02.sendKeys(subject2);
		WebElement subject_03=driver.findElement(By.xpath("//app-create-student/div/form/div[4]/input"));
		System.out.println("Entering the Subject 3 Mark");
		subject_03.sendKeys(subject3);
		WebElement subject_04=driver.findElement(By.xpath("//app-create-student/div/form/div[5]/input"));
		System.out.println("Entering the Subject 4 Mark");
	    subject_04.sendKeys(subject4);
		WebElement subject_05=driver.findElement(By.xpath("//app-create-student/div/form/div[6]/input"));
		System.out.println("Entering the Subject 5 Mark");
		subject_05.sendKeys(subject5);
		Select select=new Select(driver.findElement(By.xpath("//select[@id='passpercentage']")));
		select.selectByIndex(0);
		WebElement submit_button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		submit_button.submit();
		Thread.sleep(5000);
		WebElement student_list=driver.findElement(By.partialLinkText("Student List"));
		student_list.click();
    }

}
