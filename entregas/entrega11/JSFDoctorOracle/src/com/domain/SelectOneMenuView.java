package com.domain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SelectOneMenuView {

	private String console;
	private String rtl;

	private String option;
	private List<String> options;

	private String longItemLabel;

	@PostConstruct
	public void init() {

		options = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			options.add("Option " + i);
		}
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getRtl() {
		return rtl;
	}

	public void setRtl(String rtl) {
		this.rtl = rtl;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getLongItemLabel() {
		return longItemLabel;
	}

	public void setLongItemLabel(String longItemLabel) {
		this.longItemLabel = longItemLabel;
	}
}
