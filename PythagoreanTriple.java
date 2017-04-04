import java.util.Scanner;

public class PythagoreanTriple
{
public static void main( String[] args )
{
System.out.println("Enter the number");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();

for ( int a = 1; a <= number; a++ )
{
for ( int b = 1; b <= number; b++ )
{
for ( int c = 1; c <= number; c++ )
{

if( (a * a) + (b * b) == (c * c) )
{
System.out.print(a);
System.out.print(","+b);
System.out.print(","+c);
System.out.println();
} // end if
} // end 3rd loop inside of 2nd loop
} // end 2nd loop inside of first loop
} // end first loop

} // end method main

} // end class PythagoreanTriple
