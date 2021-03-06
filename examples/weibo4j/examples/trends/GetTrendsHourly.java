package weibo4j.examples.trends;

import java.util.List;

import weibo4j.Trend;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.Trends;
import weibo4j.model.WeiboException;
import weibo4j.util.WeiboConfig;

public class GetTrendsHourly {

	public static void main(String[] args) {
		String access_token =  WeiboConfig.getValue("access_token");
		Trend tm = new Trend(access_token);
		try {
			List<Trends> trends = tm.getTrendsHourly();
			for(Trends ts : trends){
				Log.logInfo(ts.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
