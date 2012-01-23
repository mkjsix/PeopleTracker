package it.pronetics.tracker

class OrderId {
    
    String value
    
    String toString() {
        return value;
    }

    static constraints = {
        value(unique:true)
    }
}
