package it.pronetics.tracker

class CustomerOrder {
    
    OrderId orderId
    Customer customer
    String orderName
    String projectName
    RateProfile rateProfile
    OrderStatus status
    DeliveryManager deliveryManager
    Boolean billable = false
    Integer totalOrderedDays
    Integer workedPastYear = 0
    Integer remaining
    
    static embedded = {
        ['orderId', 'customer', 'status', 'deliveryManager', 'rateProfile']
    }

    static constraints = {
        customer(nullable:true)
        orderName(blank:false)
    }
}
