import java.text.NumberFormat;

public class Product {

	private String code;
	private String description;
	private double price;

	public Product() {
		code = "";
		description = "";
		price = 0.0;
	}

	// ----get and set code
	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	// ----Get and set description
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	// ----Get and set price
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	// Get Formatted Price
	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
}