package rip.aspect.login.core;

/*
    Code by Aspect @ Uprising Studios
    Project: login
    Date: 11/27/2022 @ 5:49 PM
*/

import java.util.HashMap;

public class Database {

    HashMap<String, String> credentials = new HashMap<>(); //Declaring a HasMap.

    public Database() {
        credentials.put("Aspect", "SafePassword123!"); //Example 1: name = Aspect, password = SafePassword123
        credentials.put("Hacker", "Hacker321!"); //Example 2: name = Hacker, password = Hacker321!
    }

    public HashMap<String, String> getCredentials() { //Getter method
        return credentials;
    }
}
