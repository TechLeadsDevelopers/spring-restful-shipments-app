package com.spring.restful.shipments.app.common;

public interface ShipmentURIs {
	String SHIPMENT_API_ROOT = "/shipments";
	String SHIPMENT_API_ROOT_BATCH =  SHIPMENT_API_ROOT + "/" + "batch";
	String SHIPMENT_API_URI_BY_ID = SHIPMENT_API_ROOT + "/" + "{id}";
	String GET_SHIPMENT_BY_NAME_ID = SHIPMENT_API_ROOT + "/" + "{name}/{id}";

}
