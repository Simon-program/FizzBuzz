public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < 1000; i++) {
            boolean mulOf3 = (i % 3) == 0;
            boolean mulOf5 = (i % 5) == 0;

            if (mulOf3 || mulOf5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
