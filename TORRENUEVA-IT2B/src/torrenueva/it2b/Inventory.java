
package torrenueva.it2b;


public class Inventory {
    
 
    int prodId;
    String prodName;
    String prodCategory;
    String prodQuantity;
    double prodPrice;
    int prodNum;
    
    public void addInventory (int prodId, int prodNum, String prodName, String prodCategory, double prodPrice, String prodQuantity){
        
            this.prodName= prodName;
            this.prodId= prodId;
            this.prodCategory= prodCategory;
            this.prodQuantity= prodQuantity;
            this.prodPrice= prodPrice;
    }
        public void viewInventory (){
        
            System.out.println("Enter Number of Products:"+prodNum );
            System.out.println("Enter details of product no.1:");
            System.out.println("ID: " +prodId);
            System.out.println("Name: "+prodName);
            System.out.println("Category: "+prodCategory);
            System.out.println("Stock Quantity: "+prodQuantity);
            System.out.println("Price per Unit: "+prodPrice);
            
        
        
    }
}
