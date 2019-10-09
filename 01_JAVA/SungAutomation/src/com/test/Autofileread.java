package com.test;

import java.io.*;
// directory를 탐색해서, java source코드를  긁어오는기특한녀석 :) .
public class Autofileread {
	public static void main(String[] args) throws IOException {
		File fi = new File("D:\\");		// 어디서 읽을까
		File ff = new File("new.txt");				// 어디에 쓸까
		FileWriter fw = new FileWriter(ff);
		View(fi, ff, fw);
		fw.close();
		System.out.println(ff.getAbsolutePath()); // 쓴 파일 어디에 있는고
	}

	public static int cnt = 0;
	public static int read = 0;

	// static, class 내에 선언되는 공용변수일때 사용

	public static void View(File fi, File ff, FileWriter fw) throws IOException {
		// directory 탐색을 위해 재귀함수로 만들어 보겠다.

		// System.out.println(++cnt + "======cnt is called   " + fi.getName());
		if (fi.exists() && fi.isDirectory()) {
			for (File str : fi.listFiles()) {
				try {
					if(str.getAbsolutePath().startsWith("D:\\02_ENCORE\\Playdata_0516\\192_168_0_182\\Getting start JAVA")) {
						continue;
					}
					if (str.getName().endsWith(".java") && str.canRead()) {
						
					//	System.out.println(str);
						FileReader fr = new FileReader(str);
						int ch;
						fw.write(read + "     >>>>>    path ");
						fw.write(str.getAbsolutePath());
						fw.write("\n\n");

						while ((ch = fr.read()) != -1) {
							fw.write(ch);
						}
						read ++;
						fw.write("\n\n\n\n\n");
						fr.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
				View(str, ff, fw);
			}
		} else {
			return;
		}
	}
}

