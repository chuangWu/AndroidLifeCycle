package cn.chuangblog.androidlifecycle;

import android.content.Context;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-09-17 10:55
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class ImageLoader implements LifeCycleComponent {

    public ImageLoader(Context context) {

    }

    @Override
    public void onBecomesPartiallyInvisible() {
        //activity-->onPause
    }

    @Override
    public void onBecomesVisible() {
        //activity-->onResume
    }

    @Override
    public void onBecomesTotallyInvisible() {
        //activity-->onStop
    }

    @Override
    public void onBecomesVisibleFromTotallyInvisible() {
        //activity-->onRestart
    }

    @Override
    public void onDestroy() {
        //activity-->onDestroy
    }
}
