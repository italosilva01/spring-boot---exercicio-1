package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.Paper;

public class PapelRepository {
	private static List<Paper> papers = new ArrayList<Paper>();
	
	public static List<Paper> getPapeis(){
		return papers;
	}
	
	public static Paper addPapel (Paper p) {
		papers.add(p);
		return p;
	}
}
