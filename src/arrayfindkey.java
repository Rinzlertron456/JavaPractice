public class arrayfindkey {
    public static void main(String[] args) {
        int[] input1 = {47, 65, 51, 12, 29, 32, 34};
        int input2 = 7;
        int max = 0, sum = 0, neg = 0;
        for (int i = 0; i < input2; i++) {
            max = Math.max(max, input1[i]);
        }
        for (int i = 0; i < input2; i++) {
            if (input1[i] < 0) neg++;
        }
        if (neg == 0) sum=max;
        else {
            int num = input1[0], t1 = num;
            StringBuilder ad = new StringBuilder();
            while (t1 >= 10) {
                ad.append(t1 % 10);
                t1 /= 10;
            }
            int add = Integer.valueOf(ad.reverse().toString()), temp=input1[add];
            String key = Integer.toString(t1);
            ad.setLength(0);
            System.out.println(key+"\n"+add);
            while (add > 0) {
                int n = Math.abs(temp);
                System.out.println(temp);
                while (n >= 10) {
                    ad.append(n % 10);
                    n /= 10;
                }
                key += Math.abs(n);
                if (temp < 0) break;
                add = Integer.valueOf(ad.reverse().toString());
                ad.setLength(0);
                temp = input1[add];
            }
            System.out.println(key);
            char[] keys = key.toCharArray();
            for (int i = 0; i < keys.length; i++) {
                int numkey = keys[i] - '0';
                if (i % 2 == 0) sum += numkey;
                else sum -= numkey;
            }
        }
        System.out.println(sum);
    }
}
