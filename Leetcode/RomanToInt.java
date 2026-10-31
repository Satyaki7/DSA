import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> val = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        // [1,5,10,50,100,500,1000]
        int sum = 0,v;
        int max = val.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 1; i > -1; i--) {
            v = val.get(s.charAt(i));
            if (max <= v) {
                sum += v;
                max = v;
            } else {
                sum -= v;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInt hel = new RomanToInt();
        hel.romanToInt("MCMXCIV");
    }
}
