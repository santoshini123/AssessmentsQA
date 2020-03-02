package Testing;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JeevanSathi {
			static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/jagriti.sharma/selenium/chromedriver/chromedriver.exe");
	    //System.setProperty("webdriver.gecko.silentOutput", "true");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
		//getting link
				String homePage = "https://www.jeevansathi.com/";
				driver.get(homePage);
				
				//initializing explicit wait 
				WebDriverWait wait = new WebDriverWait(driver, 60);
				
				//finding login and clicking it 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("loginTopNavBar"))).click();
				
				//validating login button
				String loginStatus = driver.getCurrentUrl();
				if(loginStatus.equalsIgnoreCase(loginStatus))
					System.out.println("Login Button is verified");
				
				//finding register free button and clicking it 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("loginRegistration"))).click();
				
				//validating register free button
				String registerStatus = driver.getCurrentUrl();
				if(registerStatus.equalsIgnoreCase(registerStatus))
					System.out.println("Register Free Button is verified");
				
				//entering email
				WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_value")));
				email.click();
				//generating random emails and sending 
				Random randomGenerator = new Random();  
				int randomInt = randomGenerator.nextInt(100000); 
				email.sendKeys("user"+randomInt+"@gmail.com");
				
				//validating email
				String emailStatus = email.getAttribute("value");
				if(emailStatus.equalsIgnoreCase(emailStatus))
					System.out.println(emailStatus+" is verified");
				
				//finding and clicking mobile number
				wait.until(ExpectedConditions.elementToBeClickable(By.id("phone_box"))).click();
				
				//entering mobile number
				String generatedMobileString = RandomStringUtils.randomNumeric(8);
				WebElement mobileValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("mobile_value")));		
				mobileValue.sendKeys("98"+generatedMobileString);
				
				//validating phone number
				String phoneStatus = mobileValue.getAttribute("value");
				if(phoneStatus.equalsIgnoreCase(phoneStatus))
					System.out.println(phoneStatus+" is verified");
				
				//finding and entering password 
				WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password_value")));
				password.click();
				String generatedPassString = RandomStringUtils.randomAlphanumeric(10);
				password.sendKeys(generatedPassString);
				
				//validating password
				String passwordStatus = password.getAttribute("value");
				if(passwordStatus.equalsIgnoreCase(passwordStatus))
					System.out.println(passwordStatus+" is verified");
				
				//finding profile
				wait.until(ExpectedConditions.elementToBeClickable(By.id("cpf_box"))).click();
				
				//creating profile for Self 
				WebElement profileSelf = wait.until(ExpectedConditions.elementToBeClickable(By.id("li_cpf0")));
				profileSelf.click();
				
				//validating selected profile
				String profileStatus = profileSelf.getText();
				if(profileStatus.equalsIgnoreCase(profileStatus))
					System.out.println(profileStatus+" profile is verified");
				
				//finding gender
				wait.until(ExpectedConditions.elementToBeClickable(By.id("gender_box"))).click();
				
				//clicking gender male
				WebElement genderMale = wait.until(ExpectedConditions.elementToBeClickable(By.id("li_gender0")));
				genderMale.click();
				
				//validating selected gender
				String genderStatus = genderMale.getText();
				if(genderStatus.equalsIgnoreCase(genderStatus))
					System.out.println(genderStatus+" gender is verified");
				
				//clicking on registerme
				wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage1Submit"))).click();
				
				//validating registerme button
				String registerMeStatus = driver.getCurrentUrl();
				if(registerMeStatus.equalsIgnoreCase(registerMeStatus))
					System.out.println("Register Me Button is verified");
				
				//find groom name
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='name_box']"))).click();
				
				Thread.sleep(3000);
				
				//sending data to groom name 
				String generatedNameString = RandomStringUtils.randomAlphabetic(10);
				WebElement groomName = wait.until(ExpectedConditions.elementToBeClickable(By.id("name_value")));
				groomName.sendKeys(generatedNameString+" "+generatedNameString);
				
				//date of birth element 
				//wait.until(ExpectedConditions.elementToBeClickable(By.id("dob_box"))).click();
				
				//clicking and selecting date
				/*driver.findElement(By.xpath("//div[@id='dob_box']")).click();
				
				String date="18-September-2017";
				String dateArr[]=date.split("-");
				String day=dateArr[0];
				String month=dateArr[1];
				String year=dateArr[2];
				
				Select selectDate=new Select(driver.findElement(By.xpath("//li[@id='li_dob1']")));
				selectDate.selectByVisibleText(day);
				Select selectMonth=new Select(driver.findElement(By.xpath("//span[@id='month_value']")));
				selectMonth.selectByVisibleText(month);
				Select selectYear=new Select(driver.findElement(By.xpath("////span[@id='year_value'] ")));
				selectYear.selectByVisibleText(year);
				
				*/
				//finding mother tongue box 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mtongue-inputBox_set']"))).click();
				
				//selecting mother tongue
				WebElement tongue=wait.until(ExpectedConditions.elementToBeClickable(By.id("mtongue_0")));
				tongue.click();
				
				//religion box selection
				wait.until(ExpectedConditions.elementToBeClickable(By.id("religion-inputBox_set"))).click();
				
				//selecting religion
				wait.until(ExpectedConditions.elementToBeClickable(By.id("religion_0"))).click();
				
				//selecting caste box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("caste-inputBox_set"))).click();

				//clicking on caste option
				wait.until(ExpectedConditions.elementToBeClickable(By.id("caste_7"))).click();
				
				//manglik box selection
				wait.until(ExpectedConditions.elementToBeClickable(By.id("manglik_box"))).click();
				
				//selecting option of manglik
				wait.until(ExpectedConditions.elementToBeClickable(By.id("li_manglik0"))).click();
				
				//selecting horoscope box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("horoscopeMatch_box"))).click();
				
				//selecting horoscope option
				wait.until(ExpectedConditions.elementToBeClickable(By.id("li_horoscopeMatch1"))).click();
				
				//marital status box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("mstatus_box"))).click();
				
				//marital status selection
				wait.until(ExpectedConditions.elementToBeClickable(By.id("mstatus_0"))).click();
				
				//selecting height box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("height_box"))).click();
				
				//selecting height
				wait.until(ExpectedConditions.elementToBeClickable(By.id("height_25"))).click();
				
				//clicking on continue button
				wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage2Submit"))).click();
				
				//country box on step 3
				//selecting country as india
				wait.until(ExpectedConditions.elementToBeClickable(By.id("countryReg_0"))).click();
				
				//state box on step 3
				wait.until(ExpectedConditions.elementToBeClickable(By.id("stateReg_box"))).click();
						
				//selecting state as haryana
				wait.until(ExpectedConditions.elementToBeClickable(By.id("stateReg_11"))).click();
				
				//city box on step 3
				wait.until(ExpectedConditions.elementToBeClickable(By.id("cityReg_box"))).click();
						
				//selecting city as faridabad
				wait.until(ExpectedConditions.elementToBeClickable(By.id("cityReg_4"))).click();
				
				//pin box on step 3
				wait.until(ExpectedConditions.elementToBeClickable(By.id("pin_box"))).click();
						
				//selecting pincode
				wait.until(ExpectedConditions.elementToBeClickable(By.id("pin_value"))).sendKeys("121001");
				
				// highest degree box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("hdegree_box"))).click();
				
				//highest degree selection
				wait.until(ExpectedConditions.elementToBeClickable(By.id("hdegree_0"))).click();
				
				//employed box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("employed_in-inputBox_set"))).click();
				
				//selecting employment
				wait.until(ExpectedConditions.elementToBeClickable(By.id("employed_in_0"))).click();
				
				//occupation box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("occupation-inputBox_set"))).click();
				
				//selecting occupation
				wait.until(ExpectedConditions.elementToBeClickable(By.id("occupation_57"))).click();
						
				//annual income box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("income_box"))).click();
				
				//selecting income
				wait.until(ExpectedConditions.elementToBeClickable(By.id("income_5"))).click();
				
				//about me box 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("aboutme_box"))).click();
				
				//about me
				String generatedAboutMeString = RandomStringUtils.randomAlphabetic(30);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("aboutme_value"))).sendKeys(generatedAboutMeString);
				
				Thread.sleep(5000);
				
				//clicking on submit button 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage3Submit"))).click();
				

				//validating submit button
				String submitStatus = driver.getCurrentUrl();
				if(submitStatus.equalsIgnoreCase(submitStatus))
					System.out.println("Submit Button is verified");
				
				//family type box 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("familyType_box"))).click();
				
				//selecting family type
				wait.until(ExpectedConditions.elementToBeClickable(By.id("li_familyType1"))).click();
				
				//father's occupation box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("fatherOccupation_box"))).click();
				
				//selecting father's occupation
				wait.until(ExpectedConditions.elementToBeClickable(By.id("fatherOccupation_2"))).click();
				
				//mother's occupation box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("motherOccupation_box"))).click();
				
				//selecting mother's occupation
				wait.until(ExpectedConditions.elementToBeClickable(By.id("motherOccupation_1"))).click();
				
				//brother box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("brother_box"))).click();
				
				//selecting brother info
				wait.until(ExpectedConditions.elementToBeClickable(By.id("li_brother1"))).click();
				
				//sister box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("sister_box"))).click();
				
				//selecting sister info
				wait.until(ExpectedConditions.elementToBeClickable(By.id("li_sister1"))).click();
				
				//family living in box 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("familyState-inputBox_set"))).click();		
				
				//family selected place
				wait.until(ExpectedConditions.elementToBeClickable(By.id("familyState_11"))).click();	
				
				//family city 
				wait.until(ExpectedConditions.elementToBeClickable(By.id("familyCity-inputBox_set"))).click();		
				
				//family selected place
				wait.until(ExpectedConditions.elementToBeClickable(By.id("familyCity_4"))).click();	
				
				//contact address box
				wait.until(ExpectedConditions.elementToBeClickable(By.id("address_box"))).click();	
				
				//contact address
				String generatedAddressString = RandomStringUtils.randomAlphanumeric(10);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("address_value"))).sendKeys(generatedAddressString);
				
				//about family
				
				WebElement aboutfam = wait.until(ExpectedConditions.elementToBeClickable(By.id("aboutfamily_value"))); 
				aboutfam.click();
				aboutfam.sendKeys(generatedAboutMeString);
				
				//add to profile button
				wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage1Submit"))).click();
				
				//logout button cursp fontreg color5 mt6
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cursp fontreg color5 mt6']"))).click();
				
				
				
				
			}

		
	}

		
	


