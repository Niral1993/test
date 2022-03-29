package test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import netscape.javascript.JSObject;

public class JsonClass {

	public static void main(String[] args) {
		
		/*
		 * ResultSet rs = RetrieveData();
	  
	      //Inserting ResutlSet data into the json object
	      while(rs.next()) {
		  
	         JSONObject record = new JSONObject();
			 
	         //Inserting key-value pairs into the json object
	         record.put("ID", rs.getInt("ID"));
	         record.put("First_Name", rs.getString("First_Name"));
	         record.put("Last_Name", rs.getString("Last_Name"));
	         record.put("Date_Of_Birth", rs.getDate("Date_Of_Birth"));
	         record.put("Place_Of_Birth", rs.getString("Place_Of_Birth"));
	         record.put("Country", rs.getString("Country"));
			 
	         array.add(record);
			 
	      }
		 * 
		 * */
		JSONObject jsonObject = new JSONObject();
		
		JSONArray jsonArray = new JSONArray();
		
		
		for(int i = 0; i <=1; i++)
		{
			JSONObject jsonRow = new JSONObject();
			
			jsonRow.put("NAME", "Yes");
			jsonRow.put("AGE", "25");
			
			jsonArray.add(jsonRow);
			
		}
		
		jsonObject.put("status", "true");
		jsonObject.put("msg", "success");
		jsonObject.put("emp", jsonArray);
		
		System.out.println(jsonObject.toJSONString());
		
	}
}
