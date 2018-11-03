/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Random;

/**
 *
 * @author alfath
 */
public class BattleShip extends BattleField{

    private Point L[];
    private Point LR[];
    private Point T[];
    private Point I[];
    Random rand = new Random();

    public BattleShip() {
        L = new Point[6];
        LR = new Point[4];
        T = new Point[4];
        I = new Point[2];
    }

    public void Generate() {
        
    }

    public void L() {
        int x = rand.nextInt(9) + 3;
        int y = rand.nextInt(7) + 0;
        L[0] = new Point(x, y);
        for (int i = 1; i <= 3; i++) {
            x--;
            L[i] = new Point(x, y);
        }
        for (int i = 4; i <= 5; i++) {
            y++;
            L[i] = new Point(x, y);
        }
    }

    public void printL() {
        System.out.println("L");
        for (int i = 0; i < L.length; i++) {
            Point temp = L[i];
            System.out.println(temp.getX() + "," + temp.getY());
        }
    }

    

    public void printLR() {
        System.out.println("LR");
        for (int i = 0; i < LR.length; i++) {
            Point temp = LR[i];
            System.out.println(temp.getX() + "," + temp.getY());
        }
    }

}
