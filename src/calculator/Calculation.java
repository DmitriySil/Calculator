package calculator;

import exceptions.RomanCannotBeLessThenOne;

public class Calculation {
    int result;
    int first;
    int second;
    String[] roman = new String[]{"IX","X","VIII","VII","VI","IV","V","III","II","I"};
    String[] roman2 = new String[]{"C","XCIX","XCVIII","XCVII","XCVI","XCV","XCVIV","XCIII","XCII","XCI","XC",
            "LXXXIX","LXXXVIII","LXXXVII","LXXXVI","LXXXV","LXXXIV","LXXXIII","LXXXII","LXXXI","LXXX","LXXIX",
            "LXXVIII","LXXVII","LXXVI","LXXV","LXXIV","LXXIII","LXXII","LXXI","LXX","LXIX","LXVIII","LXVII","LXVI",
            "LXV","LXIV","LXIII","LXII","LXI","LX","LIX","LVIII","LVII","LVI","LV","LIV","LII","LII","LI","L",
            "XLIX","XLVIII","XLVII","XLVI","XLV","XLIV","XLII","XLII","XLI","XL","XXXIX","XXXVIII","XXXVII","XXXVI",
            "XXXV","XXXIV","XXXIII","XXXII","XXXI","XXX","XXIX","XXVIII","XXVII","XXVI","XXV","XXIV","XXIII","XXII",
            "XXI","XX","XIX","XVIII","XVII","XVI","XV","XIV","XIII","XII","XI","X","IX","VIII","VII","VI","V","IV","III","II","I"};
    String[] arab = new String[]{"9","10","8","7","6","4","5","3","2","1"};
    String[] arab1 = new String[]{"100","99","98","97","96","95","94","93","92","91","90","89","88","87","86","85",
            "84","83","82","81","80","79","78","77","76","75","74","73","72","71","70","69","68","67","66","65","64",
            "63","62","61","60","59","58","57","56","55","54","53","52","51","50","49","48","47","46","45","44","43",
            "42","41","40","39","38","37","36","35","34","33","32","31","30","29","28","27","26","25","24","23","22",
            "21","20","19","18","17","16","15","14","13","12","11","10","9","8","7","6","5","4","3","2","1"};

    public String calculate(String a, String c, String b, String d) throws RomanCannotBeLessThenOne {
        if (d.equals("roman")){
                for (int i = 0; i < roman.length; i++) {
                 if (a.equals(roman[i])){
                    a = arab[i];
                }
            }
                for (int i = 0; i < roman.length; i++) {
                 if (b.equals(roman[i])){
                     b = arab[i];
              }
           }
        }
        first = Integer.parseInt(a);
        second = Integer.parseInt(b);
        switch (c){
            case "+" : result = first + second;break;
            case "-" : result = first - second;break;
            case "/" : result = first / second;break;
            case "*" : result = first * second;break;
        }
        if (d.equals("roman")){
            for (int i = 0; i < arab1.length; i++) {
                if (arab1[i].equals(String.valueOf(result))){
                    return roman2[i];
                }else if (i < arab1.length-1) continue;
                else throw new RomanCannotBeLessThenOne("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
            } return null;
        }
        else
        return String.valueOf(result);
    }
}
