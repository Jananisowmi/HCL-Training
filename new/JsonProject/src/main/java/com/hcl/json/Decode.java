package com.hcl.json;
import org.json.simple.JSONObject;  
import org.json.simple.JSONValue;  

public class Decode {  
public static void main(String[] args) {  
    String s="{\"name\":\"janu\",\"salary\":600000.0,\"age\":27}";  
    JSONObject jsonObject = (JSONObject)JSONValue.parse(s);  
  
  
    String name = (String) jsonObject.get("name");  
    double salary = (Double) jsonObject.get("salary");  
    long age = (Long) jsonObject.get("age");  
    System.out.println(name+" "+salary+" "+age);  
}  
}  




