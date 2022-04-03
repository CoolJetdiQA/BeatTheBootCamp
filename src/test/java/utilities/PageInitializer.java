package utilities;

import pages.Ferrari_Kitchens_CommonPage;
import pages.Ferrari_Kitchens_HomePage;
import pages.Fitness_CommonPage;
import pages.Fitness_HomePage;
import pages.Fitness_Login_Page;
import pages.Fitness_ShoppingCart_Page;
import pages.Fitness_SignUp_Page;

public class PageInitializer extends BaseClass{
	public static Ferrari_Kitchens_CommonPage fkCommonPage;
	public static Ferrari_Kitchens_HomePage fkHomePage;
	public static Fitness_CommonPage ftCommonPage;
	public static Fitness_HomePage ftHomePage;
	public static Fitness_Login_Page ftLoginPage;
	public static Fitness_ShoppingCart_Page ftShoppingCartPage;
	public static Fitness_SignUp_Page ftSignUpPage;
	
	public static void initialize() {
		fkCommonPage = new Ferrari_Kitchens_CommonPage();
		fkHomePage = new Ferrari_Kitchens_HomePage();
		ftCommonPage = new Fitness_CommonPage();
		ftHomePage = new Fitness_HomePage();
		ftLoginPage = new Fitness_Login_Page();
		ftShoppingCartPage = new Fitness_ShoppingCart_Page();
		ftSignUpPage = new Fitness_SignUp_Page();
		
		
	}
}
