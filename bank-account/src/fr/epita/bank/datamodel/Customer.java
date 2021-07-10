package fr.epita.bank.datamodel;

public class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        //this keyword means. It is the current instance we are considering.
        //this could would be executed with a given instance and the given instance is referred to as 'this' keyword.
        //this keyword refers to a specific instance
        //everytime, i want to create an instance of a class let's say account to be created.
        //this keyword is the rule that should be applied.
        //this.name = this keyword in here has the high priority with the parameter of the constructor as the current instance.
        //the curren instance 'this.name' has the higher priority in the constructor than the name inside the original class.
        //this is why, it is a very good practice to write the instances using this keyword.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.startsWith("1")) {
            System.out.println("invalid value");
            return;
            //it is a void function and we have a return.
            //return works like else function.
            //return will not let us use the next function which is this.name = name;
            //it's the same as this
            //  }else {this.name = name;}
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
