package org.example.demo;

import javafx.application.Application;

import static javafx.application.Application.launch;

public abstract class GraphController extends Application {
    public static void main(String[] args){
        GetUserInputs getUserInputs = new GetUserInputs();
        getUserInputs.launch();
    }
}
