package sample.lyl.xyz.base;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/9 下午9:02
 * <p>
 * Version: 1.0.0
 * <p>
 * Description:
 */
public class ImageLoader {

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .apply(RequestOptions.circleCropTransform())
                .into(view);

    }
}
