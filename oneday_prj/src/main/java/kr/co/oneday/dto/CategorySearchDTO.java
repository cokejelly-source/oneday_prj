package kr.co.oneday.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CategorySearchDTO {
	private int categoryCode;
	private int subCategoryCode;
	private String sort;
	private int minPrice;
	private int maxPrice;
	private int minPeople;
}
