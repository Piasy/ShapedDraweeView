# ShapedDraweeView

Fresco custom view with mask shape.

## Demo

![demo](art/shaped_drawee_view_demo.jpeg)

## Usage

### Dependency

``` gradle
allprojects {
    repositories {
        maven {
            url  "http://dl.bintray.com/piasy/maven"
        }
    }
}

compile 'com.github.piasy:ShapedDraweeView:1.0.0'
```

### Layout

``` xml
<piasy.github.com.fresco.draweeview.shaped.ShapedDraweeView
        android:id="@+id/mShapedDraweeView"
        android:layout_width="100dp"
        android:layout_height="100dp"
        app:placeholder="@drawable/placeholder"
        app:maskShape="@drawable/mask"
        />
```

### Java

``` java
ShapedDraweeView shapedDraweeView = (ShapedDraweeView) findViewById(R.id.mShapedDraweeView);
DraweeController controller = Fresco.newDraweeControllerBuilder()
        .setUri(Uri.parse(
                "http://img0.bdstatic.com/img/image/shouye/xinshouye/chongwu16830.jpg"))
        .build();
shapedDraweeView.setController(controller);
```

## Credit

1. Shape mask is from: https://github.com/siyamed/android-shape-imageview
2. Fresco custom view is from: http://fresco-cn.org/docs/writing-custom-views.html
