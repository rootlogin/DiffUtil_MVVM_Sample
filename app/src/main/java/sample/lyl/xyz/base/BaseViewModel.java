package sample.lyl.xyz.base;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import sample.lyl.xyz.BR;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/10 上午9:42
 * <p>
 * Version: 1.0.0
 * <p>
 * Description:
 */
public class BaseViewModel extends BaseObservable{
    private boolean isRefreshing;

    private boolean isEmpty;

    @Bindable
    public boolean isRefreshing() {
        return isRefreshing;
    }

    public void setRefreshing(boolean refreshing) {
        isRefreshing = refreshing;
        notifyPropertyChanged(BR.refreshing);
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
