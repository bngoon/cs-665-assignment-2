/*
 * CS-665: Software Design & Patterns
 * Name: Booker Ngoon
 * Date: 03/19/2026
 * Course: Spring 2026
 * Assignment #: 2
 */

package edu.bu.met.cs665;
/**
 * DeliveryRequest represents a delivery order
 * containing pickup and drop-off information.
 */
public class DeliveryRequest {

    private final String orderId;
    private final String pickupLocation;
    private final String dropOffLocation;
    private final String productDescription;

    public DeliveryRequest(
            String orderId,
            String pickupLocation,
            String dropOffLocation,
            String productDescription) {

        this.orderId = orderId;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.productDescription = productDescription;
    }

    public String getOrderId() {
        return orderId;
    }
    public String getPickupLocation() {
        return pickupLocation;
    }
    public String getDropOffLocation() {
        return dropOffLocation;
    }
    public String getProductDescription() {
        return productDescription;
    }
}
