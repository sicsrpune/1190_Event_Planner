package winterwell.jtwitter;

import java.util.List;

import winterwell.jtwitter.Twitter.Status;

public interface Twitter {

	public interface Status {

		String getText();

		Object getUser();

		String getId();

		Object getCreatedAt();

	}

	List<Status> getFriendsTimeline();

	void setAPIRootUrl(String url);

}
