package com.dharma.daiva;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
//@RequestMapping("/daiva")
public class HelloController {

    @GetMapping("/names")
    public @ResponseBody List<String> getUserNames(@RequestParam("userName") String userName) {
    	System.out.println("asdfsadfsdaf");
		List<String> nameList = new ArrayList<String>();
		nameList.add("user1");
		nameList.add("user2");
		return nameList;
     //   return "Hello World!";
    }

   /* @RequestMapping(value = "/names", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<String> getUserNames(
			) {
    	System.out.println("asdfsadfsdaf");
		List<String> nameList = new ArrayList<String>();
		nameList.add("user1");
		nameList.add("user2");
		return nameList;
	}*/
    
 /*   @RequestMapping(value = "/names", method = RequestMethod.POST)
	public void getUserNames(UserDetailRequest userDetail) {
		
		getUserDetails(userId, model, false);
		return "salescenter-user-detail";
	}*/
    
   /* 
    @Data
    static class Result {
        private final int left;
        private final int right;
        private final long answer;
    }

    // SQL sample
    @RequestMapping("calc")
    Result calc(@RequestParam int left, @RequestParam int right) {
        MapSqlParameterSource source = new MapSqlParameterSource()
                .addValue("left", left)
                .addValue("right", right);
        return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
                (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
    }*/
}
