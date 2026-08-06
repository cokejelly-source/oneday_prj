package kr.co.oneday.classDetail.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ScheduleDTO {
	private int scheduleCode; // 스케줄 코드
	private int classCode; // 클래스 코드
	private int repeatRuleCode; // 반복 규칙 코드
	private Date classDate; // 수업일
	private Date startTime; // 수업 시작 시간
	private Date endTime; // 수업 종료 시간
	private int minPeople; // 최소 인원
	private int maxPeople; // 최대 인원
	private int remainingPeople; // 잔여 인원
	private String soldOutYn; // 매진 여부(Y/N)
	private Date startDate; // 예약 시작일
	private Date endDate; // 예약 종료일
}
