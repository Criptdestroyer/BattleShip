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
        System.out.println("====================================");
        System.out.println("        Welcome to BattleShip");
        System.out.println("====================================");
        
        BattleField bt = new BattleField();
        bt.generateField();
        bt.printBattleShip();
        System.out.println("");
        int x, y;
        
        do {
            System.out.print("input x : ");
            x = data.nextInt();
            System.out.print("input y : ");
            y = data.nextInt();
            if((x < 0 && x > 9) && (y < 0 && y > 9)){
                System.out.println("input must between 0-9");
            }
        } while ((x < 0 && x > 9) && (y < 0 && y > 9));

    }

}
