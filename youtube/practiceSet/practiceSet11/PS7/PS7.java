import java.io.*;
import java.util.*;
import java.lang.*;

interface SmartTVRemote{
    void powerOn();
    void powerOff();
}

interface TVRemote extends SmartTVRemote{ 
    void mute();
}

class TV implements TVRemote{
    @Override
    public void powerOn(){
        System.out.println("TV is on");
    }
    @Override
    public void powerOff(){
        System.out.println("TV is off");
    }
    @Override
    public void mute(){
        System.out.println("TV is muted");
    }
};

public class PS7{
    public static void main(String[] args){
        SmartTVRemote tv1 = new TV();
        TVRemote tv2 = new TV();
        tv1.powerOn();
        tv1.powerOff();
        tv2.mute();
    }
};