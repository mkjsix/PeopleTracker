package it.pronetics.tracker

class CustomerOrder {
    
    OrderId orderId
    Customer customer
    String orderName
    String projectName
    Brand company
    ResourceRole resourceRole
    OrderStatus status
    DeliveryManager deliveryManager
    Boolean billable = false
    Integer totalOrderedDays
    Integer workedPastYear = 0
    Integer remaining
    
    static embedded = {
        ['orderId', 'customer', 'status', 'deliveryManager', 'company', 'resourceRole']
    }

    static constraints = {
        orderName(blank:false)
    }
}
