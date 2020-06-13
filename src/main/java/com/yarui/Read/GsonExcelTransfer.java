package com.yarui.Read;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

import net.sf.json.JSONArray;

public class GsonExcelTransfer {
	public static void main(String[] args) {
		Gson gson = new Gson();
		boolean readSheetNum = false;
		int readSheet = 1;
		ImportExeclMain_byMan poi = new ImportExeclMain_byMan();

		JSONArray list = poi.readExcel("C:\\Users\\asus\\Desktop\\港務測站資料.xlsx");
		Gson gjson = new Gson();
		System.out.println(list.size());
		// Java objects to String
		// String json = gson.toJson(staff);

		// Java objects to File
		try {
			FileWriter writer = new FileWriter("C:\\projects\\staff2.json");
			writer.write(list.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
