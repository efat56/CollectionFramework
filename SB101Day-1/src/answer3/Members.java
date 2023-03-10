package answer3;

import java.time.LocalDate;
import java.util.Objects;

public class Members {
	
	private int memberId; //(unique);
	private String memberName;
	private int membershipNo; //(unique);
	private LocalDate membershipEnddate;
	
	
	public Members() {
		// TODO Auto-generated constructor stub
	}


	public Members(int memberId, String memberName, int membershipNo, LocalDate membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}


	@Override
	public int hashCode() {
		return Objects.hash(memberId, memberName, membershipEnddate, membershipNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		return memberId == other.memberId && Objects.equals(memberName, other.memberName)
				&& Objects.equals(membershipEnddate, other.membershipEnddate) && membershipNo == other.membershipNo;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getMembershipNo() {
		return membershipNo;
	}


	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}


	public LocalDate getMembershipEnddate() {
		return membershipEnddate;
	}


	public void setMembershipEnddate(LocalDate membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}


	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}
	
	
	
	
	
	


}
