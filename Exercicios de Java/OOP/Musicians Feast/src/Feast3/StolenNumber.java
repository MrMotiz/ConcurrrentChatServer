package Feast3;

public class StolenNumber {
    public static void main(String[] args) {
        findStolenNumber(new int[]{1,2,3,5,6,7,8,9,10}); // should print 4
        findStolenNumber(new int[]{1,2,3,4,5,6,7,8,10}); // should print 9
        findStolenNumber(new int[]{1,2,3,4,5,6,7,8,9,10}); // should print "no number was stolen"
    }

    public static void findStolenNumber(int[]numbers){
        int num = 0;
        for (int i = 0; i < numbers.length ; i++) {
            num++;
            if(num != numbers[i]){
                System.out.println(numbers[i]-1);
                return;
            }
        }
        System.out.println("no number was stolen");
    }
}
