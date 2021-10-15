package calculator;

import exceptions.IncorrectInput;
import exceptions.RomanCannotBeLessThenOne;

import java.util.Scanner;

public class Calculator {
    String input = "";
    String[] value = new String[3];

    String[] romanNum = new String[]{"IX","X","VIII","VII","VI","IV","V","III","II","I"};
    String[] arabianNum = new String[]{"9","10","8","7","6","4","5","3","2","1"};

    public void calculate() throws RomanCannotBeLessThenOne, IncorrectInput {
       while (true){
       String flag = "";
       int count = 0;
       Scanner scan = new Scanner(System.in);
       input = scan.nextLine().replace(" ","").toUpperCase();

         for (int i = 0; i < romanNum.length; i++) {
           if (input.startsWith(romanNum[i])) {
            Roman roman = new Roman();
            System.out.println(roman.verification(input,flag,count,romanNum,value,romanNum[i]));break;
    } else if (i< romanNum.length - 1) continue;else

         for (int j = 0; j < arabianNum.length; j++) {
            if (input.startsWith(arabianNum[j])){
             Arabian arabian = new Arabian();
             System.out.println(arabian.verification(input,flag,count,arabianNum,value,arabianNum[j]));break;
    }else if (j < arabianNum.length - 1) continue;
            else throw new IncorrectInput("Некорректный ввод");

               }
           }
       }
    }
}
