package com.hackathon.sidetrip.service;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;

public class TripAdvisor {
	ObjectMapper mapper = new ObjectMapper();
	private final String ATTRACTIONS_URL = "http://api.tripadvisor.com/api/partner/2.0/map/{loc}/attractions?subcategory={subcategory}&distance={distance}&key=SingaporeHack-CDCCADCA7505";
	
	public void getAttractions() {
		String location = "1.2843729,103.850611";
		String subcategory = "adventure";
		String distance = "10";
		HttpClient Client = new DefaultHttpClient();
		String URL = ATTRACTIONS_URL.replace("{loc}", location);
		URL = URL.replace("{subcategory}", subcategory);
		URL = URL.replace("distance", distance);
		HttpGet httpget = new HttpGet(URL);
	}

}
