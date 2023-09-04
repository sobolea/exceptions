/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        Boolean flg = false;
        while( !flg){
            try {
                float num = Float.parseFloat(sc.nextLine());
                System.out.println("Your number: " + num);
                flg = true;
            } catch (Exception e) {
                System.out.println("Incorrect input");
                System.out.println("Input number: ");
            }
        }
    }
}