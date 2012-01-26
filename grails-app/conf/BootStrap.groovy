import it.pronetics.tracker.*

class BootStrap {
    
    def static NOT_ASSIGNED = "NOT ASSIGNED"

    def init = { servletContext ->
         // Check whether the test data already exists.
        if (!OrderId.count()) {
            new OrderId(value: NOT_ASSIGNED).save(failOnError: true)
            new OrderId(value: "No Project").save(failOnError: true)
            new OrderId(value: "ITINV-232").save(failOnError: true)
            new OrderId(value: "ITINV-710").save(failOnError: true)
            new OrderId(value: "ITINV628").save(failOnError: true)
            new OrderId(value: "ITINV-316").save(failOnError: true)
            new OrderId(value: "Pronetics").save(failOnError: true)
            new OrderId(value: "ITINV-1153").save(failOnError: true)
            new OrderId(value: "ITINV-842").save(failOnError: true)
            new OrderId(value: "ITINV-614").save(failOnError: true)
            new OrderId(value: "ITINV-1134").save(failOnError: true)
            new OrderId(value: "ITINV-1135").save(failOnError: true)
            new OrderId(value: "ITINV-847").save(failOnError: true)
            new OrderId(value: "ITINV-1109").save(failOnError: true)
            new OrderId(value: "ITINV-1039").save(failOnError: true)
            new OrderId(value: "sose UK").save(failOnError: true)
            //new OrderId(value: "").save(failOnError: true)
        }
        if (!DeliveryManager.count()) {
            new DeliveryManager(fullName:NOT_ASSIGNED).save(failOnError: true)
            new DeliveryManager(fullName:"Roberto Manicardi").save(failOnError: true)
            new DeliveryManager(fullName:"Maurizio Turatti").save(failOnError: true)
            new DeliveryManager(fullName:"Fabio Paolucci").save(failOnError: true)
            new DeliveryManager(fullName:"Nigel Runnels-Moss").save(failOnError: true)         
        }
        if (!OrderStatus.count()) {
            new OrderStatus(value:"NOT STARTED").save(failOnError: true)
            new OrderStatus(value:"IN PROGRESS").save(failOnError: true)      
            new OrderStatus(value:"COMPLETED").save(failOnError: true)
            new OrderStatus(value:"CANCELLED").save(failOnError: true)
            new OrderStatus(value:"*** UNKNOWN ***").save(failOnError: true)
        }
        if(!Customer.count()) {
            new Customer(name:NOT_ASSIGNED).save(failOnError: true)
            new Customer(name:"Autogrill", nation:"IT").save(failOnError: true)
            new Customer(name:"Bocconi", nation:"IT").save(failOnError: true)
            new Customer(name:"Buongiorno", nation:"IT").save(failOnError: true)
            new Customer(name:"CNR", nation:"IT").save(failOnError: true)
            new Customer(name:"Colacem", nation:"IT").save(failOnError: true)
            new Customer(name:"CSI", nation:"IT").save(failOnError: true)
            new Customer(name:"Elemedia", nation:"IT").save(failOnError: true)
            new Customer(name:"Elsag - Uirnet", nation:"IT").save(failOnError: true)
            new Customer(name:"Grolla- Old company", nation:"IT").save(failOnError: true)
            new Customer(name:"VACATION", nation:"IT", comments:"Vacations / holidays - Not Billable").save(failOnError: true)
            new Customer(name:"Infocamere", nation:"IT").save(failOnError: true)
            new Customer(name:"Jobrapido", nation:"IT").save(failOnError: true)
            new Customer(name:"Mercedes", nation:"IT").save(failOnError: true)
            new Customer(name:"Pizzarotti", nation:"IT").save(failOnError: true)
            new Customer(name:"PRESALES", nation:"IT", comments:"Pre-sales activities - Not Billable").save(failOnError: true)
            new Customer(name:"Prysmian", nation:"IT").save(failOnError: true)
            new Customer(name:"SAI", nation:"IT").save(failOnError: true)
            new Customer(name:"SICKNESS", nation:"IT").save(failOnError: true)
            new Customer(name:"Sole24ore", nation:"IT").save(failOnError: true)
            new Customer(name:"TRAINING", nation:"IT", comments:"Internal or external training activities - Not Billable").save(failOnError: true)
            new Customer(name:"Venis", nation:"IT").save(failOnError: true)
            new Customer(name:"WEF", nation:"IT").save(failOnError: true)
            //new Customer(name:"", nation:"IT").save(failOnError: true)
            //new Customer(name:"", nation:"IT").save(failOnError: true)
        }
        if(!Brand.count()) {
            new Brand(value: NOT_ASSIGNED).save(failOnError: true)
            new Brand(value: "Pro-Netics").save(failOnError: true)
            new Brand(value: "Sourcesense").save(failOnError: true)
            new Brand(value: "XPeppers").save(failOnError: true)
        }
        if (!ResourceRole.count()) {
            new ResourceRole(name: NOT_ASSIGNED).save(failOnError: true)
            new ResourceRole(name: "junior consultant").save(failOnError: true)
            new ResourceRole(name: "consultant").save(failOnError: true)
            new ResourceRole(name: "senior consultant").save(failOnError: true)
            new ResourceRole(name: "architect").save(failOnError: true)
            new ResourceRole(name: "project manager").save(failOnError: true)
            new ResourceRole(name: "team leader").save(failOnError: true)
            new ResourceRole(name: "trainer").save(failOnError: true)
        }

    }
    def destroy = {
    }
}
