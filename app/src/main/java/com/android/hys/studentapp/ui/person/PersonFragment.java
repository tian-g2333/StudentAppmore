package com.android.hys.studentapp.ui.person;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.hys.studentapp.R;

public class PersonFragment extends Fragment implements View.OnClickListener {
    private PersonViewModel personViewModel;
    private TextView username;
    private View root;

    private Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        personViewModel =
                ViewModelProviders.of(this).get(PersonViewModel.class);
        root = inflater.inflate(R.layout.fragment_user_center, container, false);
        /*final TextView textView = root.findViewById(R.id.text_person);
        personViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        context=getContext();
        initView();
        return root;
    }

    void initView(){
        /*username=root.findViewById(R.id.user_center_username);
        String username= (String) SPUtil.get(context,"username","");
        //没有用户名重新登录
        if (username==null){
            startActivity(new Intent(context, MainActivity.class));
        }else {
            this.username.setText("用户名:"+username);
        }
        personal=root.findViewById(R.id.personal);
        personal.setOnClickListener(this);
        aboutMe=root.findViewById(R.id.about_me);
        aboutMe.setOnClickListener(this);
        logout=root.findViewById(R.id.logout);
        logout.setOnClickListener(this);
        barCode=root.findViewById(R.id.bar_code);
        barCode.setOnClickListener(this);
        changePassword=root.findViewById(R.id.change_password);
        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ChagePasswordActivity.class);
                String username=(String) SPUtil.get(context,"username","");
                if (username==null){
                    SPUtil.remove(context,"token");
                    SPUtil.remove(context,"password");
                    startActivity(new Intent(context,MainActivity.class));
                }
                intent.putExtra("username",username);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onClick(View view) {

        /*switch (view.getId()){

            case R.id.bar_code:
                Intent intent=new Intent(getContext(), CodeActivity.class);
                startActivity(intent);
                break;

            case R.id.logout:
                logout();
                break;

            case R.id.about_me:
                startActivity(new Intent(context, AboutMeActivity.class));
                break;

            case R.id.personal:
                loadingPersonal();
                onLoading("获取数据","正在获取个人信息,请稍后...",false);
                break;

            default:
                break;
        }*/

    }
}
