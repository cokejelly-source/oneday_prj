package kr.co.oneday.map.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MapSearchDTO {
	private String dong;
	private int categoryId;
	private Date classDate;
	private String startTime;
}
