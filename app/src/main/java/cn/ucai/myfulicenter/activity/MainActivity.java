package cn.ucai.myfulicenter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.myfulicenter.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_NewGoods)
    RadioButton btnNewGoods;
    @Bind(R.id.btn_Boutique)
    RadioButton btnBoutique;
    @Bind(R.id.btn_Category)
    RadioButton btnCategory;
    @Bind(R.id.tvCartHint)
    TextView tvCartHint;
    @Bind(R.id.btn_Cart)
    RadioButton btnCart;
    @Bind(R.id.btn_PersonalCenter)
    RadioButton btnPersonalCenter;

    int index;

    RadioButton[] mRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mRadioButton = new RadioButton[5];
        mRadioButton[0] = btnNewGoods;
        mRadioButton[1] = btnBoutique;
        mRadioButton[2] = btnCategory;
        mRadioButton[3] = btnCart;
        mRadioButton[4] = btnPersonalCenter;
    }

    @OnClick({R.id.btn_NewGoods, R.id.btn_Boutique, R.id.btn_Category, R.id.btn_Cart, R.id.btn_PersonalCenter})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_NewGoods:
                index = 0;
                break;
            case R.id.btn_Boutique:
                index = 1;
                break;
            case R.id.btn_Category:
                index = 2;
                break;
            case R.id.btn_Cart:
                index = 3;
                break;
            case R.id.btn_PersonalCenter:
                index = 4;
                break;
        }
        setRadioButtonStatus();
    }

    private void setRadioButtonStatus() {
        for (int i = 0;i<mRadioButton.length;i++) {
            if (index == i) {
                mRadioButton[i].setChecked(true);
            } else {
                mRadioButton[i].setChecked(false);
            }
        }
    }
}
