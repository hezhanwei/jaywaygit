package com.yishao.jvm;

import java.util.ArrayList;
import java.util.List;

public class OOMerrorTest {

	static class OOMerror{}
	
	public static void main(String[] args) {
		
		List<OOMerror> list = new ArrayList<>();
		while(true){
			
			list.add(new OOMerror());
			
		}
	}
}
