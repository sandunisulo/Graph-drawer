package org.example.demo;

public class TableRow {

    private float xValue;
    private float yValue;

    public TableRow(float xValue,float yValue){
        this.xValue = xValue;
        this.yValue = yValue;
    }

    public void setXValue(float xValue){
        this.xValue = xValue;
    }

    public float getXValue(){
        return xValue;
    }

    public void setYValue(float yValue) {
        this.yValue = yValue;
    }

    public float getYValue() {
        return yValue;
    }
}

