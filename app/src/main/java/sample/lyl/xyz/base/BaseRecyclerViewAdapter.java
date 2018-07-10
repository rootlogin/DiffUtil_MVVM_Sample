package sample.lyl.xyz.base;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/6 下午4:48
 * <p>
 * Version: 1.0.0
 * <p>
 * Description: 基础Adapter，供Databinging使用
 */
public abstract class BaseRecyclerViewAdapter<VH extends RecyclerView.ViewHolder, T> extends RecyclerView.Adapter<VH> {

    protected abstract void setData(List<T> list);

}
