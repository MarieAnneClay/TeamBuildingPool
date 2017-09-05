package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;

import model.CRClass;
import model.CodeReview;
import model.Member;

public class MainController {
	private Vector<CodeReview> codeReviews=new Vector<CodeReview>();
	private Vector<Member> members=new Vector<Member>();
	private Vector<CRClass> classes=new Vector<CRClass>();
	private String name="bob";
	
	public MainController() throws ParseException {
		/**
		 * TODO:
		 * Charger la database dans les attributs du controlleur
		 */
		
		/**
		 * TEMPORAIRE:
		 * liste fixe de valeurs pour démo JSP
		 */

		
		//classes
		classes.add(new CRClass("pool 2017"));
		classes.add(new CRClass("piscine 2017"));
		
		//membres
		members.add(new Member("John Snow", "jsnow@winterfell.ws", new SimpleDateFormat("dd.mm.yyyy").parse("02.07.1352")));
		members.add(new Member("Santa Klaus", "pernoel@polenord.pn", new SimpleDateFormat("dd.mm.yyyy").parse("01.01.0000")));
		members.add(new Member("Donald Trump", "therealdonald@twitter.com", new SimpleDateFormat("dd.mm.yyyy").parse("14.06.1946")));
		
		members.addElement(new Member("Tahiti Bob", "tbob@springfield.com", new SimpleDateFormat("dd.mm.yyyy").parse("08.10.1984"), classes.get(0)));
		classes.get(0).addMember(members.get(3));
		members.addElement(new Member("Neo", "neo@ebiz.fr", new SimpleDateFormat("dd.mm.yyyy").parse("25.02.1973"), classes.get(1)));
		classes.get(1).addMember(members.get(4));
		
		members.add(new Member("John Snow", "jsnow@winterfell.ws", new SimpleDateFormat("dd.mm.yyyy").parse("02.07.1352")));
		members.add(new Member("Santa Klaus", "pernoel@polenord.pn", new SimpleDateFormat("dd.mm.yyyy").parse("01.01.0000")));
		members.add(new Member("Donald Trump", "therealdonald@twitter.com", new SimpleDateFormat("dd.mm.yyyy").parse("14.06.1946")));
		
		members.addElement(new Member("Tahiti Bob", "tbob@springfield.com", new SimpleDateFormat("dd.mm.yyyy").parse("08.10.1984"), classes.get(0)));
		classes.get(0).addMember(members.get(3));
		members.addElement(new Member("Neo", "neo@ebiz.fr", new SimpleDateFormat("dd.mm.yyyy").parse("25.02.1973"), classes.get(1)));
		classes.get(1).addMember(members.get(4));
		
		//codeReviews
		codeReviews.addElement(new CodeReview("pomme", "ceci est une pomme", new SimpleDateFormat("dd.mm.yyyy").parse("14.09.2017"), classes.get(0)));
	}
	
	public Vector<CodeReview> getCodeReviews() {
		return codeReviews;
	}

	public void setCodeReviews(Vector<CodeReview> codeReviews) {
		this.codeReviews = codeReviews;
	}

	public Vector<Member> getMembers() {
		return members;
	}

	public Vector<Member> getMemberSubest(int start, int size) {
		Vector<Member> ret = new Vector<Member>();
		for (int i=start; i<start+size; i++) {
			if (i>=members.size()) break;
			ret.add(members.get(i));
		}
		return ret;
	}
	
	public void setMembers(Vector<Member> members) {
		this.members = members;
	}

	public Vector<CRClass> getClasses() {
		return classes;
	}

	public void setClasses(Vector<CRClass> classes) {
		this.classes = classes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
