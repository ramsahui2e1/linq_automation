package staticData;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import models.GetListing;
import models.TestData;

public class LoadData {
	 public static GetListing listingForm;
	 public static TestData InputData;
	 public static void ListingDataByFile(String fileName) throws FileNotFoundException {
			Gson gson = new Gson();
				JsonReader reader = new JsonReader(new FileReader(fileName));
				listingForm=gson.fromJson(reader,GetListing.class);		
	 }
	 public static void InputDataByFile(String fileName) throws FileNotFoundException {
			Gson gson = new Gson();
				JsonReader reader = new JsonReader(new FileReader(fileName));
				InputData=gson.fromJson(reader,TestData.class);		
	 }
}
