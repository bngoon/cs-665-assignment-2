/*
 * CS-665: Software Design & Patterns
 * Name: Booker Ngoon
 * Date: 03/19/2026
 * Course: Spring 2026
 * Assignment #: 2
 */

package edu.bu.met.cs665;

/**
 * Driver represents the ConcreteObserver in the Observer pattern.
 * It receives updates from the Shop when a new DeliveryRequest is created.
 */
public class Driver implements Observer {

    // Unique identifier for the driver
    private final String id;

    // Driver's name
    private final String name;

    // Current availability status of the driver
    private DriverStatus status;

    // Reference to the subject (Shop)
    private final Shop shop;

    // Stores the last delivery request received
    private DeliveryRequest lastNotifiedRequest;

    /**
     * Constructor initializes driver information and sets default status.
     */
    public Driver(String id, String name, Shop shop) {
        this.id = id;
        this.name = name;
        this.shop = shop;
        this.status = DriverStatus.AVAILABLE;
    }

    /**
     * Called when the Shop notifies observers.
     * Driver pulls the latest delivery request from the Shop.
     */
    @Override
    public void update() {
        this.lastNotifiedRequest = shop.getCurrentRequest();
    }

    public DeliveryRequest getLastNotifiedRequest() {
        return lastNotifiedRequest;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}