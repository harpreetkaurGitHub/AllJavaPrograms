package com.company.Collectionss.ArrayListss.All;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler extends TimerTask {
    long time=0;
    boolean flag = true;
    static Timer timer=null;

    @Override
    public void run() {
//        if (flag) {
//            time = System.currentTimeMillis();
//            flag=false;
//        }
//        if (System.currentTimeMillis() == time+60000){
//            System.out.println("closing timer ");
//            timer.cancel();
//            System.out.println("timer Closed AT: "+ new Date());
//        }
        completeTask();

    }

    private void completeTask() {

        System.out.println("Timer task started at:" + new Date());
    }

    public static void main(String args[]){

        TimerTask timerTask = new Scheduler();

        timer = new Timer("tas");

//        timer.scheduleAtFixedRate(timerTask, 0, (long) 3.6e+6);
        timer.scheduleAtFixedRate(timerTask, 0, 1000);

        System.out.println("TimerTask started");
    }

}
