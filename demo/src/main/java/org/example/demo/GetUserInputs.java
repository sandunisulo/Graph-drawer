package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class GetUserInputs extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        //Create title of the interface
        Label title = new  Label("Graph Drawer");
        title.setFont(new Font("Tahoma",30));
        title.setPadding(new Insets(50,100,10,350));


        //create data enter fields
        TextField graphTitle = new TextField();
        Label graphTitleL = new Label("Graph Title : ");
        graphTitleL.setFont(new Font("Tahoma", 20));

        TextField xAxisName = new TextField();
        Label xAxisNameL = new Label("X Axis Name : ");
        xAxisNameL.setFont(new Font("Tahoma", 20));

        TextField yAxisName = new TextField();
        Label yAxisNameL = new Label("Y Axis Name : ");
        yAxisNameL.setFont(new Font("Tahoma", 20));

        TextField xValues = new TextField();
        Label xValueL = new Label("Enter x values with comma separated : ");
        xValueL.setFont(new Font("Tahoma", 20));

        TextField yValues = new TextField();
        Label yValueL = new Label("Enter y values with comma separated : ");
        yValueL.setFont(new Font("Tahoma", 20));

        Button submit = new Button("Draw Line Graph");


        VBox box = new VBox();
        VBox box2 = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();
        HBox row5 = new HBox();

        row1.getChildren().addAll(graphTitleL,graphTitle);
        row2.getChildren().addAll(xAxisNameL,xAxisName);
        row3.getChildren().addAll(yAxisNameL,yAxisName);
        row4.getChildren().addAll(xValueL,xValues);
        row5.getChildren().addAll(yValueL,yValues);
        row1.setSpacing(20);
        row2.setSpacing(20);
        row3.setSpacing(20);
        row4.setSpacing(20);
        row5.setSpacing(20);


        box.getChildren().addAll(row1,row2,row3);
        box.setSpacing(20);
        box.setPadding(new Insets(10, 0, 10, 50));

        box2.getChildren().addAll(row4,row5,submit);
        box2.setSpacing(20);
        box2.setPadding(new Insets(10, 10, 10, 0));


        // Name input
        TextField xInput = new TextField();
        xInput.setPromptText("xValue");
        xInput.setMinWidth(100);


        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 100, 10, 10));
        //vbox.getChildren().add(row);


        BorderPane BPane = new BorderPane();

        BPane.setTop(title);
        BPane.setLeft(box);
        BPane.setRight(box2);
       // BPane.setBottom(submit);

        Scene scene = new Scene(BPane,1000,600);
        stage.setScene(scene);
        stage.show();


    }


}
