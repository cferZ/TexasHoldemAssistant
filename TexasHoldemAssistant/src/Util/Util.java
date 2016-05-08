package Util;

import java.util.List;

import javax.lang.model.element.QualifiedNameable;

public class Util {
	public static void main(String[] args ){
//		int a[] = {3,1,5,7,2,4,9,6,10,8};  
//	    System.out.println("初始值：");  
//	    for(int i=0;i<a.length;i++){
//	    	System.out.printf("%d ",a[i]);
//	    }  
//	    quickSort(a,0,9);  
//	    System.out.println("\n结果：");  
//	    for(int i=0;i<a.length;i++){
//	    	System.out.printf("%d ",a[i]);
//	    }
		
		
		/////////////////////////////////
		////////test findSame
		int a[]={1,1,1,2,2,5,5};
		int b[]=findSame(a);
		for(int i=0;i<b[0];i++){
			System.out.println(b[i+1]);
		}
	}
	
	/**
	 * 
	 * @param ints
	 * @return int[0] 有多少个same项   int[1]第一个same项是有几个重复数
	 */
	public static int[] findSame(int[] ints){
		int itemCount=1;
		int aim=ints[0];
		int[] result=new int[4];
		result[0]=0;
		for(int i=1;i<ints.length;i++){
			if(ints[i]==aim){//重复元素，累加
				itemCount++;
			}
			else{//不同元素，写入
				aim=ints[i];
				if(itemCount>1){
					result[0]++;
					result[result[0]]=itemCount;
					itemCount=1;
				}
			}
		}
		if(itemCount>1){//解决因遍历完而尚有未写入数据
			result[0]++;
			result[result[0]]=itemCount;
			itemCount=1;
		}
		return result;
	}
	
	/**
	 * 排序
	 * @param ints
	 * @return
	 */
	public static int[] sortInt(int[] ints){
		quickSort(ints, 0, ints.length-1);
		return null;
	}
	
	private static void swap(int[] ints,int posa,int posb)  
	{  
	    int tmp = ints[posa];  
	    ints[posa] = ints[posb];  
	    ints[posb] = tmp;  
	}  
	  
	private static int partition(int a[], int low, int high)  
	{  
	    int privotKey = a[low];                             //基准元素  
	    while(low < high){                                   //从表的两端交替地向中间扫描  
	        while(low < high  && a[high] >= privotKey) --high;  //从high 所指位置向前搜索，至多到low+1 位置。将比基准元素小的交换到低端  
	        swap(a,low,high);  
	        while(low < high  && a[low] <= privotKey ) ++low;  
	        swap(a, low,high);  
	    }  
	    
	    return low;  
	}  
	  
	  
	private static void quickSort(int a[], int low, int high){  
	    if(low < high){  
	        int privotLoc = partition(a,  low,  high);  //将表一分为二  
	        quickSort(a,  low,  privotLoc -1);          //递归对低子表递归排序  
	        quickSort(a,   privotLoc + 1, high);        //递归对高子表递归排序  
	    }  
	} 
}
