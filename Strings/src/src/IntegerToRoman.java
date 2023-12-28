import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.InflaterInputStream;

public class IntegerToRoman {
    public static void main(String[] args) {

    }

    public static String intToRoman(int num) {
        Map<Integer, String> numeralMap = new LinkedHashMap<>();
        numeralMap.put(1000, "M");
        numeralMap.put(900, "CM");
        numeralMap.put(500, "D");
        numeralMap.put(400, "CD");
        numeralMap.put(100, "C");
        numeralMap.put(90, "XC");
        numeralMap.put(50, "L");
        numeralMap.put(40, "XL");
        numeralMap.put(10, "X");
        numeralMap.put(9, "IX");
        numeralMap.put(5, "V");
        numeralMap.put(4, "IV");
        numeralMap.put(1, "I");
        StringBuilder result= new StringBuilder();
        for (Map.Entry<Integer, String> entry : numeralMap.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (num >= value) {
                result.append(symbol);
                num -= value;
            }
        }

        return result.toString();

    }
}
