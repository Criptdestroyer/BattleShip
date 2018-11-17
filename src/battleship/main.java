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
        boolean game = true;
        while (game) {
            System.out.println("========================================================");
            System.out.println("                  Welcome to BattleShip");
            System.out.println("========================================================");
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. Play with Computer");
            System.out.println("2. Play with 2 Player");
            System.out.println("3. Training");
            System.out.println("0 to exit ");
            System.out.print("Input : ");
            int input = data.nextInt();
            Playing ply = new Playing(input);
            switch (input) {
                case 1:
                    ply.vsComp();
                    break;
                case 2:
                    ply.twoPlayer();
                    break;
                case 3:
                    ply.training();
                    break;
                case 0:
                    game = false;
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }

        }
    }
}
