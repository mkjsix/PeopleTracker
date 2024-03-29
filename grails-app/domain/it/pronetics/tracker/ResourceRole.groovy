package it.pronetics.tracker

class ResourceRole {
    
    String name
    
    String toString() {
        return name
    }

    static constraints = {
        name(unique:true, blank:false)
    }
}
