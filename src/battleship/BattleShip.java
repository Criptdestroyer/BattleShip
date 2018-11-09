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
public class BattleShip extends BattleField {

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
    public void LR(){
        int x = rand.nextInt(9)+0;
        int y = rand.nextInt(6)+0;
        LR[0] = new Point(x, y);
        for (int i = 1; i <=3; i++) {
            y++;
            LR[i] = new Point(x, y);
        }
    }
    public void printLR() {
        System.out.println("LR");
        for (int i = 0; i < LR.length; i++) {
            Point temp = LR[i];
            System.out.println(temp.getX() + "," + temp.getY());
        }
    }
    public void T(){
        int x = rand.nextInt(9)+1;
        int y = rand.nextInt(7)+0;
        T[0] = new Point(x, y);
        for (int i = 1; i <=3; i++) {
            y++;
            T[i] = new Point(x, y);
            if(i == 1){
                i++;
                x--;
                T[i] = new Point(x, y);
                x++;
            }
            
        }
    }
    public void printT() {
        System.out.println("T");
        for (int i = 0; i < T.length; i++) {
            Point temp = T[i];
            System.out.println(temp.getX() + "," + temp.getY());
        }
    }
    public void I(){
        int x = rand.nextInt(9)+1;
        int y = rand.nextInt(9)+0;
        I[0] = new Point(x, y);
        x--;
        I[1] = new Point(x, y);
    }
    public void printI() {
        System.out.println("I");
        for (int i = 0; i < I.length; i++) {
            Point temp = I[i];
            System.out.println(temp.getX() + "," + temp.getY());
        }
    }
    

}
