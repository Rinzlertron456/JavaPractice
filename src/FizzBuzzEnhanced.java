public class FizzBuzzEnhanced {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i%3==0&&i%5==0?"fizzbuzz":i%3==0?"fizz":i%5==0?"buzz":i);
        }
    }
}
