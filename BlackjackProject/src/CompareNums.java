public class CompareNums {
    public static int compareNums (int num1, int num2) {

        if (num1 > 21 && num2 > 21) {
            return 0;
        }
        else if (num1 > 21 && num2 < 21) {
            return num2;
        }
        else if (num1 < 21 && num2 > 21) {
            return num1;
        }
        else if (num1 == 21 && num2 == 21) {
            return num1;
        }
        else {
            return Math.max(num1, num2);
        }
    }
}
