int rfc(int i,int n,int c,int a[])
{
    if (i==n-1)
    return 1;

    if(i==n-2)
    return 2;

    if(i==n-3)
    return 4;

    int p1,p2,p3;

        if(a[i+1]==0)
        {
            p1=rfc(i+1,n,c,a);
            a[i+1]=p1;
        }
        else
        p1=a[i+1];
        
        if(a[i+2]==0)
        {
            p2=rfc(i+2,n,c,a);
            a[i+2]=p2;
        }
        else
        p2=a[i+2];
        
        if(a[i+3]==0)
        {
            p3=rfc(i+3,n,c,a);
            a[i+3]=p3;
        }
        else
        p3=a[i+3];
    return p1+p2+p3;
}

int stepPerms(int n)
{
    int a[n];
    for(int i=0;i<n;i++)
    {
        a[i]=0;
    }
    int r=rfc(0,n,0,a);
    return r%10000000007;
}
