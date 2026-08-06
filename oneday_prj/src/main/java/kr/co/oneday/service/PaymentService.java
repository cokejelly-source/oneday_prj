package kr.co.oneday.service;

import org.springframework.stereotype.Service;

import kr.co.oneday.dto.PaymentDTO;
import kr.co.oneday.dto.ReservationDTO;
import kr.co.oneday.payment.dao.PaymentDAO;
import kr.co.oneday.payment.dao.ReservationDAO;
@Service
public class PaymentService {
	private ReservationDAO rDAO;
	private PaymentDAO pDAO;
	
	public ReservationDTO getReservationInfo(int reservationCode) {
		
	}
	
	public int updatePersonCount(int reservationCode, int count) {
		
	}
	
	public int calculateTotalPrice(int reservationCode) {
		
	}
	
	public int addPayment(PaymentDTO pDTO) {
		
	}
	
	public int modifyPaymentStatus(int paymentCode) {
		
	}
	
	public PaymentDTO getPayment(int paymentCode) {
		
	}
}
