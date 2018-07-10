package sample.lyl.xyz.module.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import sample.lyl.xyz.R;
import sample.lyl.xyz.databinding.AdapterArchiBinding;
import sample.lyl.xyz.module.provider.ArchitectureComponents;
import sample.lyl.xyz.base.BaseRecyclerViewAdapter;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/9 下午9:15
 * <p>
 * Version: 1.0.0
 * <p>
 * Description:
 */
public class ArchiAdapter extends BaseRecyclerViewAdapter<ArchiAdapter.ViewHolder, ArchitectureComponents> {
    private List<ArchitectureComponents> architectureComponentsList = new ArrayList<>();

    private OnUserListener onUserListener;

    public ArchiAdapter(OnUserListener onUserListener) {
        this.onUserListener = onUserListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        AdapterArchiBinding archiBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.adapter_archi, viewGroup, false);

        return new ViewHolder(archiBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final ArchitectureComponents architectureComponents = architectureComponentsList.get(position);
        viewHolder.archiBinding.setArchi(architectureComponents);

        viewHolder.archiBinding.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onUserListener != null) {
                    onUserListener.onDelete(architectureComponents);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return architectureComponentsList.size();
    }

    @Override
    protected void setData(List<ArchitectureComponents> list) {
        final ArchiDiffCallback diffCallback = new ArchiDiffCallback(this.architectureComponentsList, list);

        /**
         * 主意：如果数据量大的情况，比对数据差异（DiffUtil.calculateDiff()）放到子线程处理，
         * 将处理结果返回到主线程（DiffUtil.DiffResult）
         */
        final DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffCallback);

        this.architectureComponentsList.clear();
        this.architectureComponentsList.addAll(list);
        diffResult.dispatchUpdatesTo(this);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterArchiBinding archiBinding;

        public ViewHolder(@NonNull AdapterArchiBinding archiBinding) {
            super(archiBinding.getRoot());
            this.archiBinding = archiBinding;
        }
    }

    public interface OnUserListener {
        void onDelete(ArchitectureComponents architectureComponents);
    }
}
