package Store;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private List<Product> itemsList = new ArrayList<>();

    public void addProduct(Product product){
        itemsList.add(product);
        System.out.println("✅ Product added Successfully!");
    }
    public void viewProducts(){

        if(itemsList.isEmpty()){
            System.out.println("⚠️ Inventory is empty.");
        }
        else{
            System.out.println("📦 Product List:");
            for(Product p:itemsList){
                System.out.println(p);
            }
        }
    }

    public void removeProduct(int id){
        boolean found = false;
        for(Product p: itemsList){
            if(p.getId()==id){
                itemsList.remove(p);
                System.out.println("❌ Product removed successfully!");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("⚠️ Product not found.");
        }
    }
    public void updateQuantity(int id,int newQuantity){

        for(Product p:itemsList){
            if(p.getId()==id){
                p.setQuantity(newQuantity);
                System.out.println("🔁 Quantity updated");
                return;
            }
        }
        System.out.println("⚠️ Product not found.");
    }

}
