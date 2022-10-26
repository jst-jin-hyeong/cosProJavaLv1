/*=======================================
    2�� 1��   2�� 1�� 1_initial_code.java
 ========================================*/

//Book �������̽��� ComicBook, Novel Ŭ������ Inner Class�� �ۼ��Ǿ��ֽ��ϴ�. �Ʒ� �ڵ带 �� �а� ��ĭ�� ä���ּ���.
class Solution {
  interface Book{
      public int getRentalPrice(int day);
  }
  
  class ComicBook @@@ {
      @@@{
          int cost = 500;
          day -= 2;
          if(day > 0)
              cost += @@@;
          return cost;
      }
  }
  
  class Novel @@@ {
      @@@{
          int cost = 1000;
          day -= 3;
          if(day > 0)
              cost += @@@;
          return cost;
      }
  }

  public int solution(String[] bookTypes, int day) {
      Book[] books = new Book[50];
      int length = bookTypes.length;
      for(int i = 0; i < length; ++i){
          if(bookTypes[i].equals("comic"))
              books[i] = new ComicBook();
          else if(bookTypes[i].equals("novel"))
              books[i] = new Novel();   
      }
      int totalPrice = 0;
      for(int i = 0; i < length; ++i)
          totalPrice += books[i].getRentalPrice(day);
      return totalPrice;
  }


  // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
  public static void main(String[] args) {
      Solution sol = new Solution();
      String[] bookTypes = {"comic", "comic", "novel"};
      int day = 4;
      int ret = sol.solution(bookTypes, day);

      // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
      System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
  }
}