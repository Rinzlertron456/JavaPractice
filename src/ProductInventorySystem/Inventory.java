package ProductInventorySystem;

import java.util.Map;
import java.util.TreeMap;

public class Inventory {
    private TreeMap<String,Integer> products=new TreeMap<>();
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Smartphone", 20);
        inventory.addProduct("Laptop", 15);
        inventory.updateQuantity("Laptop", 25);
        inventory.updateQuantity("Tablet", 30);
        inventory.removeProduct("Smartphone");
        inventory.removeProduct("Camera");
        System.out.println("Quantity for Laptop: " + inventory.getQuantity("Laptop"));
        System.out.println("Quantity for Smartphone: " +
                inventory.getQuantity("Smartphone"));
        System.out.println("All product quantities: " + inventory.getAllProducts());
    }

    private TreeMap<String,Integer> getAllProducts() {
        return products;
    }

    private Integer getQuantity(String product) {
        for (Map.Entry<String,Integer> entry: products.entrySet()){
            if(entry.getKey().equals(product)) return entry.getValue();
        }
        return null;
    }

    private void removeProduct(String product) {
        boolean found=false;
        for (Map.Entry<String,Integer> entry: products.entrySet()){
            if(entry.getKey().equals(product)) {
                found=true;
                products.remove(product);
                System.out.println("Removed product: "+product);
            }
        }
        if(!found) System.out.println("Product not found: "+product);
    }

    private void updateQuantity(String product, int quantity) {
        boolean found=false;
        for (Map.Entry<String,Integer> entry: products.entrySet()){
            if(entry.getKey().equals(product)){
                found=true;
                entry.setValue(quantity);
                System.out.println("Updated quantity for product: "+product+" to: "+quantity);
            }
        }
        if(!found) System.out.println("Product not found: "+product);
    }

    private void addProduct(String product, int quantity) {
        if(!products.containsKey(product)) products.put(product,quantity);
        else System.out.println("Product already exists: "+product);
    }
}
