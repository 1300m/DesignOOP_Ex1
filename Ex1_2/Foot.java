package Ex1_2;

import java.util.Scanner;

    /**
     * @author 64050355 Jirapat Pichai
     */
    
public class Foot {
    private static FootShape footShape = new FootShape();

    public static void draw(int type) {
        switch (type) {
            case 1:
                footShape.drawAsEllipse();
                break;
            case 2:
                footShape.drawAsRectangle();
                break;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();

        draw(type);

        inp.close();
    }
}
