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
public class Point {
    private final int x; //titik x
    private final int y; //titik y
    public Point() { //constructor tanpa parameter
        x = 0;
        y = 0;
    }
    public Point(int x,int y){ //constructur dengan 2 parameter
        this.x = x;
        this.y = y;
    }
    public int getX() { //mengambil nilai x
        return x;
    }
    public int getY() { //mengambil nilai y
        return y;
    }
    //buat perbandingan  antara 2 point
    boolean EQ(Point P1, Point P2) { //jika sama true
        return (P1.x == P2.x) && (P1.y == P2.y); 
    }

    boolean NEQ(Point P1, Point P2) { //jika tidak sama true
        return (P1.x != P2.x) && (P1.y != P2.y);
    }

    boolean Less(Point P1, Point P2) { //jika lebih kecil true
        return (P1.x < P2.x) && (P1.y < P2.y);
    }

    boolean More(Point P1, Point P2) { //jika lebih besar true
        return (P1.x > P2.x) && (P1.y > P2.y);
    }
}
