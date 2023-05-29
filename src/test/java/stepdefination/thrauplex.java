package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class thrauplex 
{
	WebDriver driver;
	@Given("enter the url in chrome")
	public void enter_the_url_in_chrome() {
		 driver =new ChromeDriver();
		   WebDriverManager.chromedriver().setup();
		   driver.manage().window().maximize();
		   driver.get("https://therauplex.com/angioplasty-services/");
	}

	@Then("click on home page")
	public void click_on_home_page() 
	{
	   
	   System.out.println("home page lauched sucessfully");
	   	   
	}

	@Then("click on patients module")
	public void click_on_patients_module()
	{
	   driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
	}

	@Then("open submodule and click on general haelthcare")
	public void open_submodule_and_click_on_general_haelthcare() 
	{
		driver.findElement(By.xpath("(//a[@href=\"#\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/patients/general-healthcare/\"])[1]")).click();
	}

	@Then("open the submodule and click on kidney care")
	public void open_the_submodule_and_click_on_kidney_care() 
	{
		driver.findElement(By.xpath("(//a[@href=\"#\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/patients/kidney-care/\"])[1]")).click();
	}

	@Then("open the submodule and click on nutritional care")
	public void open_the_submodule_and_click_on_nutritional_care() 
	{
		driver.findElement(By.xpath("(//a[@href=\"#\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/patients/nutritional-care/\"])[1]")).click();
	}

	@Then("open the submodule and click on respiratory care")
	public void open_the_submodule_and_click_on_respiratory_care() 
	{
		driver.findElement(By.xpath("(//a[@href=\"#\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/patients/respiratory-care/\"])[1]")).click();
	}
	///////////////////////////////////////////
	
	@Then("click on hospital care")
	public void click_on_hospital_care() {
		driver.findElement(By.xpath("(//a[@href=\"#\"])[2]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/hcprofessionals/hospital-care/\"])[1]")).click();
	}

	@Then("click on kidney care")
	public void click_on_kidney_care() {
		driver.findElement(By.xpath("(//a[@href=\"#\"])[2]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/hcprofessionals/kidney-care/\"])[1]")).click();
	}

	@Then("open submodule and click on nutrition care")
	public void open_submodule_and_click_on_nutrition_care() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a [@href=\"https://therauplex.com/hcprofessionals/nutritional-care/\"])[1]")).click();
	}

	@Then("open the submodule and click on primay care")
	public void open_the_submodule_and_click_on_primay_care() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/hcprofessionals/primary-care/\"])[1]")).click();
	}
	@Then("open the submodule and click on respiratory care")
	public void open_the_submodule_and_click_on_respiratory_cares() 
	{
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/hcprofessionals/respiratory-care/\"])[1]")).click();
	}

	@Then("open the submodule and click on surgical care")
	public void open_the_submodule_and_click_on_surgical_care() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/hcprofessionals/surgical-care/\"])[1]")).click();
	}//"(//a[@href=\"https://therauplex.com/hcprofessionals/surgical-care/\"])[1]"
	//"(//a[@href=\"https://therauplex.com/hcprofessionals/respiratory-care/\"])[1]"
	
	
	@Then("click on community engagement")
	public void click_on_community_engagement() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/perspectives/community-engagement/\"])[1]")).click();
	}

	@Then("click on healthcare insight")
	public void click_on_healthcare_insight() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/perspectives/health-care-insights/\"])[1]")).click();
	}

	@Then("open submodule and click on patients stories")
	public void open_submodule_and_click_on_patients_stories() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/perspectives/patients-stories/\"])[1]")).click();
	}

	@Then("open the submodule and click on people of thrauplex")
	public void open_the_submodule_and_click_on_people_of_thrauplex() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/perspectives/people-of-therauplex/\"])[1]")).click();
	}

	@Then("click on community corporate responsibility")
	public void click_on_community_corporate_responsibility() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/our_story/corporate-responsibility/\"])[1]")).click();
	}

	@Then("click on Diversity,Equity and inclusion")
	public void click_on_diversity_equity_and_inclusion() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/our_story/diversity-equity-and-inclusion/\"])[1]")).click();
	}

	@Then("open submodule and click on fueling collaborative innovation")
	public void open_submodule_and_click_on_fueling_collaborative_innovation() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/our_story/fueling-collaborative-innovation/\"])[1]")).click();
	}

	@Then("open the submodule and click on our Governance")
	public void open_the_submodule_and_click_on_our_governance() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/our_story/our-governance/\"])[1]")).click();
	}

	@Then("open the submodule and click on our history")
	public void open_the_submodule_and_click_on_our_history() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/our_story/our-history/\"])[1]")).click();
	}

	@Then("open the submodule an click on our leadership")
	public void open_the_submodule_an_click_on_our_leadership() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/our_story/our-leadership/\"])[1]")).click();
	}

	@Then("click on the contact us")
	public void click_on_the_contact_us() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/contact-us/\"])[1]")).click();
	}

	@Then("click on the partners and suppliers")
	public void click_on_the_partners_and_suppliers() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/partners-and-suppliers/\"])[1]")).click();
	}

	@Then("click onn the carrers")
	public void click_onn_the_carrers() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/careers/\"])[1]")).click();
	}

	@Then("click on the Blog")
	public void click_on_the_blog() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/blog/\"])[1]")).click();
	}

	@Then("click on the investor relations")
	public void click_on_the_investor_relations() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/investor-relations/\"])[1]")).click();
	}

	@Then("click on ACT")
	public void click_on_act() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-17232\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://therauplex.com/act/\"])[1]")).click();
	}
}  
