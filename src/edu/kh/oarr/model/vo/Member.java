package edu.kh.oarr.model.vo;

public class Member {

	// 필드(==멤버변수) *** 특징 외우기
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	
	// 생성자
	
	// ***생성자규칙
	// 1. 생성자 이름은 클래스명과 같아야한다.
	// 2. 반환형이 없다.
	public Member() {}
	
	public Member (String memberId, String memberPw, String memberName,
			int memberAge, String region) {
		this.memberId=memberId;
		this.memberPw=memberPw;
		this.memberName=memberName;
		this.memberAge=memberAge;
		this.region=region;
	}


	// 메소드
	// getter/setter
	// alt shift s r => selct all => generate
	
	

	/* 다 접근 가능하도록 public 
	 * String 자료형 돌려보내겠다.
	 * 매개변수가 없어서 중복된 이름의 memberId가 없기때문에 memberId라고만 써도 ok
	 */
	
	public String getMemberId() {
		return memberId;   // 필드의 memberId를 getMemberId로 보내는것
	}
	/* setter는 말그대로 세팅하는 것.
	 * 무엇을 세팅할지 전달받아올 것이 필요 ==> 매개변수
	 * setter는 보통 반환 값이 없음 => void (예외있음)
	 */
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		return; 
		// 모든 메서드는 종료시 호출한 곳으로 돌아가는 
		// return구문이 작성되어야 하지만 void구문일 경우 생략이 가능하며
		// 컴파일러가 자동으로 추가해준다
		
	} // 매개변수로 받아온 memberId (외부에서 받아오므로 public 무조건 이 쓰임)
	// 반환값이 없기때문에 void 가 쓰임
	// 받아온 값을 this 로 필드로 돌려줌

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
