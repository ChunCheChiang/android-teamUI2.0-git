package e.bill1.teamui20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetActivity extends AppCompatActivity {
    private Button back;
    private Button mus;
    private Button note;
    private Button weather;
    private Button home;
    private Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        back=(Button)findViewById(R.id.btn_back);
        mus=(Button)findViewById(R.id.btn_music);
        home=(Button)findViewById(R.id.btn_home);
        note=(Button)findViewById(R.id.btn_memo);
        weather=(Button)findViewById(R.id.btn_weather);
        explore=(Button)findViewById(R.id.btn_exp);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetActivity.this, SetBackActivity.class);
                startActivity(intent);
                finish();

            }
        });

        mus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetActivity.this, SetMusicActivity.class);
                startActivity(intent);
                //finish();

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetActivity.this, WeatherActivity.class);
                startActivity(intent);
                //finish();

            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetActivity.this, NoteActivity.class);
                startActivity(intent);
                //finish();

            }
        });

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SetActivity.this, ExploreActivity.class);
                startActivity(intent);

            }
        });


    }
}
