package com.jack.shape;
public class Cylinder extends shape {
    Cylinder(int dim1 , int dim2){
        super(dim1 , dim2);
    }
    public double area(){
        return 2*3.14*this.dim1*(this.dim1+this.dim2);
    }   
}
