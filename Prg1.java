public class Prg1
{
	public static void main(String [] args)
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
		System.out.println((num2 == 0)?"Division is Not Possible as Denominator is Zero":"Division of "+num1+" and "+num2+" is "+(double)(num1/num2*1.0));
	}
}