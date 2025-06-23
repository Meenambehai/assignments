package week2.day4;

public class Chrome extends Browser{
	
	public void openIncognito() {
		// TODO Auto-generated method stub
		System.out.println("Icongnito mode enabled");

	}
	public void clearCache() {
		// TODO Auto-generated method stub
		System.out.println("Cache cleared");

	}
	
	public static void main(String[] args) {
		
	 Chrome ch = new  Chrome();
	 ch.browserName="Chrome";
	 ch.browserVersion="137.0.3296.83";
	System.out.println(ch.browserName +"open successfully");
	System.out.println("Browser verion = "+ch.browserVersion );
	 ch.opneURL();
	 ch.navigateBack();
	 ch.openIncognito();
	 ch.clearCache();
	 ch.closeBrowser();
	}

}
