package kr.co.oneday.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.co.oneday.dto.ReservationDTO;
@Mapper
public interface ReservationDAO {
	
	public ReservationDTO selectReservation(int reservationCode);
	
	public int updatePersonCount(
			@Param("reservationCode") int reservationCode,
			@Param("count") int count);
	
	public int updateTotalPrice(
			@Param("reservationCode") int reservationCode,
			@Param("totalPrice") int totalPrice);
}
