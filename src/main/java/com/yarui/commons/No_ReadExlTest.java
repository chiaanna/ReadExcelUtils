package com.yarui.commons;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.URL;
//import java.net.URLConnection;
//
//public class ReadExlTest {
////public static String sendPost(String url, String param) {
//
//	public static void main(String[] args) {
//
//		 PrintWriter out = null;
//	        BufferedReader in = null;
//	        String result = "";
//	        try {
//	            URL realUrl = new URL("https://10.20.1.226:8088/services/collector");
//	            // 開啟和URL之間的連線
//	            URLConnection conn = realUrl.openConnection();
//	            // 設定通用的請求屬性
//	            conn.setRequestProperty("Content-Type","application/json");
//	            conn.setRequestProperty("charset", "utf-8");
//	    
//	            // 傳送POST請求必須設定如下兩行
//	            conn.setDoOutput(true);
//	            conn.setDoInput(true);
//	            // 獲取URLConnection物件對應的輸出流
//	            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(),"utf-8"));
//
//	            // 傳送請求引數
//	            out.print(param);
//	            // flush輸出流的緩衝
//	            out.flush();
//	            // 定義BufferedReader輸入流來讀取URL的響應
//	            in = new BufferedReader(
//	                    new InputStreamReader(conn.getInputStream()));
//	            String line;
//	            while ((line = in.readLine()) != null) {
//	                result += line;
//	            }
//	            System.out.println(line);
//	        } catch (Exception e) {
//	            System.out.println("傳送 POST 請求出現異常！"+e);
//	            e.printStackTrace();
//	        }
//	        //使用finally塊來關閉輸出流、輸入流
//	        finally{
//	            try{
//	                if(out!=null){
//	                    out.close();
//	                }
//	                if(in!=null){
//	                    in.close();
//	                }
//	            }
//	            catch(IOException ex){
//	                ex.printStackTrace();
//	            }
//	        }
//	        return result;
//	}
//  }
//}