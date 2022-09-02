import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

public class Sample2 {
    //设置APPID/AK/SK
    public static final String APP_ID = "25068316";
    public static final String API_KEY = "7aUa94uGBSiIGtpiXdq4x8B3";
    public static final String SECRET_KEY = "pk9ib7X9QGzsjh2sURlYk0MIp0ei44ta";

    public static void main(String[] args) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
//        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        // 身份证识别
        // 调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("detect_risk", "false");

        String idCardSide = "back";

        // 参数为本地图片路径
        String image = "D:\\qitawenjain\\tupian\\shenfenzheng.jpg";
        JSONObject res = client.idcard(image, idCardSide, options);
        System.out.println(res.toString(2));


//        // 车牌识别
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("multi_detect", "true");
//
//
//        // 参数为本地图片路径
//        String image = "D:\\qitawenjain\\tupian\\chepai.jpg";
//        JSONObject res = client.plateLicense(image, options);
//        System.out.println(res.toString(2));
    }
}