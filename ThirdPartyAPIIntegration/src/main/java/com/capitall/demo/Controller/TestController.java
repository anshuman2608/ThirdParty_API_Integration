package com.capitall.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capitall.demo.Service.AlbumServiceImpl;



@RestController
@RequestMapping("/api")
public class TestController {

	 @Autowired
	 private AlbumServiceImpl albumServiceImpl;
	 
	 
	 
	 @GetMapping("/getPosts")
	    List<Map<String,Object>> getAllPosts(){
	      return   albumServiceImpl.getAllAlbum();
	    }
}
