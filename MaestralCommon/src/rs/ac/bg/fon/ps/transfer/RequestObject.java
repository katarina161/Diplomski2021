/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.transfer;

import java.io.Serializable;
import java.util.List;
import rs.ac.bg.fon.ps.util.Operation;

/**
 *
 * @author Katarina
 */
public class RequestObject implements Serializable{
    
    private Operation operation;
    private Object argument;
    private List<String> columns;
    private List<Object> values;

    public RequestObject() {
    }

    public RequestObject(Operation operation, Object argument) {
        this.operation = operation;
        this.argument = argument;
    }

    public Object getArgument() {
        return argument;
    }

    public void setArgument(Object argument) {
        this.argument = argument;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }
    
}
