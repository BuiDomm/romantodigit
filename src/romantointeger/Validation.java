/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package romantointeger;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    public String getString(String msg) {

        while (true) {
            String newString = "";
            System.out.println(msg);
            String input = sc.nextLine();
            System.out.println(newString);

            for (char ch : input.toCharArray()) {
                if (ch == 'I' || ch == 'V' || ch == 'L' || ch == 'X' || ch == 'C' || ch == 'D' || ch == 'M') {
                    System.out.println(newString);
                    newString = newString + ch;
                }
            }
            if (newString.length()==0) {
                continue;
            } else {
                return newString.toString();
            }
        }
    }

}
