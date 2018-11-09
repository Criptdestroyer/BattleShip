/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.LinkedList;

/**
 *
 * @author alfath
 */
public class BattleField {

    char map[][] = new char[10][10];
    boolean ship[][] = new boolean[10][10];
    BattleShip shp = new BattleShip();
    int benar = 0;
    int menangs = 16;
    
    public BattleField() {
        for (int i = map.length - 1; i >= 0; i--) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = '0';
                ship[i][j] = false;
            }
        }
    }
    public boolean menang(){
        return benar == menangs;
    }

    public void input(int x, int y) {
        if (ship[x][y] == true) {
            map[x][y] = 'X';
            benar++;
            if(menangs==benar){
                
            }
        } else {
            map[x][y] = '_';
        }
    }

    public void menyerah() {
        for (int i = 0; i < ship.length; i++) {
            for (int j = 0; j < ship[i].length; j++) {
                if (ship[i][j] == true) {
                    map[i][j] = 'X';
                }
            }
        }
        printBattleField();
    }

    public void printBattleField() {
        System.out.println("\t    0   1   2   3   4   5   6   7   8   9");
        System.out.println("\t    _____________________________________");
        for (int i = map.length - 1; i >= 0; i--) {
            System.out.print("\t");
            System.out.print(i + "  |");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "   ");
            }
            System.out.println("");
            System.out.println("\t   |");
        }
    }

    public void printBattleShip() {
        for (int i = ship.length - 1; i >= 0; i--) {
            System.out.print("\t");
            for (int j = 0; j < ship[i].length; j++) {
                if (ship[i][j] == false) {
                    System.out.print("0 ");
                } else {
                    System.out.print("+ ");
                }

            }
            System.out.println("");
        }
    }

    public void generateField() {
        shp.Generate();;
        LinkedList ship = shp.getCek();
        for (int i = 0; i < ship.size(); i++) {
            Point t = (Point) ship.get(i);
            this.ship[t.getX()][t.getY()] = true;
        }
    }

}
