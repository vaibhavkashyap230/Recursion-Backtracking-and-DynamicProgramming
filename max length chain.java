// https://practice.geeksforgeeks.org/problems/max-length-chain/1

class CompareByFirst implements Comparator<Pair>
{
  public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}

class GfG
{
    int maxChainLength(Pair a[], int n)
    {
			Arrays.sort(a,new CompareByFirst());
			int dp[] = new int[n];
			for(int i=0;i<n;i++)
			{
				dp[i] = 1;
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i].y<a[j].x)
						dp[j] = Math.max(dp[j],dp[i]+1);
				}
			}
			int max = 0;
			for(int i: dp)
			{
				if(i>max)
				{
					max=i;
				}
			}
			return max;
        
    }
}
