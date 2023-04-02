package JSON_to_XML;

public class Company {
	
	private String description;
    private double initial_price;
    private double price_2002;
    private double price_2007;
    private String symbol;
    
    // Constructors
    private String company;
    public Company(String company, String description, double initial_price, double price_2002, double price_2007,
			String symbol) {
		super();
		this.company = company;
		this.description = description;
		this.initial_price = initial_price;
		this.price_2002 = price_2002;
		this.price_2007 = price_2007;
		this.symbol = symbol;
	}
    
    // getters, and setters 
    public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getInitial_price() {
		return initial_price;
	}
	public void setInitial_price(double initial_price) {
		this.initial_price = initial_price;
	}
	public double getPrice_2002() {
		return price_2002;
	}
	public void setPrice_2002(double price_2002) {
		this.price_2002 = price_2002;
	}
	public double getPrice_2007() {
		return price_2007;
	}
	public void setPrice_2007(double price_2007) {
		this.price_2007 = price_2007;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
}

