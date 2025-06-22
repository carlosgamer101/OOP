// Program to demonstrate exception handling mechanism
// Java program to demonstrate ArithmeticException
class MyException extends Exception
{
 int a;
 MyException(int b)
{
 a=b;
 }
 public String toString()
{
 return ("Exception Number = "+a) ;
 }
}
class JavaException
{
 public static void main(String args[])
{
 try
{
 throw new MyException(2);
 // throw is used to create a new exception and throw it.
 }
catch(MyException e)
{
 System.out.println(e) ;
}
}
}

