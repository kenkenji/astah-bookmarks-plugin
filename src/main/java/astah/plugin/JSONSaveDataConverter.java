package astah.plugin;

import java.util.ArrayList;
import java.util.List;

import net.arnx.jsonic.JSON;

public class JSONSaveDataConverter {

	public String convertToJSON(List<BookmarkModel> models) {
		return JSON.encode(models.toArray(new BookmarkModel[0]));
	}

	public List<BookmarkModel> convertToBookmarkModels(String json) {
		BookmarkModel[] modelList = JSON.decode(json, BookmarkModel[].class);
		List<BookmarkModel> ret = new ArrayList<BookmarkModel>();
		if (modelList != null) {
    		for (int i = 0; i < modelList.length; i++){
    		    ret.add(modelList[i]);
    		}
		}
		return ret;
	}

}
