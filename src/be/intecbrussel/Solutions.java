package be.intecbrussel;



public class Solutions {
    public static int biggestNumber(int firstNumber, int secondNumber, int thirdNumber, int forthNumber) {

        int answer;

        if (firstNumber >= secondNumber & firstNumber >= thirdNumber & firstNumber >= forthNumber) {
            answer = firstNumber;
        } else if (secondNumber >= firstNumber & secondNumber >= thirdNumber & secondNumber >= forthNumber) {
            answer = secondNumber;
        } else if (thirdNumber >= firstNumber & thirdNumber >= secondNumber & thirdNumber >= forthNumber) {
            answer = thirdNumber;
        } else{
            answer = forthNumber;
        }
        return answer;
    }

    public static int smallestNumber(int firstNumber, int secondNumber, int thirdNumber, int forthNumber) {

        int answer;

        if (firstNumber <= secondNumber & firstNumber <= thirdNumber & firstNumber <= forthNumber){
            answer = firstNumber;
        } else if (secondNumber <= firstNumber & secondNumber <= thirdNumber & secondNumber <= forthNumber) {
            answer = secondNumber;
        } else if (thirdNumber <= firstNumber & thirdNumber <= secondNumber & thirdNumber <= forthNumber) {
            answer = thirdNumber;
        } else{
            answer = forthNumber;
        }
        return answer;


    }

    public static void smallestNumberToMean(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int smallestResult) {
        int mean = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
        for (int result = smallestResult; result < mean; result++) {

            System.out.println(result);
        }
    }

    public static void zeroToTwo(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        for (int e = 1; e < 2000; e++) {
            if (e == firstNumber || e == secondNumber || e == thirdNumber || e == fourthNumber) {
                break;
            }
        }

    }

    public static void zeroToHundred() {


        for (int startingNumber = 0 ; startingNumber < 100; startingNumber++) {
            System.out.println(startingNumber);
            System.out.println(-(startingNumber-100));
        }


    }

}
