package com.example.baichao.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends Activity {
    private ListView listview;
    private String json = "{ \"result\": [ { \"ID\":\"250\", \"title\": \"123456789\"} , { \"ID\":\"251\", \"title\": \"123456789\"} , { \"ID\":\"252\", \"title\": \"987654321\"} ] }";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listView);
        try {
            JSONObject object = new JSONObject(json);
            JSONObject data = new JSONObject();
            ArrayList<ManagerVO> list = new ArrayList<>();
            JSONArray managerarray = new JSONArray(object.getString("result"));
            for(int i=0;i<managerarray.length();i++){
                data=managerarray.getJSONObject(i);
                String id=data.getString("ID");
                String title=data.getString("title");
                list.add(new ManagerVO(id,title));
            }
            ArrayList<HashMap<String, Object>> list1 = new ArrayList<HashMap<String,Object>>();
            for(ManagerVO manager : list){
                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put("id", manager.getId());
                item.put("name", manager.getmMangerName());
                item.put("phone", manager.getmManagerTel());
                item.put("amount", manager.getmManagerMail());
                list1.add(item);
            }
            SimpleAdapter adapter = new SimpleAdapter(this, list1, R.layout.item,
                    new String[]{"name", "phone", "amount"}, new int[]{R.id.name, R.id.phone, R.id.mail});
            listview.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
