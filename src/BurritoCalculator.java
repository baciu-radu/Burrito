public class BurritoCalculator {

    public static boolean hasLeftoverFunds(int burritoCost) {
        int budget = 100;
        int numBurritos = 0;

        while (budget >= burritoCost) {
            numBurritos++;
            budget -= burritoCost;
        }

        System.out.println("Remaining budget: " + budget);
        if(budget>0){return true;} else return false;

    }

//    Each customer’s order number coincidentally corresponded with the number of burritos they ordered. For example, the first customer of the day had order number 0 and ordered 0 burritos, since they only ordered water. The second customer of the day had order number 1 and ordered 1 burrito, and the last customer of the day had order number 548 and ordered 548 burritos.
//
//Update the .getBurritosSold() method to calculate the total number of burritos sold, and store it in the totalBurritosSold variable.
    public static int getBurritosSold(int lastOrderNumber) {
        int totalBurritosSold = 0;
        for(int i=0; i<= lastOrderNumber; i++){
            totalBurritosSold += i;
        }

        return totalBurritosSold;
    }


//    Every customer whose order number is divisible by 9 ordered the same number of burritos as you. How many order numbers, from order number 1 to your order number, lastOrderNumber, are divisible by 9?
    public static int getNumDivisibleOrders(int lastOrderNumber) {
        int numDivisbleOrders = 0;
        for(int i=1; i<=lastOrderNumber; i++){
            if(i%9==0){numDivisbleOrders++;}
        }
        // if(lastOrderNumber%9==0){
        //   return numDivisbleOrders+1;
        // }else
        return numDivisbleOrders;
    }

//    We want to calculate how much tip to give the cashier, which is the largest digit in your budget multiplied by 900.
    public static int getTip(int budget) {
        int maxDigit = 0;
        int temp = budget;
        while(temp>1){
            if(temp%10>maxDigit){
                maxDigit= temp%10;

            }temp = temp/10;
        }


        return maxDigit * 900;
    }


    public static int getReverseBudget(int budget) {
        int reverseBudget = 0;
        int normal=budget;
        int digit;
        while(normal>0){
            digit = normal%10;
            reverseBudget = reverseBudget*10+digit;
            normal /=10;
        }

        return reverseBudget;
    }






    public static void main(String []args) {

        System.out.println(hasLeftoverFunds(7));
        System.out.println(hasLeftoverFunds(10));

        System.out.println(getBurritosSold(548));

        System.out.println(getNumDivisibleOrders(18));

        // Try passing different arguments for your budget with varying numbers of digits, like 62, 374, 599, etc
        System.out.println(getReverseBudget(374));
    }
}
