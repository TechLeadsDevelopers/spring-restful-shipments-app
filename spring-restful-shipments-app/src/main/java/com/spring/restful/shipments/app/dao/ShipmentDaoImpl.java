package com.spring.restful.shipments.app.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.restful.shipments.app.common.DbQueries;
import com.spring.restful.shipments.app.model.Shipment;

@Repository
public class ShipmentDaoImpl implements ShipmentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int createShipment(Shipment shipment) {
		Object[] params = { shipment.getName(), shipment.getSrcloc(), shipment.getDestloc(), shipment.getDescription(),
				shipment.getStatus(), new java.sql.Date(new Date().getTime()), new Timestamp(new Date().getTime()) };
		int count = jdbcTemplate.update(DbQueries.INSERT_SHIPMENT, params);
		return count;
	}

	@Override
	public int[] createShipmentBatch(List<Shipment> shipments) {
		int count[] = jdbcTemplate.batchUpdate(DbQueries.INSERT_SHIPMENT, new ShipmentBatchSetter(shipments));
		return count;
	}

	@Override
	public List<Shipment> getAllShipments() {
		List<Shipment> shipments = jdbcTemplate.query(DbQueries.GET_ALL_SHIPMENT,
				new BeanPropertyRowMapper<Shipment>(Shipment.class));
		return shipments;
	}

	@Override
	public Shipment getShipmentById(Long id) {
		Shipment shipment = jdbcTemplate.queryForObject(DbQueries.GET_SHIPMENT_BY_ID,
				new BeanPropertyRowMapper<Shipment>(Shipment.class),new Object[] {id});
		return shipment;
	}

	@Override
	public int updateShipment(Shipment shipment, Long id) {
		Object[] params = { shipment.getName(), shipment.getSrcloc(), shipment.getDestloc(), shipment.getStatus(),
				shipment.getDescription(), new Timestamp(new Date().getTime()), id };
		int count = jdbcTemplate.update(DbQueries.UPDATE_SHIPMENT_BY_ID, params);
		return count;
	}

	@Override
	public int deleteShipmentById(Long id) {
		Object[] params= {id};
		int count=jdbcTemplate.update(DbQueries.DELETE_SHIPMENT_BY_ID,params);
		return count;
	}
}
