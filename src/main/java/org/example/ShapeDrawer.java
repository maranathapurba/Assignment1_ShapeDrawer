package org.example;
import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in); //untuk masukin user input
    public void displayMenu(){
        System.out.println ("Selamat datang di ASCII Shape Drawer!");
        System.out.println ("Choose a shape to draw:");
        System.out.println ("1. Triangle");
        System.out.println ("2. Square");
        System.out.println ("3. Rectangle");
        System.out.println ("4. Exit\n");
    }

    public void run(){
        //Loop utk terus menampilkan menu
        while(true){
            displayMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt(); //Input yg jenisnya integer
            DrawShape(choice);
            System.out.println();
        }
    }

    public void DrawShape(int choice){
        switch (choice){
            case 1:
                System.out.println("Enter the height of triangle: ");
                int heightTriangle = scanner.nextInt();
                drawTriangle(heightTriangle); //Fungsi untuk menggambar segitiganya
                break;
            case 2:
                System.out.println("Enter the height of square: ");
                int heightSquare = scanner.nextInt();
                drawSquare(heightSquare); //Fungsi untuk menggambar square
                break;
            case 3:
                System.out.println("Enter the height of rectangle: ");
                int heightRectangle = scanner.nextInt();
                System.out.println("Enter the width of rectangle: ");
                int widthRectangle = scanner.nextInt();
                drawRectangle(heightRectangle, widthRectangle); //Fungsi untuk menggambar persegi panjang
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public void drawTriangle(int heightTriangle){
        //Nested loop
        //Outer loop
        for (int i = 1; i <= heightTriangle; i++) {
            // Print spaces to center the triangle
            for (int j = heightTriangle - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public void drawSquare(int heightSquare){
        for (int i = 1; i<= heightSquare; i++){
            for (int j = 1; j<= heightSquare; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawRectangle (int heightRectangle, int widthRectangle){
        for (int i = 1; i<= heightRectangle; i++){
            for (int j = 1; j<=widthRectangle; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        //bikin program utk gambar ASCII shape
        // Runner
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}
