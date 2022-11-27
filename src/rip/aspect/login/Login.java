package rip.aspect.login;

/*
    Code by Aspect @ Uprising Studios
    Project: login
    Date: 11/27/2022 @ 5:28 PM
*/

import rip.aspect.login.core.Database;

public class Login {

    public static void main(String[] args) { //Basic program startup logic

        Database database = new Database(); //Declaring Database
        LoginPage login = new LoginPage(database.getCredentials()); //Passing credentials to LoginPage
        login.launch(); //Calling the launch method to run the frame
    }
}