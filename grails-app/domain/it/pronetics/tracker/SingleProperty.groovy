package it.pronetics.tracker

class SingleProperty {
    
    String value
    
    String toString() {
        return value
    }

    static constraints = {
        value(unique:true, blank:false)
    }
}
