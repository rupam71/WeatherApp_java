package com.example.weatherapp;

import android.os.AsyncTask;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Weather extends AsyncTask<String,Void,String> {
    String result;
    @Override
    protected String doInBackground(String... urls) {
        result="";
        URL link;
        HttpURLConnection myConnection = null;

        try{
            link = new URL(urls[0]);
            myConnection = (HttpURLConnection)link.openConnection();
            InputStream in = myConnection.getInputStream();
            InputStreamReader myStreamReader = new InputStreamReader(in);
            int data = myStreamReader.read();
            while(data != -1){
                char current = (char)data;
                result += current;
                data = myStreamReader.read();
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }return null;
    }
    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);

        try{
            JSONObject myObject = new JSONObject(result);
            JSONObject main = new JSONObject(myObject.getString("main"));
            JSONObject coord = new JSONObject(myObject.getString("coord"));

            String temperature = main.getString("temp");
            String feels_like = main.getString("feels_like");
            String temp_min = main.getString("temp_min");
            String temp_max = main.getString("temp_max");

            String lon = coord.getString("lon");
            String lat = coord.getString("lat");

            String placeName = myObject.getString("name");


            MainActivity.place.setText(placeName);
            MainActivity.temp.setText(temperature+"°");
            MainActivity.feels_like.setText("Feels " + feels_like+"°");
            MainActivity.temp_min.setText("Min    "+temp_min+"°");
            MainActivity.temp_max.setText("Max   " + temp_max+"°");
            MainActivity.lat = lat;
            MainActivity.lon = lon;

            System.out.println("weather"+lat+"  "+lon);


            System.out.println("weather 2 "+lat+"  "+lon);
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}
