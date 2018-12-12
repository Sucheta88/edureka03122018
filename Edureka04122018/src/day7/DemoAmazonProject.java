package day7;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject ap = new AmazonProject();
		ap.inVokeBrowser();
		ap.searchProduct("apple watch", "Watches");
		String nthProduct = ap.getNthProduct(7);
		System.out.println(nthProduct);
		//ap.printAllProducts();
		//ap.printAllProductsViaMouseScrollDown();
		ap.printAllProductsViaJavaScript();

	}

}
