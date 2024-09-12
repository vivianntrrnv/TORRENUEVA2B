
package torrenueva.it2b;

import java.util.Scanner;
public class InventoryM {
    
    public void getInventory(){
        Scanner scanner = new Scanner(System.in);
              
        System.out.println("Enter number of products: ");
        int prodNum = scanner.nextInt();
        scanner.nextLine();
        
      Inventory[] Inventory = new Inventory[prodNum];
            
      for (int i = 0; i < prodNum; i++){
            System.out.println("Enter details of Product " + (i + 1) + ":");
    
            System.out.println("ID: ");
            int prodId = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Name: ");
            String prodName = scanner.nextLine();
            
            System.out.println("Category : ");
            String prodCategory = scanner.nextLine();
            
            System.out.println("Stock Quantity: ");
            double prodQuantity = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("price per unit: ");
           double prodPrice = scanner.nextDouble();
            scanner.nextLine(); 
            
            
            
            
            
            
            
      } 
} 
}

    
    
    
