import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;
import java.util.HashMap;
public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "25055033";
    public static final String API_KEY = "qoLLcNTphtvlmWfadUL8beG4";
    public static final String SECRET_KEY = "N2amjThoWGGSET2DKWMpiRiYmXuXFgFa";
    public static void main(String[] args) {
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
        //通用物品识别
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("baike_num", "5");
//        // 调用接口
//        String path = "F:\\Image\\waterlemon.jpg";
//        JSONObject res = client.advancedGeneral(path, options);
//        System.out.println(res.toString(2));
        // 动物识别
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num", "3");
        options.put("baike_num", "5");
        // 参数为本地路径
        String image = "D:\\软件构造\\百度图像识别SDK实验\\animal.jpg";
        JSONObject res = client.animalDetect(image, options);
        System.out.println(res.toString(2));
//        // 植物识别
//        // 传入可选参数调用接口
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("baike_num", "5");
//        // 参数为本地路径
//        String image = "D:\\软件构造\\百度图像识别SDK实验\\plant.jpg";
//        JSONObject res = client.plantDetect(image, options);
//        System.out.println(res.toString(2));
    }
}