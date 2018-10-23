package zjl.example.com.ndktest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zlc.season.yaksa.YaksaCommonDsl;
import zlc.season.yaksa.YaksaCommonStateDsl;
import zlc.season.yaksa.YaksaItemDsl;
import zlc.season.yaksa.YaksaKt;
import zlc.season.yaksa.YaksaStateDsl;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    RecyclerView example_rv;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Log.e("============", new Java2CJNI().java2C());
        Toast.makeText(this,new Java2CJNI().java2C(),Toast.LENGTH_SHORT).show();

        //轻量级的recyclerview测试
        RecyclerViewTest();
    }

    private void RecyclerViewTest() {
        example_rv = findViewById(R.id.example_rv);
        //Kotlin文件测试
        ToastKt.toast(this,"kotlin测试",300);

        //轻量级列表
//        YaksaKt.linear(example_rv, true, new Function1<YaksaCommonStateDsl, Unit>() {
//            @Override
//            public Unit invoke(YaksaCommonStateDsl yaksaCommonStateDsl) {
//                return null;
//            }
//        });

    }

}
