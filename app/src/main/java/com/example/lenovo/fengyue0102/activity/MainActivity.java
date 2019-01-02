package com.example.lenovo.fengyue0102.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.fengyue0102.R;
import com.example.lenovo.fengyue0102.adapter.MAdapter;
import com.example.lenovo.fengyue0102.contract.IShowContract;
import com.example.lenovo.fengyue0102.entity.User;
import com.example.lenovo.fengyue0102.presenter.ShowPresenter;

import java.util.HashMap;
import java.util.List;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity implements IShowContract.IShowView {

    private TextView title;
    private TextView price;
    private ShowPresenter presenter;
    private MAdapter mAdapter;
    private GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        price =findViewById(R.id.price);
        gv =findViewById(R.id.gv);
        presenter = new ShowPresenter(this);
        mAdapter = new MAdapter(this);
       // final String pid = title.getText().toString();
       // final String price1 = price.getText().toString();
        //HashMap<String,String> params=new HashMap<>();
        //params.put("pid",21+"");
        //params.put("price",price1);
       // presenter.show(params);
    }

    @Override
    public void onSuccess(User user) {
        final User.Data data = user.getData();
        mAdapter.setList(data);
        gv.setAdapter(mAdapter);
    }

    @Override
    public void onSuccessMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
