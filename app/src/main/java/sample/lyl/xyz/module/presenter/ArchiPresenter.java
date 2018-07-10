package sample.lyl.xyz.module.presenter;

import sample.lyl.xyz.module.provider.ArchitectureComponents;
import sample.lyl.xyz.module.provider.ArchiProvider;
import sample.lyl.xyz.module.viewmodel.ArchiViewModel;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/10 上午10:33
 * <p>
 * Version: 1.0.0
 * <p>
 * Description: 基本业务处理
 */
public class ArchiPresenter implements Runnable{
    private ArchiViewModel viewModel;

    private ArchiProvider archiProvider;

    public ArchiPresenter(ArchiViewModel viewModel) {
        this.viewModel = viewModel;
        this.archiProvider = ArchiProvider.getInstance();
    }

    public void getArchiList() {
        this.viewModel.setRefreshing(true);
        new android.os.Handler().postDelayed(this,3000);

    }

    public void addArchi() {
        this.viewModel.setArchitectureComponentsList(archiProvider.addArchi(new ArchitectureComponents(5, "Add ArchitectureComponents", "", "", "2018-07-10 10:43")));
    }

    public void deleteArchi(ArchitectureComponents architectureComponents) {
        this.viewModel.setArchitectureComponentsList(archiProvider.deleteArchi(architectureComponents));
    }

    @Override
    public void run() {
        this.viewModel.setArchitectureComponentsList(archiProvider.getArchiList());
        this.viewModel.setRefreshing(false);
    }
}
