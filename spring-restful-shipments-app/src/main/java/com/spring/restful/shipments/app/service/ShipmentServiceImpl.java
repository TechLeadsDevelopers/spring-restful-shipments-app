package com.spring.restful.shipments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restful.shipments.app.dao.ShipmentDao;
import com.spring.restful.shipments.app.model.Shipment;

@Service
public class ShipmentServiceImpl implements ShipmentService{
	@Autowired
	private ShipmentDao dao;

	@Override
	public Shipment createShipment(Shipment shipment) {
		int count=dao.createShipment(shipment);
		return shipment;
	}

	@Override
	public List<Shipment> createShipmentBatch(List<Shipment> shipments) {
		int count[]=dao.createShipmentBatch(shipments);
		return shipments;
	}

	@Override
	public List<Shipment> getAllShipments() {
		List<Shipment> shipments=dao.getAllShipments();
		return shipments;
	}

	@Override
	public Shipment getShipmentById(Long id) {
		Shipment shipment=dao.getShipmentById(id);
		return shipment;
	}

	@Override
	public Shipment updateShipment(Shipment shipment, Long id) {
		int count=dao.updateShipment(shipment, id);
		return shipment;
	}

	@Override
	public Shipment deleteShipmentById(Long id) {
		int count=dao.deleteShipmentById(id);
		Shipment shipment=new Shipment();//this should come from DB
		shipment.setId(id);
		return shipment;
	}

}
