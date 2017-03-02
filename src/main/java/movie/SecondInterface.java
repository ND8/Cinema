package movie;


public interface SecondInterface extends MainInterface {

	public enum Product {
        STUDENT(1, "student", 8.0d),
        STANDARD(2, "Standard", 10.0d),
        OOP(3, "oop", 8.0d),
        CHILD(4, "child", 4.0),
        SENIOR(5, "senior", 6.0);

        public double price;
        public int productNumber;
        public String productTitle;
	
        	Product(int ticketNumber, String ticketTitle, double price) {
        		this.price = price;
        		this.productNumber = ticketNumber;
        		this.productTitle = ticketTitle;
        	}
	
        	public static Product getByNumber(int num) {
        	
        		for (Product product : values()) {
        			if (product.productNumber == num) {
        				return product;
        			}
        		}
        return null;
        	}

        		@Override
        		public String toString() {
        			return productNumber + " - " + productTitle + " - " + String.format("£%.2f", price);
        		}
        
        
	
	}
	
}
