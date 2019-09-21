package com.main;

class NameNotFoundException extends Exception {

    public NameNotFoundException(String message) {
        super(message);
    }

}
class Customer
{
	String name;
	Customer(String n)
	{
		name=n;
	}

}
public class CustEx {

    public Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return new Customer(name);

    }

    public static void main(String[] args) {

        CustEx obj = new CustEx();

        try {

            Customer cus = obj.findByName("");

        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
