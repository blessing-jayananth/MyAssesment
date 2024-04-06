package ai;

public class Fibonacciseries {

	public static void main(String[] args) {
		int r=21,firstn=0,secondn=1;
		int nextn;
		for(int i=1;i<=r;i++)
		{
			System.out.println(firstn+ " ");
			nextn=firstn+secondn;
			firstn=secondn;
			secondn=nextn;
		}

	}
}


