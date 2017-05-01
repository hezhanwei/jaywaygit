package com.yishao.myenum;

public enum TraficLamp {
	RED(30) {
		@Override
		protected TraficLamp getNext() {
			// TODO Auto-generated method stub
			return GREEN;
		}
	},
	GREEN(50) {
		@Override
		protected TraficLamp getNext() {
			// TODO Auto-generated method stub
			return YELLOW;
		}
	},
	YELLOW(20) {
		@Override
		protected TraficLamp getNext() {
			// TODO Auto-generated method stub
			return RED;
		}
	},
	
	ONE("key","value") {
		@Override
		protected TraficLamp getNext() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	TWO("key2","value2") {
		@Override
		protected TraficLamp getNext() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	;
	protected abstract TraficLamp getNext();
	private int time;
	private TraficLamp(int time){
		this.time= time;
	}
	private String key;
	private String value;
	private  TraficLamp(String key,String value){
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}


	public String getValue() {
		return value;
	}


	public static void main(String[] args) {
		
		TraficLamp[] values = TraficLamp.values();
		for (TraficLamp traficLamp : values) {
			System.out.println(traficLamp.name()+"---"+traficLamp.values());
		}
		System.out.println(TraficLamp.ONE.key+"--"+TraficLamp.ONE.value);
		
	}
}
