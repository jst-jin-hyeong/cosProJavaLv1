/*=======================================
    3�� 10��   3�� 1�� 10_initial_code.java
 ========================================*/
import java.util.ArrayList;
import java.util.Iterator;

//Shop �������̽��� HairShop, Restaurant Ŭ������ Inner Class�� �ۼ��Ǿ��ֽ��ϴ�. �Ʒ� �ڵ带 �� �а� ��ĭ�� ä���ּ���.
class Solution {
    class Shop{
        protected ArrayList<Customer> reserveList;
        public Shop() {
			this.reserveList = new ArrayList<Customer>();
		}
        public boolean reserve(Customer customer){
            reserveList.add(customer);
            return true;
        }
    }
    class Customer{
        public int id;
        public int time;
        public int numOfPeople;
        public Customer(int id, int time, int numOfPeople){
            this.id = id;
            this.time = time;
            this.numOfPeople = numOfPeople;
        }
    }
    class HairShop @@@ {
        public HairShop(){
            super();
        }
        
        @@@{
            if(@@@ != 1)
                return false;
            
            Iterator<Customer> iter = reserveList.iterator();
            while (iter.hasNext()) {
                Customer r = iter.next();
                if(@@@)
                    return false;
            }
            reserveList.add(customer);
            return true;
        }
    }
    class Restaurant @@@ {
        public Restaurant(){
            super();
        }     
        @@@{
            if(@@@)
                return false;
            int count = 0;
                        
            Iterator<Customer> iter = reserveList.iterator();
            while (iter.hasNext()) {
                Customer r = iter.next();
                if(@@@)
                    count += 1;
            }
            if(count >= 2)
                return false;
            reserveList.add(customer);
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

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] customers = {{1000, 2, 1},{2000, 2, 4},{1234, 5, 1},{4321, 2, 1}, {1111, 3, 10}};
        String[] shops = {"hairshop", "restaurant", "hairshop", "hairshop", "restaurant"};
        int ret = sol.solution(customers, shops);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}