package com.zgy.catchuninstallself;

public class UninstallObserver {

	static{
		System.loadLibrary("observer");
	}
	public static native String startWork(String path, String url);//path��data/data/[packageNmae]   ��   url:��ת��ҳ�棬��Ҫhttp://��https://��ͷ
}
