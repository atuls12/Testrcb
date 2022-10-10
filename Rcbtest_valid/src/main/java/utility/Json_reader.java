package utility;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Json_reader {
public static void main(String[] args) throws Exception {		
	}
	
	public static JSONArray getArray() throws Exception {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("./src/test/resources/rcb.json"));
		JSONObject jsonObject = (JSONObject)obj;
		JSONArray players = (JSONArray)jsonObject.get("player");
		return players;
	}

}

