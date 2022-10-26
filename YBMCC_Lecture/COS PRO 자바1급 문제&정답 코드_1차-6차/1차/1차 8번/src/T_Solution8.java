/*=======================================
    1차 8번   1차 1급 8_initial_code.java
 ========================================*/

import java.util.ArrayList;
import java.util.Iterator;

//DeliveryStore interface, Food and PizzaStore class are written as Inner Class. Read the code below and fill in the blank.
class T_Solution8 {
    interface DeliveryStore{
        public void setOrderList(String[] orderList);
        public int getTotalPrice();
    }
    
    class Food{
        public String name;
        public int price;
        public Food(String name, int price){
            this.name = name;
            this.price = price;
        }
    }
    
    class PizzaStore implements DeliveryStore{
        private ArrayList<Food> menuList;
        private ArrayList<String> orderList;
        
        public PizzaStore(){
            //init menuList
            menuList = new ArrayList<Food>();
            String[] menuNames = {"Cheese", "Potato", "Shrimp", "Pineapple", "Meatball"};
            int[] menuPrices = {11100, 12600, 13300, 21000, 19500};
            for(int i = 0; i < 5; i++)
                menuList.add(new Food(menuNames[i], menuPrices[i]));
            
            //init orderList
            orderList = new ArrayList<String>();
        }
        
        public void setOrderList(String[] orderList){
            for(int i = 0; i < orderList.length; i++)
                this.orderList.add(orderList[i]);
        }
        
        public int getTotalPrice(){
            int totalPrice = 0;
            
            for (int k = 0; k < orderList.size(); k++) {
               	for(int i = 0; i < menuList.size(); i++)  {
                    if(orderList.get(k) == menuList.get(i).name) {
                    	System.out.println(menuList.get(i).name + " " + menuList.get(i).price );
                        totalPrice += menuList.get(i).price;
                        break;
                      }
               	}
            }
            return totalPrice;
        }
    }
    
    public int solution(String[] orderList) {
        PizzaStore deliveryStore = new PizzaStore();
        
        deliveryStore.setOrderList(orderList);
        int totalPrice = deliveryStore.getTotalPrice();
        
        return totalPrice;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        T_Solution8 sol = new T_Solution8();
        String[] orderList = {"Cheese", "Pineapple", "Meatball"};
        int ret = sol.solution(orderList);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}