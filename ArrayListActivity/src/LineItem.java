import java.text.NumberFormat;

public class LineItem {

	private int quantity;
	private String code;
	private double price;
	private String description;
	private double subtotal;

	// Code
	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	// Quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	// Price
	public double getPrice() {
		return price;
	}

	public void setPrice(String code) {
		price = ProductDB.getProduct(code).getPrice();
	}

	public void setPrice2(double price) {
		this.price = price;
	}

	// Description
	public String getDescription() {
		return description;
	}

	public void setDescription(String code) {
		description = ProductDB.getProduct(code).getDescription();
	}

	// Subtotal
	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal() {
		this.subtotal = this.quantity * this.price;
	}

	// get formatted subtotal
	public String getFormattedTotal() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.subtotal);
	}

	// Place
	// changed-------------------------------------------------------------------
	public String getFormattedNumber() {
		NumberFormat quantity = NumberFormat.getNumberInstance();
		return quantity.format(this.getQuantity());
	}

	// Place
	// changed-------------------------------------------------------------------
	public static String getFormattedPrice(double price) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
}