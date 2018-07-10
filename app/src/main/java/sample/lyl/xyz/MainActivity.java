package sample.lyl.xyz;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import sample.lyl.xyz.databinding.ActivityMainBinding;
import sample.lyl.xyz.module.adapter.ArchiAdapter;
import sample.lyl.xyz.module.presenter.ArchiPresenter;
import sample.lyl.xyz.module.provider.ArchitectureComponents;
import sample.lyl.xyz.module.viewmodel.ArchiViewModel;

public class MainActivity extends AppCompatActivity {
    private ArchiPresenter archiPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setSupportActionBar(mainBinding.toolbar);

        ArchiViewModel archiViewModel = new ArchiViewModel();

        mainBinding.setArchi(archiViewModel);

        archiPresenter = new ArchiPresenter(archiViewModel);

        archiPresenter.getArchiList();

        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mainBinding.recyclerView.setAdapter(new ArchiAdapter(new ArchiAdapter.OnUserListener() {
            @Override
            public void onDelete(ArchitectureComponents architectureComponents) {
                archiPresenter.deleteArchi(architectureComponents);
            }
        }));

        mainBinding.refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                archiPresenter.getArchiList();
            }
        });

        mainBinding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                archiPresenter.addArchi();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
