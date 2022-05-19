package com.te.learnjava8.presentation;

public class MusicPlayer {
	private String mpBrand;
	private double mpPrice;

	public MusicPlayer(String mpBrand, double mpPrice) {
		super();
		this.mpBrand = mpBrand;
		this.mpPrice = mpPrice;
	}

	@Override
	public String toString() {
		return "MusicPlayer [mpBrand=" + mpBrand + ", mpPrice=" + mpPrice + "]";
	}

}
