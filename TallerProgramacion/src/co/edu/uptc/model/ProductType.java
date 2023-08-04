package co.edu.uptc.model;
public enum ProductType {
    LICORES("LICORES", 10),
    VIVERES("VIVERES", 5),
    MEDICINAS("MEDICINAS", 20),
    ASEO("ASEO", 8),
    RANCHO("RANCHO", 12);

    private String name;
    private double price;

    ProductType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

	
	}

