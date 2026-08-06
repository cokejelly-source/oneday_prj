package kr.co.oneday.map.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CategoryDTO {
	private int categoryCode;
	private int parentCategoryCode;
	private String categoryName;
}
