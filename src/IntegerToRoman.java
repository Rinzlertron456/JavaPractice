import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IntegerToRoman {
    public static void main(String[] args) {
        HashMap<String, Integer> RomanValues = new HashMap<>();
        RomanValues.put("I", 1);
        RomanValues.put("II", 2);
        RomanValues.put("III", 3);
        RomanValues.put("IV", 4);
        RomanValues.put("V", 5);
        RomanValues.put("VI", 6);
        RomanValues.put("VII", 7);
        RomanValues.put("VIII", 8);
        RomanValues.put("IX", 9);
        RomanValues.put("X", 10);
        RomanValues.put("L", 50);
        RomanValues.put("C", 100);
        RomanValues.put("D", 500);
        RomanValues.put("M", 1000);
        int Number = 675, count = 0, temp = Number, rev = 0;
        for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
            if (entry.getValue().equals(Number)) System.out.println(entry.getKey());
        }
        String res = "";
        while (temp > 0) {
            count++;
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        int base = 0, exponent = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (count > 0) {
            base = rev % 10;
            exponent = (int) (Math.pow(10, count - 1));
            list.add(base * exponent);
            rev /= 10;
            count--;
        }
        for (Integer integer : list) {
            for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                if (integer.equals(entry.getValue())) res += entry.getKey();
            }
            if(!(RomanValues.containsValue(integer)) && (integer != 0)) {
                if (integer < 100) {
                    for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                        if (entry.getValue().equals(integer)) res += entry.getKey();
                    }
                    if (integer < 50) {
                        int sub = 10;
                        String key = "";
                        for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                            if (entry.getValue().equals(sub)) {
                                res += entry.getKey();
                                key = entry.getKey();
                            }
                        }
                        if (integer == 40) res += "L";
                        else {
                            while (sub != integer) {
                                res += key;
                                sub += 10;
                            }
                        }
                    }
                    else if (integer > 50) {
                        int sub = 50;
                        String ten = "";
                        for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                            if (entry.getValue() == 10) ten = entry.getKey();
                        }
                        if (integer == 90) {
                            res += ten;
                            res += "C";
                        } else {
                            res += "L";
                            while (sub != integer) {
                                res += ten;
                                sub += 10;
                            }
                        }
                    }
                }
                else if (integer < 1000) {
                    if (integer < 500) {
                        int sub = 100;
                        String key = "";
                        for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                            if (entry.getValue().equals(sub)) {
                                res += entry.getKey();
                                key = entry.getKey();
                            }
                        }
                        if (integer == 400) res += "D";
                        else {
                            while (sub != integer) {
                                res += key;
                                sub += 100;
                            }
                        }
                    } else if (integer > 500) {
                        int sub = 500;
                        String hundred = "";
                        for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                            if (entry.getValue() == 100) hundred = entry.getKey();
                        }
                        if (integer == 900) {
                            res += hundred;
                            res += "M";
                        } else {
                            res += "D";
                            while (sub != integer) {
                                res += hundred;
                                sub += 100;
                            }
                        }
                    }
                }
                else if (integer < 10000) {
                    int sub = 1000;
                    String key = "";
                    for (Map.Entry<String, Integer> entry : RomanValues.entrySet()) {
                        if (entry.getValue().equals(sub)) {
                            res += entry.getKey();
                            key = entry.getKey();
                        }
                    }
                    while (sub != integer) {
                        res += key;
                        sub += 1000;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
