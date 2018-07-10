package sample.lyl.xyz.module.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/9 下午9:32
 * <p>
 * Version: 1.0.0
 * <p>
 * Description:模拟数据内容
 */
public class ArchiProvider {
    private List<ArchitectureComponents> architectureComponentsList = new ArrayList<>();

    private static ArchiProvider instance;

    public static ArchiProvider getInstance() {
        if (instance == null) {
            instance = new ArchiProvider();
        }
        return instance;
    }


    public ArchiProvider() {
        initData();
    }

    private void initData() {
        architectureComponentsList.clear();
        architectureComponentsList.add(new ArchitectureComponents(1, "ViewModel", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531212899235&di=90a3bcf41a71aad6fc92ddebc0827c1e&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D1856102555%2C1933522622%26fm%3D214%26gp%3D0.jpg", "The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way. The ViewModel class allows data to survive configuration changes such as screen rotations.", "2018-07-10 10:19"));
        architectureComponentsList.add(new ArchitectureComponents(2, "LiveData", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531212899235&di=90a3bcf41a71aad6fc92ddebc0827c1e&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D1856102555%2C1933522622%26fm%3D214%26gp%3D0.jpg", "LiveData is an observable data holder class. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services. This awareness ensures LiveData only updates app component observers that are in an active lifecycle state.", "2018-07-10 10:19"));
        architectureComponentsList.add(new ArchitectureComponents(4, "Lifecycle", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531212899235&di=90a3bcf41a71aad6fc92ddebc0827c1e&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D1856102555%2C1933522622%26fm%3D214%26gp%3D0.jpg", "Defines an object that has an Android Lifecycle. Fragment and FragmentActivity classes implement LifecycleOwner interface which has the getLifecycle method to access the Lifecycle. You can also implement LifecycleOwner in your own classes.", "2018-07-10 10:19"));
        architectureComponentsList.add(new ArchitectureComponents(3, "Room", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531212899235&di=90a3bcf41a71aad6fc92ddebc0827c1e&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D1856102555%2C1933522622%26fm%3D214%26gp%3D0.jpg", "The Room persistence library provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.", "2018-07-10 10:19"));
    }


    public List<ArchitectureComponents> getArchiList() {
        initData();
        return architectureComponentsList;
    }

    public List<ArchitectureComponents> addArchi(ArchitectureComponents architectureComponents) {
        architectureComponentsList.add(architectureComponents);
        return architectureComponentsList;
    }

    public List<ArchitectureComponents> deleteArchi(ArchitectureComponents architectureComponents) {
        architectureComponentsList.remove(architectureComponents);
        return architectureComponentsList;
    }

}
