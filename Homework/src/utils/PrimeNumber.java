package utils;

public class PrimeNumber {
	
	public static Boolean checkPrime(int n){  
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1){
			return false;
		} else {
			for(i=2;i<=m;i++){
				if(n%i==0){
					flag=1;
					return false;
				}
			}
			if(flag==0) {
				return true;
			}  
		}
		return false;
	}
}
