public class Task8 {
    static int sum;
    static int cumulativeSum;
    static int sumAndCumulative(int... numbers){
        sum = 0;
        for(int number : numbers){
            sum += number;
            cumulativeSum = 0;
            for(int i = 1; i <= number; i++){
                cumulativeSum += i;
            }
            System.out.println(cumulativeSum);
        }
        System.out.println(sum);
        return sum;
    }
    public static void main (String[] args){
        sumAndCumulative(4,5,10);
    }
}
