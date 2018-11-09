/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Scanner;

/**
 *
 * @author alfath
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("                  Welcome to BattleShip");
        System.out.println("========================================================");

        BattleField bt = new BattleField();
        bt.generateField();
        bt.printBattleField();
        System.out.println("");
        int x, y;
        boolean main = true;
        while (main) {
            do {
                System.out.println("input koordinat");
                System.out.print("x : ");
                x = data.nextInt();
                System.out.print("y : ");
                y = data.nextInt();
                if (x == 999 && y == 999) {
                    System.out.println("Anda Menyerah!");
                    main = false;
                }else{
                    if ((x < 0 || x > 9) || (y < 0 || y > 9)) {
                        System.out.println("Koordinat tidak ada pada gaming board, harap masukkan koordinat yang\n"
                                + "valid (input must between 0-9)");
                        System.out.println("");
                    }
                }

            } while (((x < 0 || x > 9) || (y < 0 || y > 9)) && !(x == 999 && y == 999));
            bt.input(x, y);
            bt.printBattleField();
        }
    }

}
