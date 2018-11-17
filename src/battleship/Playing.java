package battleship;

import java.util.Scanner;

/**
 *
 * @author alfath
 */
public class Playing {

    private final int input;
    private boolean main = true; //untuk stop pengulangan bila pemain menyerah
    Scanner data = new Scanner(System.in);

    public Playing(int input) {
        this.input = input;
    }

    public void training() {
        start();
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
                main = validateInput(x, y);
            } while (((x < 0 || x > 9) || (y < 0 || y > 9)) && !(x == 999 && y == 999));//jika input sesuai kriteria maka tdiak ada pengulangan

            if (x == 999 && y == 999) {
                surrender("Anda");
                bt.menyerah(); //menyerah
            } else {
                bt.input(x, y); //menginputkan baris dan kolom yg pemain tebak
                bt.printBattleField(); //meanmpilkan hasil tebakan di map
            }
        }
        if (bt.menang()) {
            win(bt);
        }
    }

    public void twoPlayer() {
        //game dimulai
        System.out.println("");
        start();

        //inisialisasi player 1
        System.out.print("Player 1 name : ");
        String np1 = data.nextLine();
        Player p1 = new Player(np1);

        //inisialisasi player 2
        System.out.print("Player 2 name : ");
        String np2 = data.nextLine();
        Player p2 = new Player(np2);

        int choose = 1;
        while (main && (!p1.getBt().menang() && !p2.getBt().menang())) { //melakukan pengualngan selama pemain belum menyerah dan menang
            boolean cek = false;
            if (choose % 2 == 0) {
                choose = player2(p1, p2, cek, choose);
            } else {
                choose = player1(p1, p2, cek, choose);
            }

        }
        if (p1.isSurrender() || p2.isSurrender()) {
            if(p1.isSurrender()){
                win3(p1.getBt(),p2.getName());
            }else if(p2.isSurrender()){
                win3(p2.getBt(),p1.getName());
            }
        } else {
            if (p1.getBt().menang()) {
                win2(p1.getBt(), p2.getName());
            } else {
                win2(p2.getBt(), p1.getName());
            }
        }
    }

    public void vsComp() {
        start();
    }

    public int player1(Player p1, Player p2, boolean cek, int choose) {
        int x, y;
        System.out.println("");
        turn(p2.getBt(), p1.getName());
        do {
            System.out.println("input koordinat"); //pemain input baris dan kolom
            System.out.print("baris : ");
            x = data.nextInt();
            System.out.print("kolom : ");
            y = data.nextInt();
            main = validateInput(x, y);
        } while (((x < 0 || x > 9) || (y < 0 || y > 9)) && !(x == 999 && y == 999));//jika input sesuai kriteria maka tdiak ada pengulangan

        if (x == 999 && y == 999) {
            surrender(p1.getName());
            System.out.println(p1.getName() + " Board");
            p1.setSurrender(p1.getBt().menyerah());//menyerah
            System.out.println(p2.getName() + " Board");
            p2.getBt().menyerah();//menyerah
        } else {
            cek = p2.getBt().input(x, y); //menginputkan baris dan kolom yg pemain tebak
            p2.getBt().printBattleField(); //meanmpilkan hasil tebakan di map
        }

        if (cek == false) {
            choose++;
        }
        return choose;
    }

    public int player2(Player p1, Player p2, boolean cek, int choose) {
        int x, y;
        System.out.println("");
        turn(p1.getBt(), p2.getName());
        do {
            System.out.println("input koordinat"); //pemain input baris dan kolom
            System.out.print("baris : ");
            x = data.nextInt();
            System.out.print("kolom : ");
            y = data.nextInt();
            main = validateInput(x, y);
        } while (((x < 0 || x > 9) || (y < 0 || y > 9)) && !(x == 999 && y == 999));//jika input sesuai kriteria maka tdiak ada pengulangan

        if (x == 999 && y == 999) {
            surrender(p2.getName());
            System.out.println(p2.getName() + " Board");
            p2.setSurrender(p2.getBt().menyerah());//menyerah
            System.out.println(p1.getName() + " Board");
            p1.getBt().menyerah();//menyerah
        } else {
            cek = p1.getBt().input(x, y); //menginputkan baris dan kolom yg pemain tebak
            p1.getBt().printBattleField(); //meanmpilkan hasil tebakan di map
        }
        if (cek == false) {
            choose++;
        }
        return choose;
    }

    public boolean validateInput(int x, int y) {
        if (x == 999 && y == 999) { //pemain menyerah
            return false;
        } else {
            if ((x < 0 || x > 9) || (y < 0 || y > 9)) { //jika pemain input selain dari 0-9
                System.out.println("Koordinat tidak ada pada gaming board, harap masukkan koordinat yang\n"
                        + "valid (input must between 0-9)");
                System.out.println("");
            }
            return true;
        }

    }

    private void win(BattleField bt) {
        System.out.println("========================================================");
        System.out.println("            Selamat Anda Memenangkan Permainan");
        System.out.println("========================================================");
        bt.printBattleField();
    }

    private void start() {
        System.out.println("");
        System.out.println("========================================================");
        System.out.println("                    Game Dimulai");
        System.out.println("========================================================");
    }

    private void win2(BattleField bt, String Name) {
        System.out.println("========================================================");
        System.out.println("            Selamat " + Name + " Memenangkan Permainan");
        System.out.println("========================================================");
        bt.printBattleField();
    }
    private void win3(BattleField bt, String Name) {
        System.out.println("========================================================");
        System.out.println("            Selamat " + Name + " Memenangkan Permainan");
        System.out.println("========================================================");
        bt.menyerah();
    }

    private void turn(BattleField bt, String Name) {
        System.out.println("========================================================");
        System.out.println("                     " + Name + " Turn");
        System.out.println("========================================================");
        bt.printBattleField();
    }

    private void surrender(String Name) {
        System.out.println("========================================================");
        System.out.println("           " + Name + " Menyerah! permainan berakhir");
        System.out.println("========================================================");
    }
}
