int maxLen(int a[],int n)
{
    int m[n][n];
    int c=0;
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i<j)
            m[i][j]=-1;;
            
            if(i==j)
            m[i][j]=a[i];
            
            else
            m[i][j]=m[i][j-1]+a[j];
            
        }
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(m[i][j]==0)
            {
                int d=j-i+1;
                if(d>c)
                c=d;
            }
        }
    }
    
    return c;
}
