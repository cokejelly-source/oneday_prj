package kr.co.oneday.map.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class BookmarkDTO {
	private String className;
	private String classResion;
	private String classImg;
	private String classPrice;
}
