package com.jack.shape;
public class Circle extends shape {
    public Circle(int dim1 , int dim2){
        super(dim1 , -1);
    }
    public double area(){
        return 3.14*this.dim1*this.dim1;
    }
    
}
