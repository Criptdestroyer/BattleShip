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
        
        
        BattleShip bs = new BattleShip();
        bs.Generate();
        bs.printL();
        bs.printLR();
        bs.printT();
        bs.printI();
        
    }
    
}
