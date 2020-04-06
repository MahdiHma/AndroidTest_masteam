package com.example.mastest;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.logging.Handler;

public class RequestHandler{
    private RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.applicationContext);
    private JsonObjectRequest jsonArrayRequest;
    private JSONObject jsonArray;
//    private Handler handler = new android.os.Handler();
    public RequestHandler(final TextView textView){
        final String url = "https://api.mapbox.com/geocoding/v5/mapbox.places/washington.json?access_token=pk.eyJ1IjoibWFoZGlobWEiLCJhIjoiY2s4bjM5ZGd5MGkxYzNmbnNiZnFibGhwMyJ9.JCtipX_U1niNBdId-XpSgQ";
        this.jsonArrayRequest = new JsonObjectRequest(Request.Method.GET, url,jsonArray, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                textView.setText(response.toString());

            }
        }, new Response.ErrorListener(){

            @SuppressLint("SetTextI18n")
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.toString());
            }
        });
        requestQueue.add(jsonArrayRequest);
    }


}
