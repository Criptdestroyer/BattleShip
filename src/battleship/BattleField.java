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
public class BattleField{
    char map[][] = new char[10][10];
    boolean ship[][] = new boolean[10][10];
    BattleShip shp = new BattleShip();
    
    public BattleField(){
        for (int i = map.length-1; i >= 0; i--) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = '0';
                ship[i][j] = false;
            }
        }
    }
    public void printBattleField(){
        for (int i = map.length-1; i >= 0; i--) {
            System.out.print("\t");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void printBattleShip(){
        for (int i = ship.length-1; i >= 0; i--) {
            System.out.print("\t");
            for (int j = 0; j < ship[i].length; j++) {
                if(ship[i][j]==false){
                    System.out.print("0 ");
                }else{
                    System.out.print("+ ");
                }
                
            }
            System.out.println("");
        }
    }
    public void generateField(){
        shp.Generate();        ;
        LinkedList ship = shp.getCek();
        for (int i = 0; i < ship.size(); i++) {
            Point t = (Point) ship.get(i);
            this.ship[t.getX()][t.getY()] = true;
        }
    }
    
    
    
}
