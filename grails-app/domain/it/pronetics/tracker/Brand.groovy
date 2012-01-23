package it.pronetics.tracker

class Brand {
    
    String name
    
    String toString() {
        return name
    }

    static constraints = {
        name(unique:true, blank: false)
    }
}
