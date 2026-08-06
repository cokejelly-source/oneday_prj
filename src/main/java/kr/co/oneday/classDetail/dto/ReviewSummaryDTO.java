package kr.co.oneday.classDetail.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewSummaryDTO {
	private int classCode;//클래스코드
	private int averageRating; // 평균 평점
	private int totalReviewCount; // 총 리뷰 수
	private int fiveStarCount; 
	private int fourStarCount;
	private int threeStarCount;
	private int twoStarCount;
	private int oneStarCount;
}
