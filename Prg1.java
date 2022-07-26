public class Prg1
{
	public static void main(String [] args)
	{
		double num1=Double.parseDouble(args[0]);
		double num2=Double.parseDouble(args[1]);
		System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
		System.out.println((num2 == 0)?"Division is Not Possible as Denominator is Zero":"Division of "+num1+" and "+num2+" is "+(num1/num2));
	}
}