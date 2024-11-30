public class MedianOfTwoSorted{
    public static void main(String args[]){
        int nums1[]={1,2,3,4};
        int nums2[]={5,6,7,8};
        int []merged=new int[nums1.length+ nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            merged[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            merged[k++]=nums2[i];
        }

        for(int i=0;i<merged.length;i++){
            System.out.print(merged[i]+" ");
        }
    }
}