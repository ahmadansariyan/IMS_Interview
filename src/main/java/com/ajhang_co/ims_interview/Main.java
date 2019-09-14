

package com.ajhang_co.ims_interview;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.file.Files;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author ahmad
 */
public class Main {
    
     public static void main (String[] args) {
        HashMap <String,String> hm=new HashMap<String,String>();
        HashSet<String> hs=new HashSet<String>();
        
        int[] array=new int[]{0,1,2,3,10,9,8,12,9,2,15,20,40,10};
        //PrintArray(array);
        //MaxMin(array);
        //FindDuplicateNumber(array);
        //sort(array);
        //WorkWithStack(array);
        String str="ahmad ansariyan";
        PrintDuplicatedChar(str);
        
        
 }
     public static void MaxMin(int[] array)
     {
         
        int min=array[0];
        int max=array[0];
        for(int i=0;i<array.length;++i)
        {
            if(min>array[i])
            {
                min=array[i];
            }
            if(max<array[i])
            {
                max=array[i];
            }
        }
        System.out.println("Max element : "+max+"\nMin element : "+min);
     }
     
     public static void FindDuplicateNumber(int[] array)
     {
         HashSet<Integer> hs=new HashSet<Integer>();
         HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
         for(int i=0;i<array.length;++i)
         {
             if(hm.containsKey(array[i]))
             {
                int newCount=hm.get(array[i])+1;
                 hm.replace(array[i], newCount);
             }
             else
             {
                 hm.put(array[i],0);
                 
             }
         }
         System.out.println("Duplicated elements: ");
         int count=0;
         
         for(Map.Entry<Integer,Integer> entry:hm.entrySet())
         {
             if(entry.getValue()>0)                 
             {
                 ++count;
                 System.out.println("Element : "+entry.getKey()+" -> "+entry.getValue());
             }
         }
         
         if(count==0)
         {
             System.out.println("All elements are unique.");
         }
        

     }
     
     public static void PrintArray(int[] array)
     {
         System.out.print("Array :[");
        for(int i : array)
        {
            System.out.print(i+",");
        }
        
        System.out.println("\b]");
     }
     
     public static void sort(int[] array)
     {
         if(array==null || array.length==0)
             return;
         int low=0;
         int high=array.length-1;
         QuickSort(array, low, high);
     }
     
     public static void QuickSort(int[] array, int low,int high)
     {
         int i=low;
         int j=high;
         int pivot=array[low+(high-low)/2];
         
         while(i<=j)
         {
             while(array[j]>pivot)
                 --j;
             while(array[i]<pivot)
                 ++i;
             
             if(i<=j)
             {
                 int temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
                 --j;
                 ++i;
             }
         }
         if(low<j)
             QuickSort(array, low, j);
         if(high>i)
             QuickSort(array, i, high);
         
         PrintArray(array);
     }
     
     public static void WorkWithStack(int[] array)
     {
         Stack<Integer> s=new Stack<Integer>();
         s.push(10);
         s.push(11);
         s.push(12);
         s.push(13);
         
         System.out.println(s.pop());
     }
     
     public static void PrintDuplicatedChar(String str)
     {
         int count=0;
         for(char c:str.toCharArray())     
         {
             for(int i=0;i<count;++i)
                 System.out.print(" ");
             System.out.println(c);
             ++count;
         }
     }
}
