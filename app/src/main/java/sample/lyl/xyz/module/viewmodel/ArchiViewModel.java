package sample.lyl.xyz.module.viewmodel;


import android.databinding.Bindable;
import sample.lyl.xyz.BR;
import java.util.List;

import sample.lyl.xyz.module.provider.ArchitectureComponents;
import sample.lyl.xyz.base.BaseViewModel;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/10 上午9:40
 * <p>
 * Version: 1.0.0
 * <p>
 * Description:
 */
public class ArchiViewModel extends BaseViewModel {

    private List<ArchitectureComponents> architectureComponentsList;

    @Bindable
    public List<ArchitectureComponents> getArchitectureComponentsList() {
        return architectureComponentsList;
    }

    public void setArchitectureComponentsList(List<ArchitectureComponents> architectureComponentsList) {
        this.architectureComponentsList = architectureComponentsList;
        notifyPropertyChanged(BR.architectureComponentsList);
    }

}
