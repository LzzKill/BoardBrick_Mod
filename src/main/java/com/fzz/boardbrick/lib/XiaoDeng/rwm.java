package com.fzz.boardbrick.lib.XiaoDeng;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/*
 *
 * author : XiaoDeng
 *
 * Chooser : FZZkill
 *
 * */

public class rwm {

    private static String getConnection(String path) {
        //String path = "";
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(path).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            if (conn.getResponseCode() == 200) {
                InputStream xml = conn.getInputStream();
                byte[] data = read(xml);
                //System.out.println(xml);
                return new String(data, Charset.forName("UTF-8"));
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static byte[] read(InputStream xml) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = xml.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        xml.close();
        return outputStream.toByteArray();
    }

    private static String fanyi(String yw) throws UnsupportedEncodingException {
        String en = URLEncoder.encode(yw, "UTF-8");
        String api_key = "0120dc0822bf4e67";
        String json = getConnection("https://api.muxiaoguo.cn/api/Tn_tencent?api_key=" + api_key + "&text=" + en);
        int start = json.indexOf("\"Translation\":\"") + 15;
        int end = json.indexOf("\"", start);
        String translation = json.substring(start, end);
        return translation;
    }

    public static String fanyi(String yw, int cishu) throws Exception {

        String S;
        S = fanyi(yw);
        for (int i = 0; i <= cishu; i++) {
            S = fanyi(S);
        }
        return S;
    }
}
