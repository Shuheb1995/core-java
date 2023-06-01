package comxworkz.biscuits.dto;

public class BiscuitsDto {
	
	private String name;
	private String flavour;
	private String shape;
	private int price;
	private int pieces;
	
	public BiscuitsDto(String name, String flavour, String shape, int price, int pieces) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.shape = shape;
		this.price = price;
		this.pieces = pieces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	@Override
	public String toString() {
		return "BiscuitsDto [name=" + name + ", flavour=" + flavour + ", shape=" + shape + ", price=" + price
				+ ", pieces=" + pieces + "]";
	}
	
	
	
	
	 

}
