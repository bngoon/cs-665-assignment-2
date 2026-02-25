/*
 * CS-665: Software Design & Patterns
 * Name: Booker Ngoon
 * Date: 03/19/2026
 * Course: Spring 2026
 * Assignment #: 2
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ShopTest {

    @Test
    public void testDeliveryBroadcastToFiveDrivers() {

        Shop shop = new Shop("Target");

        Driver d1 = new Driver("1", "Alice", shop);
        Driver d2 = new Driver("2", "Bob", shop);
        Driver d3 = new Driver("3", "Charlie", shop);
        Driver d4 = new Driver("4", "David", shop);
        Driver d5 = new Driver("5", "Emma", shop);

        shop.registerObserver(d1);
        shop.registerObserver(d2);
        shop.registerObserver(d3);
        shop.registerObserver(d4);
        shop.registerObserver(d5);

        DeliveryRequest request =
                new DeliveryRequest("ORD-001", "Store A", "Customer B", "Laptop");

        shop.createDeliveryRequest(request);

        assertNotNull(d1.getLastNotifiedRequest());
        assertEquals("ORD-001", d1.getLastNotifiedRequest().getOrderId());

        assertNotNull(d5.getLastNotifiedRequest());
        assertEquals("ORD-001", d5.getLastNotifiedRequest().getOrderId());
    }
    @Test
    public void testRemoveObserver() {

        Shop shop = new Shop("Target");

        Driver d1 = new Driver("1", "Alice", shop);
        Driver d2 = new Driver("2", "Bob", shop);

        shop.registerObserver(d1);
        shop.registerObserver(d2);

        shop.removeObserver(d2);

        DeliveryRequest request =
                new DeliveryRequest("ORD-002", "Store A", "Customer B", "Phone");

        shop.createDeliveryRequest(request);

        assertNotNull(d1.getLastNotifiedRequest());
        assertEquals("ORD-002", d1.getLastNotifiedRequest().getOrderId());

        // d2 should not receive update
        assertEquals(null, d2.getLastNotifiedRequest());
    }
    @Test
    public void testDriverStatusChange() {

        Shop shop = new Shop("Target");

        Driver driver = new Driver("1", "Alice", shop);

        assertEquals(DriverStatus.AVAILABLE, driver.getStatus());

        driver.setStatus(DriverStatus.BUSY);

        assertEquals(DriverStatus.BUSY, driver.getStatus());
    }
}