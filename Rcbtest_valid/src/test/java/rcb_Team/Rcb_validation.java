package rcb_Team;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import utility.Json_reader;

public class Rcb_validation {

	public static void main(String[] args) throws Exception {
		//Json_reader jsonobj = new Json_reader();
		//JSONArray player = jsonobj.getArray();
		JSONArray player = Json_reader.getArray();

		int count1=0;
		int count2 = 0;
		for(int i=0;i<player.size();i++) {
			JSONObject oneplayer = (JSONObject) player.get(i);		
			if(oneplayer.get("country").equals("India")) {
				count1++;
			}
			if(oneplayer.get("role").equals("Wicket-keeper")) {
				count2++;
			}
		}
		if(count1==7) {	
			System.out.println("only 4 forgn plys in team");
		}
		else {
			throw new Exception ("response validation is not as per concern");  

		}
		if(count2 == 1) {
			System.out.println("only one player is wicket keeper");
		}else {
			throw new Exception ("response validation is not as per concern");  
		}
	}

}


