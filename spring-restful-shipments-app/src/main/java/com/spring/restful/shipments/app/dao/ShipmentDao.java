package com.spring.restful.shipments.app.dao;

import java.util.List;

import com.spring.restful.shipments.app.model.Shipment;

public interface ShipmentDao {
	
	public int createShipment(Shipment shipment);
	public int[] createShipmentBatch(List<Shipment> shipments);
	public List<Shipment> getAllShipments();
	public Shipment getShipmentById(Long id);
	public int updateShipment(Shipment shipment, Long id);
	public int deleteShipmentById(Long id);
	
}
