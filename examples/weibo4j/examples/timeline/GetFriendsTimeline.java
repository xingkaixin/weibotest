package weibo4j.examples.timeline;

import weibo4j.Timeline;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.StatusWapper;
import weibo4j.model.User;
import weibo4j.model.WeiboException;
import weibo4j.util.WeiboConfig;

import java.util.ArrayList;
import java.util.List;

public class GetFriendsTimeline {

	public static void main(String[] args) {
		String access_token = WeiboConfig.getValue("access_token");
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getFriendsTimeline();
            List aa =  status.getStatuses();
            for(int i=0,size=aa.size();i<size;i++){
                Status bb = (Status) aa.get(i);
                User u = bb.getUser();
                System.out.println(u.getUserDomain()+"   "+bb.getText());

            }
//            System.out.println(status.getTotalNumber());
//            System.out.println(aa.size());
//			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}

	}

}
