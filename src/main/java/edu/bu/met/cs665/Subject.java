/*
 * CS-665: Software Design & Patterns
 * Name: Booker Ngoon
 * Date: 03/19/2026
 * Course: Spring 2026
 * Assignment #: 2
 */

package edu.bu.met.cs665;
/**
 * Subject defines the contract for managing observers.
 * Concrete subjects must implement registration, removal,
 * and notification of observers.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
