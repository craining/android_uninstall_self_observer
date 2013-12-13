package com.zgy.catchuninstallself;

public class UninstallObserver {

	static{
		System.loadLibrary("observer");
	}
	public static native String startWork(String path, String url);//path：data/data/[packageNmae]   ；   url:跳转的页面，需要http://或https://开头
}
