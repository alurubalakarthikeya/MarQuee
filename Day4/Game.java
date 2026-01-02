// input: 2
// 100 (current XP)
// 100 (enemy1 XP)
// 120 (enemy2 XP)
// 50  (enemy1 defeat bonus)
// 50  (enemy2 defeat bonus)

import java.util.Scanner;
class Main {
    public static int deadEnemyCounter(int noe, int charCurrent, int[] enemyXP, int[] bonusXP){
        int nod = 0;
        for(int i=0; i < noe; i++){
            if(charCurrent >= enemyXP[i]){
                charCurrent += bonusXP[i];
                nod++;
            }
        }
        return nod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int charXP = sc.nextInt();
        int[] enemyXP = new int[n];
        int[] bonusXP = new int[n];
        for (int i = 0; i < n; i++) {
            enemyXP[i] = sc.nextInt();
            bonusXP[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(enemyXP[j] > enemyXP[j + 1]){
                    int enemyTemp = enemyXP[j];
                    enemyXP[j] = enemyXP[j + 1];
                    enemyXP[j + 1] = enemyTemp;
                    int bonusTemp = bonusXP[j];
                    bonusXP[j] = bonusXP[j + 1];
                    bonusXP[j + 1] = bonusTemp;
                }
            }
        }
        System.out.printf("Enemies Dead: %d", deadEnemyCounter(n, charXP, enemyXP, bonusXP));
    }
}
