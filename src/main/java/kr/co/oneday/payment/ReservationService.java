package kr.co.oneday.payment;

import org.springframework.stereotype.Service;

import kr.co.oneday.dao.PaymentDAO;
import kr.co.oneday.dao.ReservationDAO;
import kr.co.oneday.dto.PaymentDTO;
import kr.co.oneday.dto.ReservationDTO;
@Service
public class ReservationService {
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
