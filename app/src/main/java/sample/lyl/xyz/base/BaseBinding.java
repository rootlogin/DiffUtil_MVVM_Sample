package sample.lyl.xyz.base;

import android.databinding.BindingAdapter;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/9 下午9:12
 * <p>
 * Version: 1.0.0
 * <p>
 * Description:
 */
public class BaseBinding {

    @BindingAdapter("recyclerData")
    public static void setListData(RecyclerView recyclerView, List list) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null)
            return;

        if (list == null)
            return;

        if (adapter instanceof BaseRecyclerViewAdapter) {
            try {
                ((BaseRecyclerViewAdapter) adapter).setData(list);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @BindingAdapter("refreshing")
    public static void setLoading(SwipeRefreshLayout swipeRefreshLayout, boolean refreshing) {
        swipeRefreshLayout.setRefreshing(refreshing);
    }


    @BindingAdapter("visible")
    public static void setVisible(View view, boolean isVisible) {
        view.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }
}
