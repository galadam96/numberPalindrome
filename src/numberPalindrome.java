public class numberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
    }

    public static boolean isPalindrome(int number){
        boolean result = false;

        //creating the reverse of input number
        int reverse = 0;
        if(number < 0){ //if negative, take the absolute value
            number = number * -1;
        }
        int originalNum = number; //store it for the comparsion in the end

        while(number > 0){
            int lastDigit = number % 10 ;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        System.out.println(reverse);
        //---

        if(reverse == originalNum){
            result = true;
        }

        return result;
    }
}
