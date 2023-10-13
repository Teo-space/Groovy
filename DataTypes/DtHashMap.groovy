///HashMap
///LinkedHashMap
///TreeMap


public class Product {

    private String name;
    private String description;
    private List<String> tags;
    
    Product(String name, String description){
        this.name = name;
        this.description = description;
    }

    public getName() {
        return name;
    }
    public getDescription() {
        return description;
    }
    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }
}


Product eBike = new Product("E-Bike", "A bike with a battery");
Product roadBike = new Product("Road bike", "A bike for competition");

Map<String, Product> productsByName = new HashMap<>();
productsByName.put(eBike.getName(), eBike);
productsByName.put(roadBike.getName(), roadBike);

println productsByName

Product nextPurchase = productsByName.get("E-Bike");
println nextPurchase

Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
productsByName.put(null, defaultProduct);
productsByName.put(defaultProduct.getName(), defaultProduct);
Product nextPurchase1 = productsByName.get(null);
println nextPurchase1

//Удалить значение
productsByName.remove("E-Bike");
assert productsByName.get("E-Bike") == null;
//COntains
//by Key
assert productsByName.containsKey("E-Bike") == false
//by value
assert productsByName.containsValue(eBike) == false


for(String key : productsByName.keySet()) {
    Product product = productsByName.get(key);
    println "${key} : ${product}"
}


for(Map.Entry<String, Product> entry : productsByName.entrySet()) {
    String key = entry.getKey();
    Product product =  entry.getValue();
    println "${key} : ${product}"
}

productsByName.forEach( (key, product) -> {
    println("Key: ${key}  Product: ${product.getDescription()}");
});








