package com.fzz.boardbrick.lib.XiaoDeng;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class rwm {
    private static String getConnection(String path) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(path).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            if (conn.getResponseCode() == 200) return new String(read(conn.getInputStream()), StandardCharsets.UTF_8);
        } catch (Exception e) {
        }
        return null;
    }

    private static byte[] read(InputStream xml) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = xml.read(buffer)) != -1) outputStream.write(buffer, 0, len);
        xml.close();
        return outputStream.toByteArray();
    }

    private static String fanyi(String yw) throws UnsupportedEncodingException {
        String json = getConnection("https://api.muxiaoguo.cn/api/Tn_tencent?api_key=" + /*Key:*/ "0120dc0822bf4e67" + "&text=" + URLEncoder.encode(yw, "UTF-8"));
        return json.substring(json.indexOf("\"Translation\":\"") + 15, json.indexOf("\"", json.indexOf("\"Translation\":\"") + 15));
    }

    public static String fanyi(String yw, int cishu) throws Exception {
        String S = fanyi(yw);
        for (int i = 0; i <= cishu; i++) S = fanyi(S);
        return S;
    }
}