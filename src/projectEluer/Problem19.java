package projectEluer;

public class Problem19 {

	static int week = 1;
	static int count = 0;
	public static void main(String[] args) {
		for(int year=1900;year<=2000;year++){
			count(year);
		}
		System.out.println("count:"+count);
	}

	public static boolean checkYear(int year) {
		if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}
	
	public static void count(int year){
		int m = 1;
		while(m<=12){
			int days = 31;
			switch(m){
			case 1:days = 31;break;
			case 2:
				{
					boolean flg = checkYear(year);
					days = flg?29:28;break;
				}
			case 3:days = 31;break;
			case 4:days = 30;break;
			case 5:days = 31;break;
			case 6:days = 30;break;
			case 7:days = 31;break;
			case 8:days = 31;break;
			case 9:days = 30;break;
			case 10:days = 31;break;
			case 11:days = 30;break;
			case 12:days = 31;break;
			}
			week = week+days%7;
			week = week%7;
			if(week == 0){
				System.out.println(year+"年"+m+"月");
				if(year >1900){
				count++;
				}
			}
			m++;
		}
	}
	
}
