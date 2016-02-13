package com.cloudnotes.timepicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;

import com.tencent.streetsdkdemo.R;

/**
 * Author:XiYang on 2016/2/13.
 * Email:765849854@qq.com
 */
public class TimePicker extends Activity {
    //定义5个记录当前时间的变量
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepickertest);
        DatePicker datePickerDialog = (DatePicker)findViewById(R.id.datePicker);
        TimePicker timePicker = (TimePicker)findViewById(R.id.timePicker);
        //获取当前的年


    }
}
