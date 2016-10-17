/**
 * AgeCompatibility.java
 *
 * A program that that calculates the recommended age range to date.
 *
 * @author Brandon Nguyen
 *
 * @version October 17, 2016
 *
 */
public class AgeCompatibility {

    private static String datingRange(int age) {
        String result;

        float min, max;

        if (age <= 14) {
            min = age - 0.10f * age;
            max = age + 0.10f * age;

            result = (int)Math.floor(min) + "-" + (int)Math.floor(max);
        } else {

            min = (age/2) + 7;
            max = (age - 7) * 2;

            result = (int)Math.floor(min) + "-" + (int)Math.floor(max);

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(datingRange(27));
        System.out.println(datingRange(5));
        System.out.println(datingRange(17));


    }

}