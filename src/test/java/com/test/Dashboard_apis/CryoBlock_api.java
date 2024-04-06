package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CryoBlock_api {
	
	@Test(priority=1)
	public void CryoBlock()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardCryoBlock");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the CryoBlock failed. Status code: " + statusCode1);
        
        System.out.println("API request to the CryoBlock passed. Status code: " + statusCode1);
	}

@Test(priority=2)
    public void api_CryoBlocking_Waiting()
           {
           Response response1 = RestAssured
                   .given()
                   .auth()
                   .basic("admin", "admin")
                   .when()
                   .get("https://apollo2.humanbrain.in/dashboard/queryCryoBlock/1");

           int statusCode1 = response1.getStatusCode();
           if (statusCode1 == 200) {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard Cryo_Blocking_Waiting passed. Status code: " + statusCode1);
               System.out.println("_________________________******_______________________");
           } else {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard Cryo_Blocking_Waiting failed. Status code: " + statusCode1);
           }
           Assert.assertEquals(statusCode1, 200, "API request to the Dashboard API request to the Dashboard Cryo_Blocking_Waiting failed");
           
       }
	@Test(priority=3)
	public void api_Frozen_InProgress() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/queryCryoBlock/2");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Cryo_Blocking_Frozen_InProgress Passed");
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard Cryo_Blocking_Frozen_InProgress failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard API request to the Dashboard Cryo_Blocking_Frozen_InProgress");
         
     }
	@Test(priority=4)
	public void api_CryoBlocking_Out() {
		 Response response1 = RestAssured
                .given()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("https://apollo2.humanbrain.in/dashboard/queryCryoBlock/3");

        int statusCode2 = response1.getStatusCode();
        if (statusCode2 == 200) {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard Cryo_Blocking_Out passed. Status code: " + statusCode2);
            System.out.println("_________________________******_______________________");
        } else {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard Cryo_Blocking_Out  failed. Status code: " + statusCode2);
        }
        Assert.assertEquals(statusCode2, 200, "API request to the Dashboard Cryo_Blocking_Out failed");
        
    }
}
