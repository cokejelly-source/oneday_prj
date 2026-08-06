package kr.co.oneday.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDAO {

	public int insertPayment(PaymentDAO pDAO);
	
	public int updatePayment(int paymentCode);
	
	public PaymentDAO selectPayment(int paymentCode);
}
