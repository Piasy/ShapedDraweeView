package com.github.piasy.fresco.draweeview.shaped.example;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.github.piasy.fresco.draweeview.shaped.ShapedDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getApplication());

        setContentView(R.layout.activity_main);

        rightBlackSmall();

        rightAlphaBig();

        rightBlackBig();

        leftAlphaBig();

        showCenterSvg();
    }

    private void rightBlackSmall() {
        ShapedDraweeView shapedDraweeView =
                (ShapedDraweeView) findViewById(R.id.mShapedDraweeView1);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(
                        "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
                .build();
        shapedDraweeView.setController(controller);
    }

    private void rightAlphaBig() {
        ShapedDraweeView shapedDraweeView =
                (ShapedDraweeView) findViewById(R.id.mShapedDraweeView2);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(
                        "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
                .build();
        shapedDraweeView.setController(controller);
    }

    private void rightBlackBig() {
        ShapedDraweeView shapedDraweeView =
                (ShapedDraweeView) findViewById(R.id.mShapedDraweeView3);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(
                        "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
                .build();
        shapedDraweeView.setController(controller);
    }

    private void leftAlphaBig() {
        ShapedDraweeView shapedDraweeView =
                (ShapedDraweeView) findViewById(R.id.mShapedDraweeView4);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(
                        "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
                .build();
        shapedDraweeView.setController(controller);
    }

    private void showCenterSvg() {
        final ShapedDraweeView shapedDraweeView =
                (ShapedDraweeView) findViewById(R.id.mShapedDraweeView5);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(
                        "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
                .build();
        shapedDraweeView.setController(controller);
    }
}
