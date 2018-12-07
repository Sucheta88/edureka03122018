package day4;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		String title = wc.getTitle();
		System.out.println("Title of page is : "+ title);
		wc.navigateMethods();
		wc.closeBrowser();
        wc.closeAllBrowser();
	}

}
