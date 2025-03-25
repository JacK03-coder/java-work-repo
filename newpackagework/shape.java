package com.jack.shape;
public class shape{
    int dim1 , dim2;

    public shape(int dim1 , int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;  
    }

    public void setDim1(int dim){
        this.dim1= dim1;
    }
    public int getDim1(){
        return this.dim1;
    }
    public void setDim2(){
        this.dim2 = dim2;
    }
    public int getDim2(){
        return this.dim2;
    }
}