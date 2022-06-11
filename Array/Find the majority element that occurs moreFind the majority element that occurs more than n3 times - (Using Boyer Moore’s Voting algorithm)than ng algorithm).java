import java.util.*;
public class Main
{
    public static ArrayList<Integer> majorityEle2(int[] arr)
    {
        int n = arr.length;
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        for(int i=0; i<n; i++)
        {
            int ele = arr[i];
            if(ele==num1)
            count1++;
            else if(ele==num2)
            count2++;
            else if(count1==0)
            {
                num1 = ele;
                count1 = 1;
            }
            else if(count2==0)
            {
                num2 = ele;
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==num1)
            count1++;
            else if(arr[i]==num2)
            count2++;
        }
        
        if(count1>n/3)
        ans.add(num1);
        if(count2>n/3)
        ans.add(num2);
        
        return ans;
    }
    
	public static void main(String[] args) {
		int[]  arr = {11,33,33,11,33,11};
		ArrayList<Integer> ans = majorityEle2(arr);
		for (int i=0; i<ans.size(); i++)
		System.out.print(ans.get(i)+" ");
	}
}


