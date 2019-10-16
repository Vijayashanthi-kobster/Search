package Elite_Search.Elite_Search;

import java.awt.AWTException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class searchTest {
	
    @BeforeTest(description = "Launching browser")
	public static void launch()
    {
		searchmethod.launching();
	}

	@Test(priority=0)
	public void login() throws InterruptedException
	{
		System.out.println("Perform Login");
		searchmethod.login("vijayashanthi38@gmail.com","kobster123");
	}

	
	@Test(priority=1)
	public void Search_001() throws InterruptedException, AWTException
	{

		System.out.println("Case-1: Verify the search result-if user provide partially incorrect keyword");
		//elite.regionselection();
		searchmethod.search_key("Natraj pencil");
		searchmethod.pagescroll();//for loading all the products
		searchmethod.search_result();
		searchmethod.totalcount_product();	
	}
	
	@Test(priority=2)
	public void Search_002() throws InterruptedException, AWTException
	{

		System.out.println("Case-2: Verify the search result - if user provide invalid data");
		//elite.regionselection();
		searchmethod.search_key("abcdefg");
		searchmethod.pagescroll();//for loading all the products
		searchmethod.search_result();
		searchmethod.totalcount_product();	
	}
	
	@Test(priority=3)
	public void Search_003() throws InterruptedException, AWTException
	{

		System.out.println("Case-3: Verify the search result -if user doesnot provide data n search field");
		//elite.regionselection();
		searchmethod.search_key("");
		searchmethod.pagescroll();//for loading all the products
		searchmethod.search_result();
		searchmethod.totalcount_product();	

	}

	@Test(priority=4)
	public void Search_004() throws InterruptedException, AWTException
	{

		System.out.println("Case-4: Verify the search results-if user provide valid data");
		//elite.regionselection();
		searchmethod.search_key("Pencil");
		searchmethod.pagescroll();//for loading all the products
		searchmethod.search_result();
		searchmethod.printallproducts(); 
		searchmethod.totalcount_product();	
        searchmethod.refresh();
	}

	
	@Test(priority=5)
	public void Search_005() throws InterruptedException, AWTException
	{
		
		  System.out.println("Case-5: Before region selection ,Verify the Catagory filter and count of product ");
		  searchmethod.pagescroll();//for loading all the products
		  searchmethod.catagory_selection(); 
		  searchmethod.pagescroll();//for loading all the products
		  searchmethod.catagoryresult();
		  searchmethod.totalcount_product();
		  searchmethod.refresh();
		  	
	}
	
	
	@Test(priority=6)
	  public void Search_006() throws InterruptedException,	  AWTException 

	  { 
		  System.out.println("Case-6: Before region selection ,Verify the Brand filter and count of product");
		  searchmethod.pagescroll();//for loading all the products
		  searchmethod.Brand_selection(); 
		  searchmethod.pagescroll();//for loading all   the products 
		  searchmethod.brandresult(); 
		  searchmethod.totalcount_product();
		  searchmethod.refresh();
	 
	  
	  }
	  
	@Test(priority=7)
	  public void Search_007() throws InterruptedException, AWTException 

	  { 
		  System.out.println("Case-7: Before region selection , Verify the Price filter and count of product func");
		  searchmethod.price_filter();
		  searchmethod.price_filter_result(); 
		  searchmethod.totalcount_product();
		  searchmethod.refresh();
 }
	@Test(priority=8)
	  public void Search_008() throws InterruptedException, AWTException 

	  { 
		  System.out.println("Case-8: Before region selection ,Verify the High to Low sort filter and count of product");
		  searchmethod.High2low_sort();
		  searchmethod.pagescroll();
		  searchmethod.High2low_result();
		  searchmethod.totalcount_product();
		  searchmethod.refresh();
	  }
	
	
	
	@Test(priority=9)
	  public void Search_009() throws InterruptedException,AWTException 

	  { 
		  System.out.println("Case-9: Before region selection ,Verify the Low to High sort filter and count of product");
		  searchmethod.sort_low2high(); 
		  searchmethod.pagescroll();
		  searchmethod.low2high_result();
		  searchmethod.totalcount_product();//
		  searchmethod.refresh();
	  
	  }
	  
	@Test(priority=10)
	  public void Search_010() throws InterruptedException,AWTException
	   {
	  
	  System.out.println("Case-10: Verify the search result when user apply price filter ,Brand and Sort filter");
		  //Price ,Sort & Brand filters 
	  
		  searchmethod.price_filter();
		  searchmethod.Brand_selection();
		  searchmethod.High2low_sort();
		  searchmethod.pagescroll();
		  
		  searchmethod.High2low_result();
		  searchmethod.price_filter_result(); 

		  searchmethod.totalcount_product();
          searchmethod.refresh();
	  
	  
	  }
	  
	@Test(priority=11)
	  public void Search_011() throws InterruptedException,AWTException
	   
	  { 
		  System.out.println("Case-11: Verify the search result when user apply Price filter and then Brand filter");
				  

	  
		  searchmethod.price_filter(); 
		  searchmethod.Brand_selection();
		  searchmethod.pagescroll();
		  
		  searchmethod.price_filter_result();
		  searchmethod.brandresult(); 

		  
		  Thread.sleep(2000); 
		  searchmethod.totalcount_product(); 
          searchmethod.refresh();
		  
	  
	  }
	  
	@Test(priority=12)
	  public void Search_012() throws InterruptedException,AWTException
	  
	  { 
		  System.out.println("Case-12: Verify the search result when user apply price filter and Sort filter");
		  
		  
		  searchmethod.price_filter(); 
		  searchmethod.High2low_sort();
		  searchmethod.pagescroll();
		  
		  searchmethod.High2low_result();		  
		  searchmethod.price_filter_result();
		  searchmethod.totalcount_product();
          searchmethod.refresh();
	  
	  
	  }
	  
	@Test(priority=13)
	  public void Search_013() throws InterruptedException,
	  AWTException 
	  { 
		  
		  System.out.println("Case-13: Verify the search result when user Brand filter and then Price filter");
	  
		  searchmethod.pagescroll();
		  searchmethod.Brand_selection(); 
		  searchmethod.price_filter();
		  searchmethod.pagescroll();
		  
		  searchmethod.price_filter_result();
		  searchmethod.brandresult();

		  
		  Thread.sleep(2000); 
		  searchmethod.totalcount_product(); 
          searchmethod.refresh();
		  	  
	  }
	  
	@Test(priority=14)
	  public void Search_014() throws InterruptedException,AWTException
	  
	  
	  { 
		  
		  System.out.println("Case-14: Verify the search result when user apply Brand filter and then Sort filter");
	  
		  searchmethod.pagescroll();
		  searchmethod.Brand_selection(); 
		  searchmethod.High2low_sort();
		  searchmethod.pagescroll();

		  searchmethod.High2low_result();		  
		  searchmethod.brandresult(); 
		  searchmethod.totalcount_product();
          searchmethod.refresh();
		  
	  }
	  
	@Test(priority=15)
	  public void Search_015() throws InterruptedException,AWTException
	  
	  { 
		  
		  System.out.println("Case-15: Verify the search result when user apply Sort filter and then Brand filter");
	  
	  
		  searchmethod.sort_low2high(); 
		  searchmethod.Brand_selection(); 
		  searchmethod.pagescroll();

		  searchmethod.low2high_result();
		  searchmethod.brandresult();
		  searchmethod.totalcount_product(); 
		  searchmethod.refresh(); 

	  }		  
	  
	@Test(priority=16)
	  public void Search_016() throws InterruptedException,AWTException
	   
	  { 
		  searchmethod.refresh(); 
		  
		  System.out.println("Case-16: Verify the search result when user apply Sort filter and then Price filter");
	  
	  
		  searchmethod.High2low_sort();
		  searchmethod.price_filter(); 
		  searchmethod.pagescroll();

		  searchmethod.price_filter_result();
		  searchmethod.High2low_result();
		  
		  searchmethod.totalcount_product(); 
		  
	  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
}
