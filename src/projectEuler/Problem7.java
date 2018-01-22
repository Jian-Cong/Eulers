package projectEluer;

public class Problem7 {

	public static void main(String[] args) {
		int count = 1;
		int i=3;
		for(;count<10001;i++){
			if(check(i)){
				count++;
				System.out.println(i+"是第"+count+"个质数");
			}
		}
		System.out.println("结果为："+i);
	}
	
	public static boolean check(int num){
		boolean flg = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flg = false;
				break;
			}
		}
		return flg;
	}

}
