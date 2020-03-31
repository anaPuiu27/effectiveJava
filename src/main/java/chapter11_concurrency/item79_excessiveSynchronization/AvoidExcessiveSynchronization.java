package chapter11_concurrency.item79_excessiveSynchronization;

public class AvoidExcessiveSynchronization {

    //never cede control to the client within a synchronized method or block
    //you should do as little work as possible inside synchronized regions
}
