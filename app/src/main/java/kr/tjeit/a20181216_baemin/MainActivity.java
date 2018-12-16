package kr.tjeit.a20181216_baemin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends BaseActivity {
    LinearLayout korBtn;
    LinearLayout bunBtn;
    LinearLayout jpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();


    }

    @Override
    public void setupEvents() {

        //한식 버튼이 눌렸을때 할일
        korBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                startActivity(intent);
            }
        });
        //분식 버튼을 눌렀을때 할일
        bunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "분식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        //일식 버튼을 눌렀을때 할일
        jpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "돈까스.회.일식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {


        // 사실 읽을 필요가 전혀 없는 코드들
        //따로 메쏘드를 만들어서 밑으로 치워버리자
        korBtn = findViewById(R.id.korBtn);
        bunBtn = findViewById(R.id.bunBtn);
        jpBtn = findViewById(R.id.jpBtn);
    }
}
