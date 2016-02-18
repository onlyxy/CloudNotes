package com.cloudnotes.sensor;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import com.tencent.streetsdkdemo.R;

/**
 * Author:XiYang on 2016/2/18.
 * Email:765849854@qq.com
 */
public class Gradienter extends Activity implements SensorEventListener {
    //定义水平仪的仪表盘
    MyView show;
    //定义水平仪能处理的最大倾斜角，超过该角度，气泡将直接位于边界
    int MAX_ANGLE = 30;
    //定义Sensor管理器
    SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
        //获取水平仪的主组件
        show = (MyView) findViewById(R.id.show);
        //获取传感器管理服务
        mSensorManager = (SensorManager)
    }

    @Override

    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
