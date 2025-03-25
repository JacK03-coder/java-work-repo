package com.jack.shape;
public class Sphere extends shape{
    Sphere(int dim1 , int dim2){
        super(dim1 , -1);
    }

    public double area(){
        return 4*3.14*this.dim1*this.dim1;
    }
}  