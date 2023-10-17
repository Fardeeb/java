public class Question4 {

    private static Integer evenSum(Integer start, Integer end) {
        Integer sum = 0;
        if ((start&1) == 1) start++;
        while (start <= end) {
            sum += start;
            start += 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer evenSum = evenSum(1, 100);
        System.out.println("Sum of even numbers between 1 & 100 is: " + evenSum);
    }
}
