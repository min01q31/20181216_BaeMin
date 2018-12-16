package kr.tjeit.a20181216_baemin;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public abstract void setupEvents();
    public abstract void setValues();
    public abstract void bindViews();

}
