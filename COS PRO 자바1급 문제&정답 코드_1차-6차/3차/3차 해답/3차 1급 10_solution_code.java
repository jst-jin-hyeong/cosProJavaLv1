
/*=======================================
   3차 1급 10_solution_code.java
 ========================================*/

import java.util.ArrayList;
import java.util.Iterator;

//Shop �씤�꽣�럹�씠�뒪�� HairShop, Restaurant �겢�옒�뒪�뒗 Inner Class濡� �옉�꽦�릺�뼱�엳�뒿�땲�떎. �븘�옒 肄붾뱶瑜� �옒 �씫怨� 鍮덉뭏�쓣 梨꾩썙二쇱꽭�슂.
class Solution {
    class Shop{
        protected ArrayList<Customer> reserve_list;
        public Shop() {
			this.reserve_list = new ArrayList<Customer>();
		}
        public boolean reserve(Customer customer){
            reserve_list.add(customer);
            return true;
        }
    }
    class Customer{
        public int id;
        public int time;
        public int num_of_people;
        public Customer(int id, int time, int num_of_people){
            this.id = id;
            this.time = time;
            this.num_of_people = num_of_people;
        }
    }
    class HairShop extends Shop {
        public HairShop(){
            super();
        }
        
        public boolean reserve(Customer customer){
            if(customer.num_of_people != 1)
                return false;
            
            Iterator<Customer> iter = reserve_list.iterator();
            while (iter.hasNext()) {
                Customer r = iter.next();
                if(r.time == customer.time)
                    return false;
            }
            reserve_list.add(customer);
            return true;
        }
    }
    class Restaurant extends Shop {
        public Restaurant(){
            super();
        }
        
        public boolean reserve(Customer customer){
            if(customer.num_of_people < 2 || customer.num_of_people > 8)
                return false;
            int count = 0;
                        
            Iterator<Customer> iter = reserve_list.iterator();
            while (iter.hasNext()) {
                Customer r = iter.next();
                if(r.time == customer.time)
                    count += 1;
            }
            if(count >= 2)
                return false;
            reserve_list.add(customer);
            return true;
        }
    }

    public int solution(int[][] customers, String[] shops) {
        Shop hairshop = new HairShop();
        Shop restaurant = new Restaurant();
        int count = 0;
        for(int i = 0; i < shops.length; i++){
            if(shops[i].equals("hairshop")){
                if(hairshop.reserve(new Customer(customers[i][0], customers[i][1], customers[i][2])))
                    count += 1;
            }
            else if(shops[i].equals("restaurant")){
                if(restaurant.reserve(new Customer(customers[i][0], customers[i][1], customers[i][2])))
                    count += 1;
            }
        }
        return count;
    }
}