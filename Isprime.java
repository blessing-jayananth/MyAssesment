package ai;

public class Isprime {

	public static void main(String[] args) {
		int num= 41;
		boolean isprime=true;
		if (num<=1)
		{
			isprime=false;
		}else
		{
			for(int i=2;i<num;i++)
				{
				if(num%i==0)
					{
					isprime=false;
						break;
					}
				}

	}
		if(isprime)
		{
			System.out.println(num+" is a Prime number");
		}
			else
			{
				System.out.println(num+" is not a Prime number");
		}
	}
	

}
