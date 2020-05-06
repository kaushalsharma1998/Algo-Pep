
public class Target_Permutation {

	public static int TargetPermuatation(int arr[],int target,String ans)
	{
		if(target==0)
			{
				System.out.print(ans+" ");
				return 1;
			}
		int count =0;
		for (int i=0;i<arr.length;i++)
		{
			if (target-arr[i]>=0)
				count+=TargetPermuatation(arr, target-arr[i], ans+arr[i]+"");
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,7};
		System.out.println(TargetPermuatation(arr, 10, ""));
	}

}
