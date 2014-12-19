package com.yahoo.tomking.gridimagesearch;

import java.io.Serializable;

public class Settings implements Serializable {
	public static final String kSETTINGS = "settings";

	// HELP, I've fallen and can't get up
	private static final long serialVersionUID = 1L;
	public String siteFilter = "";
	public String imageSize = "";
	public String typeFilter = "";
	public String colorFilter = "";
}
