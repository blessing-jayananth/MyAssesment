package ai;

public class array {

	public static void main(String[] args) {
		int[] a1= {3,2,11,4,6,7};
		int[] a2= {1,2,8,4,9,7};
		for (int i=0;i<a1.length;i++)
		{
			for (int n=0;n<a2.length;n++)
			{
				if(a1[i]==a2[n]) {
					System.out.println("The values are: "+a1[i]);
				}
				
			}
		}

	}

}
