package weibo4j.examples.trends;

import java.util.List;

import weibo4j.Trend;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.UserTrend;
import weibo4j.model.WeiboException;
import weibo4j.util.WeiboConfig;

public class GetTrends {

	public static void main(String[] args) {
        String access_token = WeiboConfig.getValue("access_token");
        String uid = "1653339385";
		Trend tm = new Trend(access_token);
		try {
			List<UserTrend> trends = tm.getTrends(uid);
            System.out.println(trends.size());
			for(UserTrend t : trends){

				//Log.logInfo(t.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
