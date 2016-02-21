package com.nucyzh.notes;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

/**
 * 显示照片的Activity
 *
 * @author XiYang
 *
 */
public class AtyPhotoViewer extends Activity {

    private ImageView iv;

    public static final String EXTRA_PATH = "path";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        iv = new ImageView(this);
        setContentView(iv);

        String path = getIntent().getStringExtra(EXTRA_PATH);
        if (path != null) {
            iv.setImageURI(Uri.fromFile(new File(path)));
        } else {
            finish();
        }
    }

}
