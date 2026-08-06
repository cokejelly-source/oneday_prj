package kr.co.oneday.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.co.oneday.dto.ReservationDTO;
@Mapper
public interface ReservationDAO {
	
	public ReservationDTO selectReservation(int reservationCode);
	
	public int updatePersonCount(int reservationCode, int count);
	
	public int updateTotalPrice(int reservationCode, int totalPrice);
}
