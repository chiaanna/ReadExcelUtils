package com.yarui.bean;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPortStation {
		public static void main(String[] a) 
	    { 
	  
	        // Creating object of Organisation 
	        Organisation org = new Organisation(); 
	  
	        // Insert the data into the object 
	        org = getObjectData(org); 
	  
	        // Creating Object of ObjectMapper define in Jakson Api 
	        ObjectMapper Obj = new ObjectMapper(); 
	  
	        try { 
	  
	            // get Oraganisation object as a json string 
	            String jsonStr = Obj.writeValueAsString(org); 
	  
	            // Displaying JSON String 
	            System.out.println(jsonStr); 
	        } 
	  
	        catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	    } 
	  
	    // Get the data to be inserted into the object 
	    public static getObjectData(Organisation org) 
	    { 
	  
	        // Insert the data 
	        org.setName("GeeksforGeeks"); 
	        org.setDescription("A computer Science portal for Geeks"); 
	        org.setEmployees(2000); 
	  
	        // Return the object 
	        return org; 
	    } 
