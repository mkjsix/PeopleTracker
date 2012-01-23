package it.pronetics.tracker

class RateProfile {
    
    Brand brand
    ResourceRole resourceRole
    
    String toString() {
        return brand.toString() + " - " + resourceRole.toString()
    }
    
    static embedded = {
        ['brand', 'resourceRole']
    }

    static constraints = {
        resourceRole(blank:false)
    }
}
