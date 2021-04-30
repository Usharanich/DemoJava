
public class Learning1 {
	public static void main(String[] args)
	{
		System.out.println("Helloworld" + args[0]);
		Addition ad = new Addition();
		int result=ad.addNumbers(2, 3);
		System.out.println(result);
	}
	public static int addNumbers(int a, int b)
	{
	return a+b;
	}
	}


