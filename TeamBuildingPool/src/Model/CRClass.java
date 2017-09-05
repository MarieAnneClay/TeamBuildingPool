package Model;
import java.util.Vector;


public class CRClass {

	private String name;
	private Vector<Member> members;
	
	public CRClass() {
	}
	
	public CRClass(String n) {
		name=n;
	}
	
	public CRClass(String n, Vector<Member> m) {
		name=n;
		members=m;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Vector<Member> getMembers() {
		return members;
	}
	
	public boolean addMember(Member m) {
		return members.add(m);
	}
	
	public boolean addMember(Vector<Member> m) {
		return members.addAll(m);
	}
	
	public boolean deleteMember(Member m) {
		return members.remove(m);
	}
	
	public Member deleteMember(int i) {
		return members.remove(i);
	}
	
}
