package com.jack.shape;
public class Square extends shape{

    public Square(int dim1 , int dim2) {
        super(dim1, -1);
    }
    public double area(){
        return 2*3.14*this.dim1*this.dim1;
    }
}
