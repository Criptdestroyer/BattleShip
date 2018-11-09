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
    private final int x;
    private final int y;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    boolean EQ(Point P1, Point P2) {
        return (P1.x == P2.x) && (P1.y == P2.y);
    }

    boolean NEQ(Point P1, Point P2) {
        return (P1.x != P2.x) && (P1.y != P2.y);
    }

    boolean Less(Point P1, Point P2) {
        return (P1.x < P2.x) && (P1.y < P2.y);
    }

    boolean More(Point P1, Point P2) {
        return (P1.x > P2.x) && (P1.y > P2.y);
    }
}
