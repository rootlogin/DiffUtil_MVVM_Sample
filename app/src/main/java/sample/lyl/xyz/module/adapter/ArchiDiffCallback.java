package sample.lyl.xyz.module.adapter;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;

import java.util.List;

import sample.lyl.xyz.module.provider.ArchitectureComponents;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/9 下午9:24
 * <p>
 * Version: 1.0.0
 * <p>
 * Description: Adapter的改变完全取决于这里对数据比对的结果
 */
public class ArchiDiffCallback extends DiffUtil.Callback {
    private List<ArchitectureComponents> oldArchitectureComponentsList;
    private List<ArchitectureComponents> newArchitectureComponentsList;

    public ArchiDiffCallback(List<ArchitectureComponents> oldArchitectureComponentsList, List<ArchitectureComponents> newArchitectureComponentsList) {
        this.oldArchitectureComponentsList = oldArchitectureComponentsList;
        this.newArchitectureComponentsList = newArchitectureComponentsList;
    }

    @Override
    public int getOldListSize() {
        return oldArchitectureComponentsList.size();
    }

    @Override
    public int getNewListSize() {
        return newArchitectureComponentsList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldArchitectureComponentsList.get(oldItemPosition).getId() == newArchitectureComponentsList.get(newItemPosition).getId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldArchitectureComponentsList.get(oldItemPosition).getName().equals(newArchitectureComponentsList.get(newItemPosition).getName())
                && oldArchitectureComponentsList.get(oldItemPosition).getDescription().equals(newArchitectureComponentsList.get(newItemPosition).getDescription());
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        // Implement method if you're going to use ItemAnimator
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}
