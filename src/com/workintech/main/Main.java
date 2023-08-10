package com.workintech.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("------shouldWakeUp-------------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("-----------hasteen------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println("-----------isCatPlaying------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));

        System.out.println(isCatPlaying(false, 35));
}
    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) return false;
        if (clock < 8 || clock > 20) return true;
        if (!isBarking) return false;
        return isBarking;
    }


public static boolean hasTeen(int firstAge,int secondAge,int thirdAge){

        if((firstAge>=13 && firstAge<=19)
                || (secondAge>=13 && secondAge<=19)
                ||(thirdAge>=13 && thirdAge<=19)){return true;}

        else{ return false;}
    }

public static boolean isCatPlaying(boolean isSummer,int temp){
        if(isSummer ) {
  return temp>25 && temp<=45;

        }
    return temp>25 && temp<=35;
}
}





