package projectEluer.problem50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestMain {
    public static void main(String[] args){
        List<FutureTask> list = new ArrayList<>();
        for(int i=1;i<=100;i++){
            Problem50 th = new Problem50(10000*(i-1),10000*i,i);
            FutureTask<String> future = new FutureTask<>(th);
            new Thread(future).start();
            list.add(future);
        }
        List<String> str = new ArrayList<>();
        for(FutureTask future:list){
            try{
                str.add((String)future.get());
            }catch(ExecutionException e){
                e.printStackTrace();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        List<Integer> countLs = new ArrayList<>();
        int max = 0;
        long goal = 0;
        for(String s:str){
            String temp = s.split("-")[0];
            String g = s.split("-")[1];
            if(Integer.valueOf(temp)>max){
                max = Integer.valueOf(temp);
                goal = Long.valueOf(g);
            }
        }
        System.out.println(goal+"能被累加"+max+"次");
    }

}
