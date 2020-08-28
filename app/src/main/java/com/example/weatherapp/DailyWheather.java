

package com.example.weatherapp;

        import android.os.AsyncTask;

        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Locale;

public class DailyWheather extends AsyncTask<String,Void,String> {
    String result;
    @Override
    protected String doInBackground(String... urls) {
        result="";
        System.out.println("11");
        URL link;
        HttpURLConnection myConnection = null;
        System.out.println("12");
        try{
            link = new URL(urls[0]);
            myConnection = (HttpURLConnection)link.openConnection();
            InputStream in = myConnection.getInputStream();
            System.out.println("13");
            InputStreamReader myStreamReader = new InputStreamReader(in);
            int data = myStreamReader.read();
            System.out.println("14");
            while(data != -1){
                char current = (char)data;
                result += current;
                data = myStreamReader.read();
            }
            System.out.println("15");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }return null;
    }
    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);
        System.out.println("16");
        try{
            System.out.println("16.1");


            JSONObject jsonObject = new JSONObject(result);
            JSONArray myObject = jsonObject.getJSONArray("daily");



            System.out.println(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(0).getString("dt"))*1000)));

            MainActivity.d_date1.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(0).getString("dt"))*1000)));
            MainActivity.d_temp1.setText(         myObject.getJSONObject(0).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel1.setText("Feels "+myObject.getJSONObject(0).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min1.setText("Min    "+myObject.getJSONObject(0).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max1.setText("Max   " +myObject.getJSONObject(0).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat1.setText(         myObject.getJSONObject(0).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date2.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(1).getString("dt"))*1000)));
            MainActivity.d_temp2.setText(         myObject.getJSONObject(1).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel2.setText("Feels "+myObject.getJSONObject(1).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min2.setText("Min    "+myObject.getJSONObject(1).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max2.setText("Max   " +myObject.getJSONObject(1).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat2.setText(         myObject.getJSONObject(1).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date3.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(2).getString("dt"))*1000)));
            MainActivity.d_temp3.setText(         myObject.getJSONObject(2).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel3.setText("Feels "+myObject.getJSONObject(2).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min3.setText("Min    "+myObject.getJSONObject(2).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max3.setText("Max   " +myObject.getJSONObject(2).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat3.setText(         myObject.getJSONObject(2).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date4.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(3).getString("dt"))*1000)));
            MainActivity.d_temp4.setText(         myObject.getJSONObject(3).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel4.setText("Feels "+myObject.getJSONObject(3).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min4.setText("Min    "+myObject.getJSONObject(3).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max4.setText("Max   " +myObject.getJSONObject(3).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat4.setText(         myObject.getJSONObject(3).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date5.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(4).getString("dt"))*1000)));
            MainActivity.d_temp5.setText(         myObject.getJSONObject(4).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel5.setText("Feels "+myObject.getJSONObject(4).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min5.setText("Min    "+myObject.getJSONObject(4).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max5.setText("Max   " +myObject.getJSONObject(4).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat5.setText(         myObject.getJSONObject(4).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date6.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(5).getString("dt"))*1000)));
            MainActivity.d_temp6.setText(         myObject.getJSONObject(5).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel6.setText("Feels "+myObject.getJSONObject(5).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min6.setText("Min    "+myObject.getJSONObject(5).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max6.setText("Max   " +myObject.getJSONObject(5).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat6.setText(         myObject.getJSONObject(5).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date7.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(6).getString("dt"))*1000)));
            MainActivity.d_temp7.setText(         myObject.getJSONObject(6).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel7.setText("Feels "+myObject.getJSONObject(6).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min7.setText("Min    "+myObject.getJSONObject(6).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max7.setText("Max   " +myObject.getJSONObject(6).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat7.setText(         myObject.getJSONObject(6).getJSONArray("weather").getJSONObject(0).getString("main"));

            MainActivity.d_date8.setText(new SimpleDateFormat("dd MM, yyyy", Locale.ENGLISH).format(new java.util.Date(Long.valueOf(myObject.getJSONObject(7).getString("dt"))*1000)));
            MainActivity.d_temp8.setText(         myObject.getJSONObject(7).getJSONObject("temp").getString("day")+"°");
            MainActivity.d_feel8.setText("Feels "+myObject.getJSONObject(7).getJSONObject("feels_like").getString("day")+"°");
            MainActivity.d_min8.setText("Min    "+myObject.getJSONObject(7).getJSONObject("temp").getString("min")+"°");
            MainActivity.d_max8.setText("Max   " +myObject.getJSONObject(7).getJSONObject("temp").getString("max")+"°");
            MainActivity.d_weat8.setText(         myObject.getJSONObject(7).getJSONArray("weather").getJSONObject(0).getString("main"));

        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}

