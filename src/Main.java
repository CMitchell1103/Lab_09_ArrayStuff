import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int numValue = SafeInput.getRangedInt(in, "Enter a value ",1,100);
        int[]dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100);
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

                System.out.print("|");
            }
        double sum = 0;
        double averageVal = sum / dataPoints.length;

        double average = getAverage(dataPoints);
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]+ "");
            sum += dataPoints[i];
        }

        System.out.println("\nThe sum of these values is " + sum);
        System.out.println("The average of these values are " + average);
        System.out.println("The average of the data points is " + getAverage(dataPoints));

        double count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == numValue) {
                count++;
            }
        }

            System.out.println("The value " + numValue + " is found " + count + " times");

            int secondValue = SafeInput.getRangedInt(in, "Enter a value ",1,100);

            int position = -1;
            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == secondValue) {
                    position = i;

                    break;

                }
            }
            if (position != dataPoints.length - 1) {
                System.out.println("The value " + secondValue + " is found at array index position " + position);

            } else {
                System.out.println("The value " + secondValue + " was not found in the array ");
            }

            int min = dataPoints[0];
            int max = dataPoints[0];
            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] < min) {
                    min = dataPoints[i];
                }
                if (dataPoints[i] > max) {
                    max = dataPoints[i];
                }
            }
            System.out.println("The minimum value is " + min);
            System.out.println("The maximum value is " + max);
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
