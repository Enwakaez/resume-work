import java.util.Scanner;

public class StudentGrade
{
   public static void main(String args[])
   {
   int grades[] = new int[5]; // new int variable is x
   int i;
   float total=0, avg;
   Scanner scanner = new Scanner(System.in);
   
   for(i=0; i<5; i++) 
      {
         System.out.print("Enter score for test" +(i+1)+":");
         grades[i] = scanner.nextInt();
         total = total + grades[i];
         }
            scanner.close();
            avg = total/5;
            System.out.print("End of semester grade: ");
            
            if(avg>=90)
         {
            System.out.print("A");
         }
            else if (avg>=80 && avg<90)
            {
            System.out.print("B");
               }
            else if (avg>=70 && avg<80)
            {
               System.out.print("C");
               }
            else if (avg>=60 && avg<70)
            {
               System.out.print("D");
            }
            else
            {
               System.out.print("F");
                  }
         }
}