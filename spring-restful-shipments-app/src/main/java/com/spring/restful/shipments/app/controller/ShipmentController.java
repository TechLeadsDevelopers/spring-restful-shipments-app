package com.spring.restful.shipments.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.shipments.app.common.ShipmentURIs;
import com.spring.restful.shipments.app.model.Shipment;
import com.spring.restful.shipments.app.service.ShipmentService;

@RestController
public class ShipmentController {
	@Autowired
	private ShipmentService service;

	@RequestMapping(value = ShipmentURIs.SHIPMENT_API_ROOT, method = RequestMethod.POST)
	public ResponseEntity<Shipment> createShipment(@RequestBody Shipment shipment) {
		shipment = service.createShipment(shipment);
		return new ResponseEntity<Shipment>(shipment, HttpStatus.CREATED);
	}

	@RequestMapping(value = ShipmentURIs.SHIPMENT_API_ROOT_BATCH, method = RequestMethod.POST)
	public ResponseEntity<List<Shipment>> createShipmentBatch(@RequestBody List<Shipment> shipments) {
		shipments = service.createShipmentBatch(shipments);
		return new ResponseEntity<List<Shipment>>(shipments, HttpStatus.CREATED);
	}

	@RequestMapping(value = ShipmentURIs.SHIPMENT_API_ROOT, method = RequestMethod.GET)
	public ResponseEntity<List<Shipment>> getAllShipments() {
		List<Shipment> shipments = service.getAllShipments();
		return new ResponseEntity<List<Shipment>>(shipments, HttpStatus.OK);
	}

	@RequestMapping(value = ShipmentURIs.SHIPMENT_API_URI_BY_ID, method = RequestMethod.GET)
	public ResponseEntity<Shipment> getShipmentById(@PathVariable("id") String id) {
		Shipment shipment = service.getShipmentById(Long.valueOf(id));
		return new ResponseEntity<Shipment>(shipment, HttpStatus.OK);
	}

	@RequestMapping(value = ShipmentURIs.SHIPMENT_API_URI_BY_ID, method = RequestMethod.PUT)
	public ResponseEntity<Shipment> updateShipmentById(@RequestBody Shipment shipment, @PathVariable("id") String id) {
		shipment = service.updateShipment(shipment, Long.valueOf(id));
		shipment = service.getShipmentById(Long.valueOf(id));
		return new ResponseEntity<Shipment>(shipment, HttpStatus.OK);
	}
	
	@RequestMapping(value=ShipmentURIs.SHIPMENT_API_URI_BY_ID,method=RequestMethod.DELETE)
	public ResponseEntity<Shipment> deleteShipmentById(@PathVariable("id") String id){
		Shipment shipment=service.deleteShipmentById(Long.valueOf(id));
		return new ResponseEntity<Shipment>(shipment,HttpStatus.GONE);
	}
}
