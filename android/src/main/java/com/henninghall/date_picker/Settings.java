package com.henninghall.date_picker;


import android.text.format.DateFormat;

public class Settings {

    public static boolean usesAmPm (){
        // Fix for both:
        // - https://github.com/henninghall/react-native-date-picker/issues/111#issuecomment-562577758
        // - https://github.com/henninghall/react-native-date-picker/issues/130#issuecomment-577340060
    	return false;
        // return !DateFormat.is24HourFormat(DatePickerManager.context);
    }

}
