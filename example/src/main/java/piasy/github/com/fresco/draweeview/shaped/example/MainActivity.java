package piasy.github.com.fresco.draweeview.shaped.example;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import piasy.github.com.fresco.draweeview.shaped.ShapedDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getApplication());

        setContentView(R.layout.activity_main);

        ShapedDraweeView shapedDraweeView = (ShapedDraweeView) findViewById(R.id.mShapedDraweeView);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(
                        "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
                .build();
        shapedDraweeView.setController(controller);
    }
}
