package it.pronetics.tracker

class OrderStatus {
    
    String value
    
    String toString() {
        return value
    }

    static constraints = {
        value(unique:true)
    }
}
