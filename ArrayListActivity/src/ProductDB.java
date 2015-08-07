public class ProductDB {
	public static Product getProduct(String productCode) {
		Product p = new Product();
		p.setCode(productCode);
		if (productCode.equalsIgnoreCase("JAVA")) {
			p.setDescription("Java is a programming language!!!");
			p.setPrice(15.00);
		} else if (productCode.equalsIgnoreCase("HTML")) {
			p.setDescription("HTML is a language for website!!!");
			p.setPrice(30.00);
		} else if (productCode.equalsIgnoreCase("CSS")) {
			p.setDescription("JavaScript is scripting language!");
			p.setPrice(50.00);
		} else if (productCode.equalsIgnoreCase("SQL")) {
			p.setDescription("SQL is a database query language!");
			p.setPrice(60.00);
		} else {
			p.setDescription("Unknown");
		}
		return p;
	}
}