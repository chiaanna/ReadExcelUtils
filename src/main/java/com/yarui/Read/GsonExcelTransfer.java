package com.yarui.Read;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class GsonExcelTransfer {
	public static void main(String[] args) {
		Gson gson = new Gson();
        Staff staff = ImportExcelMain();
        // Java objects to String
        // String json = gson.toJson(staff);

        // Java objects to File
        try (FileWriter writer = new FileWriter("C:\\projects\\staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
