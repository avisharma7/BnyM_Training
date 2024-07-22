package com.phone;
import com.phone.Android;
import com.phone.Windows;
import com.phone.IOS;

public class OperatingSystemFactory {
    public os getInstance (String str){
        if(str.equals("Open")){
            return new Android();
        }
        else if(str.equals("open")){
            return new IOS();
        }
        else
            return new Windows();

    }
}
