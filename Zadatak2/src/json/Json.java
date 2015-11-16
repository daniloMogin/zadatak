package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Json {
	
	private static final String filePath = "etcd.json";

	public static void main(String[] args) {
		
		
		Object obj;
		try {
			FileReader reader = new FileReader(filePath);
			
			JSONParser jsonParser = new JSONParser();
			//JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
	}

}
