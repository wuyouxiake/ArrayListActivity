import java.util.*;

public class Invoice {
	private ArrayList<LineItem> lineItemList = new ArrayList<>();
	private double total;

	static double java_total_price = 0, html_total_price = 0,
			css_total_price = 0, sql_total_price = 0;
	static int java_quantity = 0, html_quantity = 0, css_quantity = 0,
			sql_quantity = 0;
	static double java_avg = 0, html_avg = 0, css_avg = 0, sql_avg = 0;

	// Add line item to line item list
	public void addLineItem(LineItem lineItem) {
		lineItemList.add(lineItem);
	}

	// Total
	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotal() {
		return total;
	}

	public void Print() {
		int i = 0, l = 0;
		double j = 0;
		String ppp, ttt;
		//
		//
		for (i = 0; i < lineItemList.size(); i++) {

			ppp = LineItem.getFormattedPrice(lineItemList.get(i).getPrice());
			ttt = LineItem.getFormattedPrice(lineItemList.get(i).getSubtotal());

			System.out.print(lineItemList.get(i).getCode() + "\t");
			System.out.print(lineItemList.get(i).getDescription() + "\t");
			System.out.print(ppp + "\t");
			System.out.print(lineItemList.get(i).getQuantity() + "\t");
			System.out.print(ttt + "\t");
			System.out.println();
			j += lineItemList.get(i).getSubtotal();

			if (lineItemList.get(i).getCode().equalsIgnoreCase("java")) {
				java_quantity += lineItemList.get(i).getQuantity();
				java_total_price += lineItemList.get(i).getQuantity()
						* lineItemList.get(i).getPrice();
			} else if (lineItemList.get(i).getCode().equalsIgnoreCase("html")) {
				html_quantity += lineItemList.get(i).getQuantity();
				html_total_price += lineItemList.get(i).getQuantity()
						* lineItemList.get(i).getPrice();
			} else if (lineItemList.get(i).getCode().equalsIgnoreCase("css")) {
				css_quantity += lineItemList.get(i).getQuantity();
				css_total_price += lineItemList.get(i).getQuantity()
						* lineItemList.get(i).getPrice();
			} else if (lineItemList.get(i).getCode().equalsIgnoreCase("sql")) {
				sql_quantity += lineItemList.get(i).getQuantity();
				sql_total_price += lineItemList.get(i).getQuantity()
						* lineItemList.get(i).getPrice();
			}
		}
		System.out
				.println("--------------------------------------------------------------------------------");
		System.out.println(" " + "Invoice Total: " + j);
		l = lineItemList.size();
		for (i = 0; i < l; i++) {
			lineItemList.remove(0);
		}
	}

	public void PrintReport() {
		System.out.println("Code" + " " + "Qty" + " " + "Total" + " " + "Avg");
		System.out.println("----" + " " + "---" + " " + "-----" + " " + "---");
		if (java_quantity != 0) {
			java_avg = java_total_price / java_quantity;
			System.out.println("JAVA " + java_quantity + " " + java_total_price
					+ " " + java_avg);
		}
		if (html_quantity != 0) {
			html_avg = html_total_price / html_quantity;
			System.out.println("HTML " + html_quantity + " " + html_total_price
					+ " " + html_avg);
		}
		if (css_quantity != 0) {
			css_avg = css_total_price / css_quantity;
			System.out.println("CSS " + css_quantity + " " + css_total_price
					+ " " + css_avg);
		}
		if (sql_quantity != 0) {
			sql_avg = sql_total_price / sql_quantity;
			System.out.println("SQL " + sql_quantity + " " + sql_total_price
					+ " " + sql_avg);
		}

	}

}