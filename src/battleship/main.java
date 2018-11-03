/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author alfath
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("        Welcome to BattleShip");
        System.out.println("====================================");
        
        BattleField bt = new BattleField();
        bt.printBattleField();
    }
    
}
