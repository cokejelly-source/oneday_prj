package kr.co.oneday.classDetail;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OperatorDTO {
	private int operatorCode;
	private int memberCode;
	private String approvalStatus;
	private String activityName;
	private String profileImage;
	private String creatorIntroduction;
	private String settlementAccount;
	private String settlementAccountImg;
	private String activityRegion;
	private String snsUrl;
	private Date joinDate;
	private List<ClassDTO> classList;
}
