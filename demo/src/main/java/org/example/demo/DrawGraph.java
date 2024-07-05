package org.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Arrays;

public class DrawGraph extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //Adding axis data
        String xValue = "0,5,10,15,20,25,30,35,40,45";
        String yValues = "10,20,50,26,78,58,34,98,23,34";
        String xName = "x lab";
        String yName = "y lab";
        String title = "title here";



        String[] xArr = xValue.split(",");
        String[] yArr = yValues.split(",");

        if(xArr.length!=yArr.length){
            System.out.println("Given points length does not matches");
        }

        float[] xGraph = new float[xArr.length];
        float[] yGraph = new float[yArr.length];

        for(int i=0;i<xArr.length;i++){
            xGraph[i] = Float.parseFloat(xArr[i]);

        }
        for(int i=0;i<yArr.length;i++){
            yGraph[i] = Float.parseFloat(yArr[i]);

        }

        XYChart.Series series = new XYChart.Series();

        series.setName(xName);

        for(int i=0;i<xGraph.length;i++){
                series.getData().add(new XYChart.Data(xGraph[i],yGraph[i]));
        }

        Arrays.sort(xGraph);
        Arrays.sort(yGraph);
        //Axis create data
        float xMin = xGraph[0]-5;
        float xMax = xGraph[xGraph.length-1]+5;
        float yMin = yGraph[0]-5;
        float yMax = yGraph[yGraph.length-1]+5;
        float xSpace = (xMax-xMin)/xGraph.length;
        float ySpace = (yMax-yMin)/yGraph.length;

        //Define x axis
        NumberAxis xAxis = new NumberAxis(xMin,xMax,xSpace);
        xAxis.setLabel(xName);

        //Define y axis
        NumberAxis yAxis = new NumberAxis(yMin,yMax,ySpace);
        yAxis.setLabel(yName);

        //Create axis
        LineChart lineChart = new LineChart(xAxis,yAxis);
        //setting the points
        lineChart.getData().add(series);

        //creating group object
        Group root = new Group(lineChart);

        //create object
        Scene scene = new Scene(root,800,500);

        //create seen
        stage.setTitle(title);

        //set seen
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();

    }
}


