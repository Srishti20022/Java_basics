package codechef;


import java.util.Scanner;

public class adaking
{   public static int[][] a = new int [64][64];
		
	    
		public static void main(String[] args) {
		int [] arr= {1,4,9,16,225,36,49,64};
	
		a[0][0]='O';
		    for(int i=0;i<64;++i){
		        for(int j=0;j<64;++j){
		            if(i!=0&&j!=0){
		                a[i][j]=' ';
		            }
		        }
		    }
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int flag=0,i=0;
		System.out.print("O ");//O represents king whereas X represents obstacle
		while(flag==0&&i<7) 
		{
			if(arr[i]==n)//if n is a perfect square 
			{   i++;
				flag=1;
			}else if (arr[i]>n&&arr[i+1]<n)//if n is not a perfect square 
			{    i++;
				flag=2;
			}
			i++;
		}
		if(flag==0&&64==n)//if n is equals to 64 then no obstacles should be printed
		{
			flag=3;
		}System.out.println(flag+" "+i);
            if(flag!=3) {printL(i, flag);}
    }
    private static void cross(int a,int flag) {
	    for(int i = 0 ; i<8;i++){
	        a[i][a]='X';
	        a[a][i]='X';
	    }
	    if(flag==2){
	        
	        for(int i = 0;i<)
	    }
}

	}

