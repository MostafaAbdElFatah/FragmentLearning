package com.mostafaabdel_fatah.fragmentlearning;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView reg_login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction.add(R.id.reg_login_fragment,fragment1);
        fragmentTransaction.commit();
        /********************************************************************************/
        reg_login_btn = (TextView) findViewById(R.id.reg_login_btn);
        reg_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**********************************************************************************/
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(reg_login_btn.getText().equals("Register")) {
                    reg_login_btn.setText("Login");
                    Fragment2 fragment2 = new Fragment2();
                    fragmentTransaction.replace(R.id.reg_login_fragment, fragment2);
                }else {
                    reg_login_btn.setText("Register");
                    Fragment1 fragment1 = new Fragment1();
                    fragmentTransaction.replace(R.id.reg_login_fragment, fragment1);
                }
                fragmentTransaction.commit();
            }
        });
        /********************************************************************************/

    }
}
