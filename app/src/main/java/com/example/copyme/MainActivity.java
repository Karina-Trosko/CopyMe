package com.example.copyme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.arthur);



        Bitmap blurredBitmap = BlurBuilder.blur( this, originalBitmap );
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.book_info);
        linearLayout.setBackground(new BitmapDrawable(getResources(), blurredBitmap));
    }
}
