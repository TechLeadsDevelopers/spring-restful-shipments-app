package com.spring.restful.shipments.app.service;

import java.util.List;

import com.spring.restful.shipments.app.model.Shipment;

public interface ShipmentService {
	public Shipment createShipment(Shipment shipment);
	public List<Shipment> createShipmentBatch(List<Shipment> shipments);
	public List<Shipment> getAllShipments();
	public Shipment getShipmentById(Long id);
	public Shipment updateShipment(Shipment shipment, Long id);
	public Shipment deleteShipmentById(Long id);

}
