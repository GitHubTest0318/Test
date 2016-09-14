import java.util.Scanner;

/**
 * Created by raven on 9/1/2016.
 */
public class Num_ToString {

    public static double[] getNumbers(double[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        double[] array = new double[n];
        array = getNumbers(array);
        GetThatShit(array);

    }

    public static void GetThatShit(double[] array) {


        String[] basic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] notBasic = {"zero", "ten", "eleven", "twelve", "twenty", "thirty", "fifty"};
        String[] Other = {"teen", "ty", "-hundred", "-thousand", "million"};

        for (int i = 0; i < array.length; i++) {

            String str = Double.toString(array[i]);

            String temp = "";

            int length = str.length() - 3;
            for (int j = 0; j < str.length(); j++) {


                switch (length) {
                    case -2:
                        temp += str.charAt(j) + "/100";
                        break;
                    case -1:
                        temp += " and " + str.charAt(j);
                        break;
                    case 0:
                        length = 0;

                        break;
                    case 1:
                        length = 1;
                        temp += " " + basic[Character.getNumericValue(str.charAt(j)) - 1] + " ";

                        break;

                    case 2:
                        length = 2;
                        if (str.charAt(j) == '3') {
                            temp += " thirty";

                        } else if (str.charAt(j) == '2') {
                            temp += " twenty";

                        } else if (str.charAt(j) == '5') {
                            temp += " fifty";

                        } else {
                            temp += (basic[Character.getNumericValue(j) - 1] + "ty");

                        }


                        break;
                    case 3:
                        length = 3;
                        temp += basic[Character.getNumericValue(str.charAt(j)) - 1];
                        temp += " hundred and";


                        break;
                    case 4:
                        length = 4;
                        temp += basic[Character.getNumericValue(str.charAt(j)) - 1];
                        temp += " Thousand";


                        break;
                    case 5:
                        length = 1;
                        if (str.charAt(j) == 3) {
                            temp += " thirty";

                        } else if (str.charAt(j) == 2) {
                            temp += " twenty";

                        } else if (str.charAt(j) == 5) {
                            temp += " fifty";

                        } else if (str.charAt(j) == 1) {
                            temp += " Ten";

                        } else if (str.charAt(j) == 0) {
                            continue;

                        }

                        temp += (basic[Character.getNumericValue(j) - 1] + "ty");

                }
                length--;


            }

            System.out.println(temp);
            temp = "";
            length=0;
        }

    }
}
