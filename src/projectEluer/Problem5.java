package projectEluer;

public class Problem5 {
	/**
	 * 计算最小的能被1到20整除的数
	 * @param args
	 */
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		boolean finish = false;
		long num=2520;
		for(;!finish;num++){
			if(check(num)){
				finish = true;
				System.out.println("结果为："+num);
			}
		}
		
		System.out.println(System.currentTimeMillis()-time);
	}
	
	public static boolean check(long num){
		boolean flg = true;
		for(int i=20;i>0;i--){
			if(num%i!=0){
				flg = false;
				break;
			}
		}
		return flg;
	}

}
