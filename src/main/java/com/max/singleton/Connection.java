package com.max.singleton;

public class Connection {
    private static Connection instance;

        	    public static synchronized Connection getInstance(){
        	        if (instance == null) {
            	            instance = new Connection();
            	        }

        	        return instance;
        	    }
}
