package com.shpp.p2p.cs.vshevtsova.assignment9;

import org.junit.jupiter.api.function.Executable;

import java.awt.*;

public class MyArrayList extends List {

    private static final int DEFAULT_SIZE = 0;
    private static int size = DEFAULT_SIZE;
    private static Object[] elements; //Object because elements can be any type

    public MyArrayList(){
        this.elements = null;
        this.size = 0;
    }

    public void add_elem(Object elem){
        if(this.size == 0) {
            this.elements = new Object[]{elem};
            this.size = 1;
        } else{
            Object[] remember = this.elements;
            this.elements = new Object[this.size + 1];
            for(int i = 0; i < remember.length; i++){
                this.elements[i] = remember[i];
            }
            this.elements[this.size] = elem;
            this.size += 1;

        }
    }

    public int get_size(){
        return this.size;
    }

    public void fill_arr(Object o, int number){
        this.elements = new Object[number];
        for(int i = 0; i < number; i++){
            this.elements[i] = o;
        }
        this.size = number;
    }

    public Object get_elem(int index) throws ArrayIndexOutOfBoundsException{
        return this.elements[index];
    }

    public Object[] get_elements(){
        return this.elements;
    }
}
