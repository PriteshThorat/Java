import java.io.*;
import java.lang.*;
import java.util.*;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
};

class SmartTelephone extends Telephone{
    @Override
    public void ring(){
        System.out.println("Smart Telephone Ringing");
    }
    @Override
    public void lift(){
        System.out.println("Smart Telephone Lifting");
    }
    @Override
    public void disconnect(){
        System.out.println("Smart Telephone Disconnecting");
    }
};

public class PS4{
    public static void main(String[] args){
        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
    }
};