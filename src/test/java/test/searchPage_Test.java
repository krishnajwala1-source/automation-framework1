package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;
import pages.SearchResultsPage;
import pages.homePage;
import pages.titleVerification;
import utils.DriverFactory;

@Test
public class searchPage_Test extends BaseTest{
		
		public void titleVerify() {
		titleVerification sp= new titleVerification(DriverFactory.getDriver());
		//instead of driver we are using driverfactory.get driver as we are doing parrallel means it will use threadlocal
		sp.verifyTitle();
	
	    }
	
		public void searchProduct() {
	    homePage hp= new homePage(DriverFactory.getDriver());
	    hp.searchProduct("iphone");
	    	
	    SearchResultsPage results = new SearchResultsPage(DriverFactory.getDriver());
	    //Assert.assertTrue(results.getResultsCount() > 0);
	    int count = results.getResultsCount();
	    System.out.println("Results count: " + count);

	    Assert.assertTrue(count > 0, "No results found!");
	    }
	        
	    }
	
	
	    
	
	
		
	


