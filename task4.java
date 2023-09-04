/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, 
что пустые строки вводить нельзя.*/

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Boolean flg = true;
        while(flg){
            System.out.println("Input something: ");
            String smth = sc.nextLine();
            if (smth != ""){
                System.out.println("Your input is " + smth);
                flg = false;
            } else {
                System.out.println("You must input something!");
            }
        }
    }
}
