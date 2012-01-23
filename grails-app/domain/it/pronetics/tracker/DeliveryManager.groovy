package it.pronetics.tracker

class DeliveryManager {
    
    String fullName
    
    String toString() {
        return fullName;
    }

    static constraints = {
        fullName(unique:true)
    }
}
