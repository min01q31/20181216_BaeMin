package kr.tjeit.a20181216_baemin;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.security.Permission;
import java.util.List;

public class MainActivity extends BaseActivity {
    LinearLayout korBtn;
    LinearLayout bunBtn;
    LinearLayout jpBtn;
    private LinearLayout cBtn;
    private LinearLayout pizzaBtn;
    private LinearLayout chinBtn;
    private LinearLayout jBtn;
    private LinearLayout yaBtn;
    private LinearLayout stewBtn;
    Button callBtn;

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
        /*korBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext, "한식을 눌렀습니다.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, RestaurantListActivity.class);
                intent.putExtra("음식종류","한식");
                startActivity(intent);
            }
        });
        //분식 버튼을 눌렀을때 할일
        bunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "분식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        //일식 버튼을 눌렀을때 할일
        jpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "돈까스.회.일식을 눌렀습니다.", Toast.LENGTH_SHORT).show();
            }
        });
*/
        View.OnClickListener foodKindClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext, "버튼 클릭", Toast.LENGTH_SHORT).show();

                //if(v.getId() == R.id.cBtn){
                  //  Toast.makeText(mContext, "치킨 눌림", Toast.LENGTH_SHORT).show();
                //}
                //else if(v.getId() ==R.id.pizzaBtn){
                 //   Toast.makeText(mContext, "피자 눌림", Toast.LENGTH_SHORT).show();
                //}

                //두번째 방법 : XML TAG이용
                //Toast.makeText(mContext, v.getTag().toString(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext,RestaurantListActivity.class);
                intent.putExtra("음식종류",v.getTag().toString());
                startActivity(intent);
            }
        };

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PermissionListener pl = new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {
                        Uri rui = Uri.parse("tel:0101234567");
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        mContext.startActivity(intent);
                    }

                    @Override
                    public void onPermissionDenied(List<String> deniedPermissions) {
                        Toast.makeText(mContext, "전화를 걸기위해선 권한 승인이 필요합니다.", Toast.LENGTH_SHORT).show();
                    }
                };

                        TedPermission.with(mContext).setPermissionListener(pl).setPermissions(Manifest.permission.CALL_PHONE).check();
            }
        });

        jpBtn.setOnClickListener(foodKindClickListener);
        bunBtn.setOnClickListener(foodKindClickListener);
        korBtn.setOnClickListener(foodKindClickListener);
        cBtn.setOnClickListener(foodKindClickListener);
        chinBtn.setOnClickListener(foodKindClickListener);
        pizzaBtn.setOnClickListener(foodKindClickListener);
        jBtn.setOnClickListener(foodKindClickListener);
        yaBtn.setOnClickListener(foodKindClickListener);
        stewBtn.setOnClickListener(foodKindClickListener);


    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {


        // 사실 읽을 필요가 전혀 없는 코드들
        //따로 메쏘드를 만들어서 밑으로 치워버리자
        this.stewBtn = (LinearLayout) findViewById(R.id.stewBtn);
        this.yaBtn = (LinearLayout) findViewById(R.id.yaBtn);
        this.jBtn = (LinearLayout) findViewById(R.id.jBtn);
        this.chinBtn = (LinearLayout) findViewById(R.id.chinBtn);
        this.pizzaBtn = (LinearLayout) findViewById(R.id.pizzaBtn);
        this.cBtn = (LinearLayout) findViewById(R.id.cBtn);
        this.jpBtn = (LinearLayout) findViewById(R.id.jpBtn);
        this.bunBtn = (LinearLayout) findViewById(R.id.bunBtn);
        this.korBtn = (LinearLayout) findViewById(R.id.korBtn);
        this.stewBtn = (LinearLayout) findViewById(R.id.stewBtn);
        this.yaBtn = (LinearLayout) findViewById(R.id.yaBtn);
        this.jBtn = (LinearLayout) findViewById(R.id.jBtn);
        this.chinBtn = (LinearLayout) findViewById(R.id.chinBtn);
        this.pizzaBtn = (LinearLayout) findViewById(R.id.pizzaBtn);
        this.cBtn = (LinearLayout) findViewById(R.id.cBtn);
        this.jpBtn = (LinearLayout) findViewById(R.id.jpBtn);
        this.bunBtn = (LinearLayout) findViewById(R.id.bunBtn);
        this.korBtn = (LinearLayout) findViewById(R.id.korBtn);
        callBtn = findViewById(R.id.callBtn);
    }
}
