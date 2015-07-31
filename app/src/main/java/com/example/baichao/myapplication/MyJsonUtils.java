package com.example.baichao.myapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 58 on 2015/7/23.
 */
public class MyJsonUtils {
    public ArrayList<HashMap<String, Object>> JsonToList (JSONObject object){
        ArrayList<ManagerVO> list = new ArrayList<>();
        JSONObject data;
        ArrayList<HashMap<String, Object>> list1 = new ArrayList<HashMap<String,Object>>();
        try {
            JSONArray managerarray = new JSONArray(object.getString("data"));
            for(int i=0;i<managerarray.length();i++){
                data=managerarray.getJSONObject(i);
                String id=data.getString("ID");
                String title=data.getString("title");
                list.add(new ManagerVO(id,title));
            }
            for(ManagerVO manager : list){
                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put("id", manager.getId());
                item.put("name", manager.getmMangerName());
                item.put("phone", manager.getmManagerTel());
                item.put("amount", manager.getmManagerMail());
                list1.add(item);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list1;
    }



}
