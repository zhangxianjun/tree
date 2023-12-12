//package team.flint.tree.kit.utils;
//
//import com.auth0.jwt.JWT;
//import team.flint.trunk.utils.HttpKit;
//import team.flint.trunk.utils.JwtKit;
//import okhttp3.*;
//
//import java.io.IOException;
//import java.util.Map;
//
///**
// * 接口测试
// */
//
//public class TestApi {
//
//    private static final OkHttpClient okHttpClient = new OkHttpClient();
//
//    private static String devUrl = "http://localhost:8080";
//
//    public static String getToken(Long userId) {
//        return JwtKit.buildToken(userId);
//    }
//
//    public static String post(String path, Long userId, String json) {
//
//        RequestBody requestBody = RequestBody.create(json, MediaType.parse("application/json; charset=utf-8"));
//        Request req = new Request.Builder()
//                .url(devUrl + path)
//                .header("token", getToken(userId))
//                .header("Accept-Language", "zh-CN")
//                .header("currency", "CNY")
//                .header("Content-Type", "application/json")
//                .post(requestBody)
//                .build();
//        String body = "";
//        try {
//            Response response = okHttpClient.newCall(req).execute();
//            body = response.body() != null ? response.body().string() : "";
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return body;
//
//
//    }
//}
