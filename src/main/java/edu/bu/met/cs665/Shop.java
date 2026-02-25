/*
 * CS-665: Software Design & Patterns
 * Name: Booker Ngoon
 * Date: 03/19/2026
 * Course: Spring 2026
 * Assignment #: 2
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

/**
 * Shop represents the ConcreteSubject in the Observer pattern.
 * It maintains a list of observers (drivers) and notifies them
 * whenever a new DeliveryRequest is created.
 */
public class Shop implements Subject {

    // Name of the shop
    private final String name;

    // List of registered observers (drivers)
    private final List<Observer> observers;

    // The current delivery request being processed
    private DeliveryRequest currentRequest;

    /**
     * Constructor initializes the shop name and observer list.
     */
    public Shop(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    /**
     * Registers a new observer (driver).
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an existing observer (driver).
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers of a state change.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * Creates a new delivery request and notifies all drivers.
     */
    public void createDeliveryRequest(DeliveryRequest request) {
        this.currentRequest = request;
        notifyObservers();
    }

    /**
     * Returns the current delivery request.
     */
    public DeliveryRequest getCurrentRequest() {
        return currentRequest;
    }

    public String getName() {
        return name;
    }
}