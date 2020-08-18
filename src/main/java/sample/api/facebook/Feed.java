package sample.api.facebook;

import java.util.List;

public class Feed {

	private List<Post> data;

	public Feed() {
	}

	public List<Post> getData() {
		return data;
	}

	public void setData(List<Post> data) {
		this.data = data;
	}
}
