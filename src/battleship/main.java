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

        BattleField bt = new BattleField(); //memanggil class battlefield
        bt.generateField(); //memamanggil map yang sudah diisi oleh ship
        bt.printBattleField();//menampilkan isi map
        System.out.println("");
        int x, y;
        boolean main = true; //untuk stop pengulangan bila pemain menyerah
        while (main && !bt.menang()) { //melakukan pengualngan selama pemain belum menyerah dan menang
            do {
                System.out.println("input koordinat"); //pemain input baris dan kolom
                System.out.print("baris : ");
                x = data.nextInt();
                System.out.print("kolom : ");
                y = data.nextInt();
                if (x == 999 && y == 999) { //pemain menyerah
                    System.out.println("========================================================");
                    System.out.println("            Anda Menyerah! permainan berakhir");
                    System.out.println("========================================================");
                    main = false;
                } else {
                    if ((x < 0 || x > 9) || (y < 0 || y > 9)) { //jika pemain input selain dari 0-9
                        System.out.println("Koordinat tidak ada pada gaming board, harap masukkan koordinat yang\n"
                                + "valid (input must between 0-9)");
                        System.out.println("");
                    }
                }

            } while (((x < 0 || x > 9) || (y < 0 || y > 9)) && !(x == 999 && y == 999));//jika input sesuai kriteria maka tdiak ada pengulangan

            if (x == 999 && y == 999) {
                bt.menyerah(); //menyerah
            } else {
                bt.input(x, y); //menginputkan baris dan kolom yg pemain tebak
                bt.printBattleField(); //meanmpilkan hasil tebakan di map
            }
        }
        if (bt.menang()) {
            System.out.println("========================================================");
            System.out.println("            Selamat Anda Memenangkan Permainan");
            System.out.println("========================================================");
            bt.printBattleField();
        }
    }

}
