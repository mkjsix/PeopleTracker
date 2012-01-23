package it.pronetics.tracker

class Customer {
    
    String name
    String city
    String nation
    String comments
    
    String toString() {
        return name + (isBlank(city) ? "" : " - " + city) + (isBlank(nation) ? "" : " ("+ nation +")")
    }
    
    boolean isBlank(String s) {
        return (s == null || s.isEmpty())
    }
    
    static constraints = {
        name(blank:false)
        city(nullable:true)
        nation(nullable:true)
        comments(widget:"textarea", nullable:true)
    }
}
