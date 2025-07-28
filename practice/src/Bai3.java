

import java.util.Scanner;

public class Bai3 {
    static int a,b,c;

    public static void ranDom(){
        a = (int)(Math.random()*101);
        b = (int)(Math.random()*101);
        c = (int)(Math.random()*201);
        System.out.println("phép toán: "+a+" + "+b+" = "+c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ranDom();
        System.out.print("Dự đoán kết quả phép toán(đúng/sai): ");
        String d = sc.nextLine().trim();
        boolean kq = (a+b==c);
        if(kq) {
            if(d.equalsIgnoreCase("đúng"))
                System.out.println("Bạn đoán đúng!");
            else{
                System.out.println("Bạn đoán sai!");
            }
        }
        else{
            if(d.equalsIgnoreCase("đúng"))
                System.out.println("Bạn đoán sai!");
            else{
                System.out.println("Bạn đoán đúng!");
            }
        }
    }
}