package com.capitall.demo.Service;


import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Service
public class AlbumServiceImpl implements AlbumService  {
	
	String baseurl="https://jsonplaceholder.typicode.com/";
	
	StringBuilder sb=new StringBuilder(baseurl);
	
	String album="/albums";
	
	@Autowired
	public RestTemplate restTemplate;

	@Override
	public List<Map<String, Object>> getAllAlbum() {
		// TODO Auto-generated method stub
		HttpEntity <Void> httpEntity  = new HttpEntity<>(gethttpHeaders());
		String url = sb.append(album).toString();
		 return  restTemplate.exchange(url , HttpMethod.GET ,httpEntity,List.class).getBody() ;
        
		
		
		
	}
	
	private HttpHeaders gethttpHeaders(){
	       HttpHeaders headers = new HttpHeaders();
	       headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	       headers.setContentType(MediaType.APPLICATION_JSON);
	       return headers;
	    }
	
	
	

}
