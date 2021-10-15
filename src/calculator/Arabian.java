package calculator;

import exceptions.IncorrectInput;
import exceptions.RomanCannotBeLessThenOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arabian {

    public String verification(String input, String flag, int count, String[] arabianNum, String[] value,
                               String firstVal) throws RomanCannotBeLessThenOne, IncorrectInput {

        value[0] = firstVal;

        for (int i = 0; i < arabianNum.length; i++) {
            if (input.endsWith(arabianNum[i])){
                value[2] = arabianNum[i];

                Pattern pattern = Pattern.compile("[\\+\\-*/]");
                Matcher matcher = pattern.matcher(input);

                while (matcher.find()){
                    count++;
                    value[1] = input.substring(matcher.start(), matcher.end());
                    if (count>1){
                        break;
                    }
                }
                if (input.equals(value[0]+ value[1]+ value[2])){
                   Calculation calculation = new Calculation();
                   return calculation.calculate(value[0], value[1], value[2],flag);
                }else  throw new IncorrectInput("Некорректный ввод");

            }if (i<arabianNum.length - 1) continue;
        }

        return null;
    }
}
