stack<int> deleteMid(stack<int>s,int sizeOfStack,int current)
{
    if(current==sizeOfStack/2)
    {
        s.pop();
        return s;
    }
    int ci=s.top();
    current+=1;
    s.pop();
    s=deleteMid(s,sizeOfStack,current);
    s.push(ci);
    return s;
}
