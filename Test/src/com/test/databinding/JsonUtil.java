package com.test.databinding;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtil {

	public void GET4ForeignPlayers() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		List<String> list = new ArrayList<String>();
		JSONArray jsonArray = jsonObject.getJSONArray("player");
		for (int i = 0; i < jsonArray.length(); i++) {
			String country = jsonArray.getJSONObject(i).getString("country");
			if(!country.equalsIgnoreCase("India"))
			{
				String name = jsonArray.getJSONObject(i).getString("name");
				System.out.println(name);
			}
		}
	}

	public void GETWicketKeeper() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		List<String> list = new ArrayList<String>();
		JSONArray jsonArray = jsonObject.getJSONArray("player");
		for (int i = 0; i < jsonArray.length(); i++) {
			String role = jsonArray.getJSONObject(i).getString("role");
			if(role.equalsIgnoreCase("Wicket-keeper"))
			{
				Assert.assertEquals("Wicket-keeper",role);
				System.out.println(jsonArray.getJSONObject(i));
			}
		}
	}
}