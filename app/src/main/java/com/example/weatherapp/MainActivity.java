package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static TextView place, feels_like;
    static TextView temp, temp_min, temp_max;
    static TextView d_temp1, d_max1, d_min1, d_date1, d_feel1, d_weat1;
    static TextView d_temp2, d_max2, d_min2, d_date2, d_feel2, d_weat2;
    static TextView d_temp3, d_max3, d_min3, d_date3, d_feel3, d_weat3;
    static TextView d_temp4, d_max4, d_min4, d_date4, d_feel4, d_weat4;
    static TextView d_temp5, d_max5, d_min5, d_date5, d_feel5, d_weat5;
    static TextView d_temp6, d_max6, d_min6, d_date6, d_feel6, d_weat6;
    static TextView d_temp7, d_max7, d_min7, d_date7, d_feel7, d_weat7;
    static TextView d_temp8, d_max8, d_min8, d_date8, d_feel8, d_weat8;
    static String lat, lon;
    Button submit, button2;
    EditText name;
    LinearLayout current, week;
    HorizontalScrollView weekly;
    TextView day;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        place = (TextView)findViewById(R.id.place);
        temp = (TextView)findViewById(R.id.temp);
        temp_min = (TextView)findViewById(R.id.temp_min);
        temp_max = (TextView)findViewById(R.id.temp_max);
        feels_like = (TextView)findViewById(R.id.feels_like);
        day = (TextView)findViewById(R.id.textView);

        d_temp1 = (TextView)findViewById(R.id.d_temp1);
        d_max1 = (TextView)findViewById(R.id.d_max1);
        d_min1 = (TextView)findViewById(R.id.d_min1);
        d_date1 = (TextView)findViewById(R.id.d_date1);
        d_feel1 = (TextView)findViewById(R.id.d_feel1);
        d_weat1 = (TextView)findViewById(R.id.d_weat1);

        d_temp2 = (TextView)findViewById(R.id.d_temp2);
        d_max2 = (TextView)findViewById(R.id.d_max2);
        d_min2 = (TextView)findViewById(R.id.d_min2);
        d_date2 = (TextView)findViewById(R.id.d_date2);
        d_feel2 = (TextView)findViewById(R.id.d_feel2);
        d_weat2 = (TextView)findViewById(R.id.d_weat2);

        d_temp3 = (TextView)findViewById(R.id.d_temp3);
         d_max3 =  (TextView)findViewById(R.id.d_max3);
         d_min3 =  (TextView)findViewById(R.id.d_min3);
        d_date3 = (TextView)findViewById(R.id.d_date3);
        d_feel3 = (TextView)findViewById(R.id.d_feel3);
        d_weat3 = (TextView)findViewById(R.id.d_weat3);

        d_temp4 = (TextView)findViewById(R.id.d_temp4);
         d_max4 =  (TextView)findViewById(R.id.d_max4);
         d_min4 =  (TextView)findViewById(R.id.d_min4);
        d_date4 = (TextView)findViewById(R.id.d_date4);
        d_feel4 = (TextView)findViewById(R.id.d_feel4);
        d_weat4 = (TextView)findViewById(R.id.d_weat4);

        d_temp5 = (TextView)findViewById(R.id.d_temp5);
        d_max5 = (TextView)findViewById(R.id.d_max5);
        d_min5 = (TextView)findViewById(R.id.d_min5);
        d_date5 = (TextView)findViewById(R.id.d_date5);
        d_feel5 = (TextView)findViewById(R.id.d_feel5);
        d_weat5 = (TextView)findViewById(R.id.d_weat5);

        d_temp6 = (TextView)findViewById(R.id.d_temp6);
        d_max6 = (TextView)findViewById(R.id.d_max6);
        d_min6 = (TextView)findViewById(R.id.d_min6);
        d_date6 = (TextView)findViewById(R.id.d_date6);
        d_feel6 = (TextView)findViewById(R.id.d_feel6);
        d_weat6 = (TextView)findViewById(R.id.d_weat6);

        d_temp7 = (TextView)findViewById(R.id.d_temp7);
        d_max7 =  (TextView)findViewById(R.id.d_max7);
        d_min7 =  (TextView)findViewById(R.id.d_min7);
        d_date7 = (TextView)findViewById(R.id.d_date7);
        d_feel7 = (TextView)findViewById(R.id.d_feel7);
        d_weat7 = (TextView)findViewById(R.id.d_weat7);

        d_temp8 = (TextView)findViewById(R.id.d_temp8);
        d_max8 =  (TextView)findViewById(R.id.d_max8);
        d_min8 =  (TextView)findViewById(R.id.d_min8);
        d_date8 = (TextView)findViewById(R.id.d_date8);
        d_feel8 = (TextView)findViewById(R.id.d_feel8);
        d_weat8 = (TextView)findViewById(R.id.d_weat8);

        submit = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        name = findViewById(R.id.name);

        current = (LinearLayout)findViewById(R.id.current);
        week = (LinearLayout)findViewById(R.id.week);
        weekly = (HorizontalScrollView)findViewById(R.id.weekly);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Weather getData = new Weather();
                getData.execute("http://api.openweathermap.org/data/2.5/weather?q="+name.getText().toString()+"&units=metric&appid=c37f3551d980d0899f6e95a99a8a56c8");
                current.setVisibility(View.VISIBLE);
                place.setVisibility(View.VISIBLE);

                Toast.makeText(MainActivity.this, "Inserted", Toast.LENGTH_LONG).show();
                System.out.println(lat+"  "+lon);
                button2.setVisibility(View.VISIBLE);

                weekly.setVisibility(View.INVISIBLE);
                week.setVisibility(View.INVISIBLE);
                day.setVisibility(View.INVISIBLE);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DailyWheather getDailyData = new DailyWheather();
                getDailyData.execute("https://api.openweathermap.org/data/2.5/onecall?lat="+lat+"&lon="+lon+"&units=metric&appid=c37f3551d980d0899f6e95a99a8a56c8");

                System.out.println("weather 3 "+lat+"  "+lon);
                weekly.setVisibility(View.VISIBLE);
                week.setVisibility(View.VISIBLE);
                day.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Inserted 7 day", Toast.LENGTH_LONG).show();
            }
        });

         }
}

// getData.execute("http://api.openweathermap.org/data/2.5/weather?q=dhaka&appid=143e0f40519bb4981221967778b77afa");