class sum
{
	public static void main(string args[])
{
	int num1,num2,res;
	system.out.println("enter first number value");
	scanner s = new scanner(system.in);
	num1=s.nextInt();
	system.out.println("enter second number value");
	num2=s.nextInt();
	res=(num1+num2)/num2;
	system.out.println("this program is to find sum of two integer values");
	system.out.println("result is"+res);
	if(res>0)
		system.out.println("result is positive value");
	else
		system.out.println("result is negative value");
	system.out.println("this is extra line added");
	system.out.println("this is end of program");
	//this is the final comment
	//one more last comment
}
}
