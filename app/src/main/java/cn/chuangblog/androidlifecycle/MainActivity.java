package cn.chuangblog.androidlifecycle;

import android.os.Bundle;

public class MainActivity extends XActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageLoader imageLoader = new ImageLoader(this);
        LifeCycleComponentManager.tryAddComponentToContainer(imageLoader,this);
    }

}
