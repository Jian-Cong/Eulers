package projectEluer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem22 {

	public static void main(String[] args) {
		File file = new File("C:/Users/Programmer/Desktop/name.txt");
		 Reader reader = null;
		 long sum = 0;
		 try {
			reader = new InputStreamReader(new FileInputStream(file));
			int tempchar;
			StringBuilder str = new StringBuilder();
			int nameCount = 0;
			boolean flg = true;
			List<String> list = new ArrayList<>();
			while (/*(tempchar = reader.read()) != -1*/flg) {
				tempchar = reader.read();
				if(tempchar>=65 && tempchar <= 90){
					str.append((char)tempchar);
				}
				if(tempchar == 44 || tempchar == -1){
					list.add(str.toString());
					str = new StringBuilder();
				}
				if(tempchar == -1){
					flg = false;
				}
				
            }
            reader.close();
            
            Collections.sort(list);
            for(int i=1;i<=list.size();i++){
            	int j=0;
            	String sr = list.get(i-1);
            	while(j<sr.length()){
            		nameCount += sr.charAt(j)-64;
            		j++;
            	}
            	sum += nameCount*i;
            	nameCount = 0;
            }
            System.out.println(sum);  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
	}

}
