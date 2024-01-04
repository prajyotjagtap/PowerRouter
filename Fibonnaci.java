package PowerRouter;

// 2. Write a Program for the first 10 numbers of Fibonacci series.
// Example:
// ○ Output : 0,1,1,2,3,5,8,13,21,34

public class Fibonnaci 
{
    public static void main(String args[])
    {
        int num=10;

        int firstTerm=0;
        int secondTerm=1;

        for(int i=0;i<num;i++)
        {
            System.out.print(firstTerm+", ");

            int thirdTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
    }
}
