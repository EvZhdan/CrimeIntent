package biz.httpsoftmobile.crimeintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

/**
 * Created by PC on 02.04.2018.
 */

public class PictureUtils {
    public static Bitmap getScaledBitmap(String path, int destWidth, int destHeight){
        //чтение размерок изображения на диске
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path,options);

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        //вычисление степени масштабирования
        int inSampleSize = 1;
        if(srcHeight > destHeight || srcWidth > destWidth){
            float heightScale = srcHeight / destHeight;
            float widthScale = srcWidth / destWidth;
            inSampleSize = Math.round(heightScale > widthScale ? heightScale : widthScale);
        }

        options = new BitmapFactory.Options();
        options.inSampleSize = inSampleSize;

        //чтение данных и создание итогового изображения
        return BitmapFactory.decodeFile(path, options);
    }

    //метод масштабирования с консервативной оценкой
    //Проверяет размер экрана и уменьшает изображение до этого размера
    public static Bitmap getScaledBitmap(String path, Activity activity){
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);
        return  getScaledBitmap(path,size.x,size.y);
    }
}
