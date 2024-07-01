package org.example.demo;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.io.IOException;

public class Draw extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Create title of the interface
        Label title = new  Label("Graph Drawer");
        title.setFont(new Font("Tahoma",30));
        title.setPadding(new Insets(50,100,10,500));


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

        VBox box = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();

        row1.getChildren().addAll(graphTitleL,graphTitle);
        row2.getChildren().addAll(xAxisNameL,xAxisName);
        row3.getChildren().addAll(yAxisNameL,yAxisName);
        row1.setSpacing(20);
        row2.setSpacing(20);
        row3.setSpacing(20);


        box.getChildren().addAll(row1,row2,row3);
        box.setSpacing(20);
        box.setPadding(new Insets(10, 0, 10, 100));

        //Create table
        TableColumn<TableRow, String> xColumn = new TableColumn<>("xValue");
        xColumn.setMinWidth(200);
        xColumn.setCellValueFactory(new PropertyValueFactory<>("xValue"));

        TableColumn<TableRow, String> yColumn = new TableColumn<>("yValue");
        yColumn.setMinWidth(200);
        yColumn.setCellValueFactory(new PropertyValueFactory<>("yValue"));

        TableView<Object> table = new TableView<>();
        table.setItems(getPoints());
        boolean b = table.getColumns().addAll(xColumn, yColumn);

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
        BPane.setCenter(box);

        BPane.setRight(vbox);
        Scene scene = new Scene(BPane,1000,600);
        stage.setScene(scene);
        stage.show();


    }
    public ObservableList<Object> getPoints() {
        ObservableList<TableRow> people = FXCollections.observableArrayList();
        people.add(new TableRow(56, 30));
        people.add(new TableRow(8, 25));
        return getPoints();
    }

    public static void main(String[] args) {
        launch();
    }
}