package com.spring.restful.shipments.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import com.spring.restful.shipments.app.model.Shipment;

public class ShipmentBatchSetter implements BatchPreparedStatementSetter {
	List<Shipment> shipments;
	
	public ShipmentBatchSetter(List<Shipment> shipments) {
		this.shipments = shipments;
	}
	
	@Override
	public void setValues(PreparedStatement ps, int i) throws SQLException {
		ps.setString(1, shipments.get(i).getName());
		ps.setString(2, shipments.get(i).getSrcloc());
		ps.setString(3, shipments.get(i).getDestloc());
		ps.setString(4, shipments.get(i).getStatus());
		ps.setString(5, shipments.get(i).getDescription());
		ps.setDate(6, new java.sql.Date(new Date().getTime()));
		ps.setTimestamp(7, new Timestamp(new Date().getTime()));
	}

	@Override
	public int getBatchSize() {
		int batchSize=shipments.size();
		return batchSize;
	}

}
