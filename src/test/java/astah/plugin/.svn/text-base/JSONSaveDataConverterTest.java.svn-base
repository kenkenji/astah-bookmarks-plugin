package astah.plugin;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JSONSaveDataConverterTest {

    @Test
    public void test() {
        List<BookmarkModel> models = new ArrayList<BookmarkModel>();
        {
            BookmarkModel model = new BookmarkModel("des1", "dia1", "pre1", new String[]{"classId11", "classId12"});
            models.add(model);
        }
        {
            BookmarkModel model = new BookmarkModel("des2", "dia2", "pre2", new String[]{"classId21", "classId22", "classId23"});
            models.add(model);
        }
        
        JSONSaveDataConverter converter = new JSONSaveDataConverter();
        String json = converter.convertToJSON(models);
        assertNotNull(json);
        List<BookmarkModel> reconvert = converter.convertToBookmarkModels(json);
        
        assertEquals( models.size(), reconvert.size());
        for (int i = 0; i<models.size(); i++) {
            assertEquals( models.get(i).getDescription(), reconvert.get(i).getDescription());
            assertEquals( models.get(i).getDiagramName(), reconvert.get(i).getDiagramName());
            assertEquals( models.get(i).getPresentationsName(), reconvert.get(i).getPresentationsName());
            assertEquals( models.get(i).getClassIdList().length, reconvert.get(i).getClassIdList().length);
            for (int j = 0 ; j < models.get(i).getClassIdList().length; j++){
                assertEquals( models.get(i).getClassIdList()[j], reconvert.get(i).getClassIdList()[j]);
                assertEquals( models.get(i).getClassIdList()[j], reconvert.get(i).getClassIdList()[j]);
            }
        }
    }

    @Test
    public void testOther() {
        JSONSaveDataConverter converter = new JSONSaveDataConverter();
        String json = "";
        List<BookmarkModel> reconvert = converter.convertToBookmarkModels(json);
        assertNotNull(reconvert);
        assertEquals(reconvert.size(), 0);
    }
}
