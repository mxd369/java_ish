public class BinarySearch
{
    int binarySearch(list, first, last, target)
    {
        int mid = (first+last)/2;
    }
    
    // base case

    if(list[mid]==target) return mid;
    if(first>last) return -1;
    
    
    // recursive part
    
    else if(list[mid]>target)
    {
        return binarySearch(list,first,mid-1,target);
    }
    else
    {
        return binarySearch(list,mid+1,last,target);
    }
}