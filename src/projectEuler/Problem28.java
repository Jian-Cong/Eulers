package projectEluer;

public class Problem28 {

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(sum(1001,0));
		System.out.println("cost:"+(System.currentTimeMillis()-t));
		
		long t1 = System.currentTimeMillis();
		System.out.println(sum(1001));
		System.out.println("cost:"+(System.currentTimeMillis()-t1));

	}
	
	public static int sum(int n,int sum){
		
		if(n == 1){
			return sum+=1;
		}
		sum += 4*n*n-6*n+6;
		return sum(n-2,sum);
	}
	
	public static int sum(int n){
		int sum = 0;
		while(n!= 1){
			sum += 4*n*n-6*n+6+sum(n-2);
		}
		if(n == 1){
			sum ++;
		}
		return sum;
	}

}
