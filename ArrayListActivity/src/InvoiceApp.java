import java.util.Scanner;

public class InvoiceApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Invoice myInvoice = new Invoice();
		//
		String aaa = "y", bbb = "y", ccc;
		double temp = 0;

		while (bbb.equalsIgnoreCase("y")) {

			System.out.println("Welcome to the invoice application.");
			aaa = "y";
			// ---------------------------------------------------------------------------------------------------
			while (aaa.equalsIgnoreCase("y")) {
				String code = Validator.getString(in, "Enter product code: ");
				int quantity = Validator.getInt(in, "Enter quantity: ", 0, 50);
				LineItem myItem = new LineItem();
				myItem.setCode(code);
				myItem.setQuantity(quantity);
				// Ask for discount
				System.out.println("Do you want to change the price?");
				ccc = in.next();
				if (ccc.equalsIgnoreCase("y")) {
					System.out.println("Please enter the discount price:");
					temp = in.nextDouble();
					myItem.setPrice2(temp);
				} else if (ccc.equalsIgnoreCase("n")) {
					myItem.setPrice(code);
				}
				// --------------------
				myItem.setDescription(code);
				myItem.setSubtotal();
				myInvoice.addLineItem(myItem);
				System.out.println("Continue?(y/n)");
				aaa = in.next();
			}
			// -------------------------------------------------------------------------------------------------
			System.out.println();
			System.out.println("Code" + " " + "Description" + " " + "Price"
					+ " " + "Qty" + " " + "Total");
			System.out.println("----" + " " + "-----------" + " " + "-----"
					+ " " + "---" + " " + "-----");
			myInvoice.Print();
			System.out.println();

			System.out.println("Do you have another transaction?");
			bbb = in.next();
		}
		// Output report
		myInvoice.PrintReport();

	}
}