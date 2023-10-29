import java.util.Random;
import java.util.Scanner;

public class DataPoints
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;
        int[] data = new int[ARRAY_SIZE];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for(int p = 0; p < data.length; p++)
        {
            data[p] = rnd.nextInt(100) + 1;
        }

        for(int p = 0; p < data.length; p++)
        {
            System.out.printf("%3d |", data[p]);
        }
        System.out.println();

        int sum = 0;
        for(int p = 0; p < data.length; p++)
        {
            sum = sum + data[p];
        }
        int average = sum / data.length;

        System.out.println("The sum of the random numbers is " + sum);
        System.out.println("The average of the random numbers is " + average);

        int min = data[0];
        int max = data[0];

        for(int p = 0; p < data.length; p++)
        {
            if(min > data[p])
            {
                min = data[p];
            }
            if(max < data[p])
            {
                max = data[p];
            }
        }
        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);
        System.out.println("Average of data is: " + getAverage(data));





        int num = SafeInput.getRangedInt(in, "Enter a number between ", 1, 100);
        num = in.nextInt();
        in.nextLine();
        boolean foundNum = false;

        for(int p = 0; p < data.length; p++)
        {
            if(data[p] == num)
            {
                foundNum = true;
                System.out.println("Your number " + num + " was found at " + p);

            }
        }
        if(!foundNum)
        {
            System.out.println("Your number " + num + " was not found");
        }

        int num2 = SafeInput.getRangedInt(in, "Enter a number between ", 1, 100);
        num2 = in.nextInt();
        in.nextLine();
        foundNum = false;
        for(int p = 0; p < data.length; p++)
        {
            if(data[p] == num)
            {
                foundNum = true;
                System.out.println("Break! Your number " + num2 + " was found at array index " + p);
                break;

            }
        }
        if(!foundNum)
        {
            System.out.println("Your number " + num2 + " was not found in the array index");
        }






    }
    public static double getAverage(int values[])
    {
        double sum = 0;
        for(double p: values)
        {
            sum += p;
        }
        return sum / values.length;
    }




}
