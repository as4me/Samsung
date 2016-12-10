package asergeev.samsung.itschool.ru.sec;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnstart,btnpause,btnlap;
    TextView timer;
    Handler customHandler = new Handler();
    LinearLayout container;
    Long startTime=0L,timeInMiilliseconds,timesSwapBuff=0L,updatetime=0L;
    Runnable updatetimerThread = new Runnable() {
        @Override
        public void run() {
            timeInMiilliseconds =SystemClock.currentThreadTimeMillis() - startTime;
            updatetime = timesSwapBuff+timeInMiilliseconds;
            int secs =(int)(updatetime/1000);
            int mins=secs/60;
            secs%=60;
            int milliseconds=(int)(updatetime%1000);
            timer.setText(""+mins+":"+String.format("%2d",secs)+":"+ String.format("%3d",milliseconds));
            customHandler.postDelayed(this,0);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstart = (Button)findViewById(R.id.btnstart);
        btnlap = (Button)findViewById(R.id.btmlap);
        btnpause = (Button)findViewById(R.id.btnpause);
        timer = (TextView)findViewById(R.id.timer);
        container = (LinearLayout) findViewById(R.id.container);


        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = SystemClock.uptimeMillis();
               ;
                customHandler.postDelayed(updatetimerThread,0);

            }
        });
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timesSwapBuff+=timeInMiilliseconds;
                customHandler.removeCallbacks(updatetimerThread);
            }
        });
        btnlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addView = inflater.inflate(R.layout.row,null);
                TextView textView = (TextView)addView.findViewById(R.id.txtconter);
                textView.setText(timer.getText());
                container.addView(addView);
            }
        });

    }
}
