package com.test;

import java.io.*;
// directory�� Ž���ؼ�, java source�ڵ带  �ܾ���±�Ư�ѳ༮ :) .
public class Autofileread {
	public static void main(String[] args) throws IOException {
		File fi = new File("D:\\");		// ��� ������
		File ff = new File("new.txt");				// ��� ����
		FileWriter fw = new FileWriter(ff);
		View(fi, ff, fw);
		fw.close();
		System.out.println(ff.getAbsolutePath()); // �� ���� ��� �ִ°�
	}

	public static int cnt = 0;
	public static int read = 0;

	// static, class ���� ����Ǵ� ���뺯���϶� ���

	public static void View(File fi, File ff, FileWriter fw) throws IOException {
		// directory Ž���� ���� ����Լ��� ����� ���ڴ�.

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

