package utilities;

import pages.GoogleHomePage;

public class PageInitializer extends BaseClass{
	private static GoogleHomePage googleHomePage;
	
	public static void initialize() {
		googleHomePage = new GoogleHomePage();
	}
}
