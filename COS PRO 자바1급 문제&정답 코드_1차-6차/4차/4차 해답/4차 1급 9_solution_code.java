
/*=======================================
   4차 1급 9_solution_code.java
   ybmit.com 사이트에는 정답이 없습니다.
   아래 답안을 제안합니다.
 ========================================*/


  public String solution(int hour, int minute) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
       float h_hand = (float)360 / (60*12) * (hour*60 + minute);
       float m_hand = (float)360 / 60 * minute;
       
       float arc;
       
       if (h_hand > m_hand)
    	   arc = h_hand - m_hand;
       else
    	   arc = m_hand - h_hand;
       
       if (arc > 180)
    	   arc = 360 -arc;
       
       answer = Float.toString(arc);
       return answer;
    }
  
  