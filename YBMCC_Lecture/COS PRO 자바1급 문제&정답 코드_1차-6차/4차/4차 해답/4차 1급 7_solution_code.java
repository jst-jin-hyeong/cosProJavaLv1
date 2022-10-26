
/*=======================================
   4차 1급 7_solution_code.java

   ybmit.com 사이트의 샘플 파일에는 정답이 제시되어 있지 않습니다.
   아래와 같은 정답을 제안 드립니다.
   (더 좋은 알고리즘으로 구현 바랍니다.)
 ========================================*/

   class Unit {
        public int HP;
        public Unit() {
            this.HP = 1000;
        }
        public void underAttack(int damage) { }
    }

    class Monster extends Unit {
        public int attackPoint;
        public Monster(int attackPoint) {
            this.attackPoint = attackPoint;
        }
       public void underAttack(int damage) {
            this.HP -= damage;
        }
        int attack() {
            return this.attackPoint;
        }
    }

    class Warrior extends Unit{
        public int attackPoint;
        public Warrior(int attackPoint) {
            this.attackPoint = attackPoint;
        }
        public  void underAttack(int damage) {
            this.HP -= damage;
        }
        int attack() {
            return this.attackPoint;
        }
    }

    class Healer extends Unit{
        public int healingPoint;
        public Healer(int healingPoint) { 
            this.healingPoint = healingPoint;
        }
        public  void underAttack(int damage) {
            this.HP -= damage;
        }
        void healing(Unit unit) {
            unit.HP += healingPoint;
        }
    }
    
    