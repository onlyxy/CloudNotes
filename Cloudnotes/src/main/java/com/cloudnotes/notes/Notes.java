package com.cloudnotes.notes;

import android.app.TabActivity;
import android.os.Bundle;

/**
 * Author:XiYang on 2016/2/6.
 * Email:765849854@qq.com
 */
public class Notes extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.notes);
        TabHost tabHost = getTabHost();
        //创建一个Tab页面
        TabSpec tab1 = tabHost.newTabSpec("tab1")
                .setIndicator("已接电话") //设置标题
                .setContent(R.id.tab01);//设置内容
        //添加第一个标签页
        tabHost.addTab(tab1);
        //创建一个Tab页面
        TabSpec tab2 = tabHost.newTabSpec("tab2")
                .setIndicator("已接电话") //设置标题
                .setContent(R.id.tab02);//设置内容
        //添加第一个标签页
        tabHost.addTab(tab2);
        //创建一个Tab页面
        TabSpec tab3 = tabHost.newTabSpec("tab3")
                .setIndicator("已接电话") //设置标题
                .setContent(R.id.tab03);//设置内容
        //添加第一个标签页
        tabHost.addTab(tab3);*/
    }
}
