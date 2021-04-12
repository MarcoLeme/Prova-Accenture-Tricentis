package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// ***********************************************************
	// ELEMENTOS WEB ENCAPSULADOS
	// ***********************************************************
	
	

	private By make = By.id("make");
	private By model = By.id("model");
	private By cylindercapacity = By.id("cylindercapacity");
	private By engineperformance = By.id("engineperformance");
	private By dateofmanufacture = By.id("dateofmanufacture");
	private By numberofseats = By.id("numberofseats");
	private By righthanddriveyes = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[7]/p[1]/label[1]/span[1]");
	private By numberofseatsmotorcycle = By.id("numberofseatsmotorcycle");
	private By fuel = By.id("fuel");
	private By payload = By.id("payload");
	private By totalweight = By.id("totalweight");
	private By listprice = By.id("listprice");
	private By licenseplatenumber = By.id("licenseplatenumber");
	private By annualmileage = By.id("annualmileage");
	private By nextenterinsurantdata = By.id("nextenterinsurantdata");
	
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By birthdate = By.id("birthdate");
	private By gendermale = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]/span[1]");
	private By streetaddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipcode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By skydiving = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[4]/span[1]");
	private By website = By.id("website");
	private By picture = By.id("picture");
	private By nextenterproductdata = By.id("nextenterproductdata");
	
	private By startdate = By.id("startdate");
	private By insurancesum = By.xpath("//select[@id='insurancesum']");
	private By meritrating = By.xpath("//select[@id='meritrating']");
	private By damageinsurance = By.xpath("//select[@id='damageinsurance']");
	private By optionalproduct = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]/span[1]");	
	private By courtesycar = By.xpath("//select[@id='courtesycar']");
	private By nextselectpriceoption = By.id("nextselectpriceoption");
	
	private By optiongold = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]");
	private By nextsendquote = By.cssSelector("#nextsendquote");
	
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password"); 
	private By confirmpassword = By.id("confirmpassword");  
	private By comments = By.id("Comments");
	private By sendemail = By.id("sendemail");
	private By validamsg = By.xpath("//body/div[4]/h2[1]");
	private By okmsg = By.xpath("//body/div[4]/div[7]/div[1]/button[1]");

	
	

	// ***********************************************************
	// MÉTODOS DE ACESSO
	// ***********************************************************

	public By getModel() {
		return model;
	}

	public By getMake() {
		return make;
	}

	public By getCylindercapacity() {
		return cylindercapacity;
	}


	public By getEngineperformance() {
		return engineperformance;
	}

	public By getDateofmanufacture() {
		return dateofmanufacture;
	}
	

	public By getNumberofseats() {
		return numberofseats;
	}

	public By getRighthanddriveyes() {
		return righthanddriveyes;
	}

	public By getNumberofseatsmotorcycle() {
		return numberofseatsmotorcycle;
	}

	public By getFuel() {
		return fuel;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalweight() {
		return totalweight;
	}

	public By getListprice() {
		return listprice;
	}

	public By getLicenseplatenumber() {
		return licenseplatenumber;
	}

	public By getAnnualmileage() {
		return annualmileage;
	}

	public By getNextenterinsurantdata() {
		return nextenterinsurantdata;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getLastname() {
		return lastname;
	}

	public By getBirthdate() {
		return birthdate;
	}

	public By getGendermale() {
		return gendermale;
	}

	public By getStreetaddress() {
		return streetaddress;
	}

	public By getCountry() {
		return country;
	}

	public By getZipcode() {
		return zipcode;
	}

	public By getCity() {
		return city;
	}

	public By getOccupation() {
		return occupation;
	}

	public By getSkydiving() {
		return skydiving;
	}

	public By getWebsite() {
		return website;
	}

	public By getPicture() {
		return picture;
	}
	
	public By getNextenterproductdata() {
		return nextenterproductdata;
	}

	public By getStartdate() {
		return startdate;
	}

	public By getInsurancesum() {
		return insurancesum;
	}

	public By getMeritrating() {
		return meritrating;
	}

	public By getDamageinsurance() {
		return damageinsurance;
	}

	public By getOptionalproduct() {
		return optionalproduct;
	}

	public By getCourtesycar() {
		return courtesycar;
	}

	public By getNextselectpriceoption() {
		return nextselectpriceoption;
	}

	public By getoptiongold() {
		return optiongold;
	}

	public By getNextsendquote() {
		return nextsendquote;
	}

	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmpassword() {
		return confirmpassword;
	}

	public By getComments() {
		return comments;
	}

	public By getSendemail() {
		return sendemail;
	}

	public By getValidamsg() {
		return validamsg;
	}

	public By getOkmsg() {
		return okmsg;
	}
	
	
	

}
