// DataWrapper.java
// Juwan Burden
// 11/22/26
// 

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
    private T value;
    
    // overloaded constructor
    public DataWrapper(T value) {
        this.value = value;
    }
    
    // getValue() method
    public T getValue() {
        return value;
    }
    
    // display method
    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            // getValue drills down to the object's toString
            System.out.println(element.getValue());
        }
    }
}