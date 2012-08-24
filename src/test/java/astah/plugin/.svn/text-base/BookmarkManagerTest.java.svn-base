package astah.plugin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BookmarkManagerTest {

    @Before
    public void testBefore() {
        BookmarkManager manager = BookmarkManager.getInstance();
        manager.removeAllBookmarkModels();
        manager.setAutoSave(false);
    }

    @Test
    public void testGetBookmarkModels() {
        BookmarkManager manager = BookmarkManager.getInstance();

        List<BookmarkModel> models = manager.getBookmarkModels();
        assertTrue((models instanceof List));
        assertEquals(models.size(), 0);
    }

    @Test
    public void testAddBookmarkModel() {
        BookmarkManager manager = BookmarkManager.getInstance();
        BookmarkModel bookmark1 = new BookmarkModel();
        BookmarkModel bookmark2 = new BookmarkModel();

        {
            manager.addBookmark(bookmark1);
            List<BookmarkModel> models = manager.getBookmarkModels();
            assertEquals(models.size(), 1);
            assertEquals(models.get(0), bookmark1);
        }

        {
            manager.addBookmark(bookmark2);
            List<BookmarkModel> models = manager.getBookmarkModels();
            assertEquals(models.size(), 2);
            assertEquals(models.get(0), bookmark1);
            assertEquals(models.get(1), bookmark2);
        }

        {
            manager.addBookmark(null);
            List<BookmarkModel> models = manager.getBookmarkModels();
            assertEquals(models.size(), 2);
        }

    }

    @Test
    public void testRemoveAllBookmarkModel() {
        BookmarkManager manager = BookmarkManager.getInstance();
        BookmarkModel bookmark1 = new BookmarkModel();
        BookmarkModel bookmark2 = new BookmarkModel();

        manager.addBookmark(bookmark1);
        manager.addBookmark(bookmark2);

        manager.removeAllBookmarkModels();
        List<BookmarkModel> models = manager.getBookmarkModels();
        assertNotNull(models);
        assertEquals(models.size(), 0);
    }

    @Test
    public void testRemoveBookmarkModel() {
        BookmarkManager manager = BookmarkManager.getInstance();

        BookmarkModel bookmark1 = new BookmarkModel();
        BookmarkModel bookmark2 = new BookmarkModel();
        BookmarkModel bookmark3 = new BookmarkModel();
        BookmarkModel bookmark4 = new BookmarkModel();

        manager.addBookmark(bookmark1);
        manager.addBookmark(bookmark2);
        manager.addBookmark(bookmark3);
        manager.addBookmark(bookmark4);

        {
            manager.removeBookmark(bookmark1);
            List<BookmarkModel> models = manager.getBookmarkModels();
            assertEquals(models.size(), 3);
            assertEquals(models.get(0), bookmark2);
            assertEquals(models.get(1), bookmark3);
            assertEquals(models.get(2), bookmark4);
        }

        {
            manager.removeBookmark(bookmark4);
            List<BookmarkModel> models = manager.getBookmarkModels();
            assertEquals(models.size(), 2);
            assertEquals(models.get(0), bookmark2);
            assertEquals(models.get(1), bookmark3);
        }

        {
            manager.removeBookmark(null);
            List<BookmarkModel> models = manager.getBookmarkModels();
            assertEquals(models.size(), 2);
            assertEquals(models.get(0), bookmark2);
            assertEquals(models.get(1), bookmark3);
        }
    }

    @Test
    public void testSwapBookmarkModel() {
        BookmarkManager manager = BookmarkManager.getInstance();

        BookmarkModel bookmark1 = new BookmarkModel();
        BookmarkModel bookmark2 = new BookmarkModel();
        BookmarkModel bookmark3 = new BookmarkModel();
        BookmarkModel bookmark4 = new BookmarkModel();

        manager.addBookmark(bookmark1);
        manager.addBookmark(bookmark2);
        manager.addBookmark(bookmark3);
        manager.addBookmark(bookmark4);

        manager.swapBookmark(bookmark1, true);
        assertEquals(manager.getBookmarkModels().get(0), bookmark2);
        assertEquals(manager.getBookmarkModels().get(1), bookmark1);
        assertEquals(manager.getBookmarkModels().get(2), bookmark3);
        assertEquals(manager.getBookmarkModels().get(3), bookmark4);

        manager.swapBookmark(bookmark1, true);
        assertEquals(manager.getBookmarkModels().get(0), bookmark2);
        assertEquals(manager.getBookmarkModels().get(1), bookmark3);
        assertEquals(manager.getBookmarkModels().get(2), bookmark1);
        assertEquals(manager.getBookmarkModels().get(3), bookmark4);

        manager.swapBookmark(bookmark1, true);
        assertEquals(manager.getBookmarkModels().get(0), bookmark2);
        assertEquals(manager.getBookmarkModels().get(1), bookmark3);
        assertEquals(manager.getBookmarkModels().get(2), bookmark4);
        assertEquals(manager.getBookmarkModels().get(3), bookmark1);

        manager.swapBookmark(bookmark1, true);
        assertEquals(manager.getBookmarkModels().get(0), bookmark2);
        assertEquals(manager.getBookmarkModels().get(1), bookmark3);
        assertEquals(manager.getBookmarkModels().get(2), bookmark4);
        assertEquals(manager.getBookmarkModels().get(3), bookmark1);

        manager.swapBookmark(bookmark1, false);
        assertEquals(manager.getBookmarkModels().get(0), bookmark2);
        assertEquals(manager.getBookmarkModels().get(1), bookmark3);
        assertEquals(manager.getBookmarkModels().get(2), bookmark1);
        assertEquals(manager.getBookmarkModels().get(3), bookmark4);

        manager.swapBookmark(bookmark2, false);
        assertEquals(manager.getBookmarkModels().get(0), bookmark2);
        assertEquals(manager.getBookmarkModels().get(1), bookmark3);
        assertEquals(manager.getBookmarkModels().get(2), bookmark1);
        assertEquals(manager.getBookmarkModels().get(3), bookmark4);

    }

    @Test
    public void testUpdateBookmarkModel() {
        BookmarkManager manager = BookmarkManager.getInstance();

        BookmarkModel bookmark1 = new BookmarkModel();
        BookmarkModel bookmark2 = new BookmarkModel();
        
        bookmark1.setDescription("des1");
        bookmark1.setDiagramName("dia1");
        bookmark1.setPresentationsName("pre1");
        bookmark1.setClassIdList(new String[]{"cId11", "cId12"});
        
        bookmark2.setDescription("des2");
        bookmark2.setDiagramName("dia2");
        bookmark2.setPresentationsName("pre2");
        bookmark2.setClassIdList(new String[]{"cId21", "cId22"});

        manager.addBookmark(bookmark1);
        manager.addBookmark(bookmark2);
        
        {
            manager.updateBookmark(bookmark1, null, null, null, null);
            assertEquals(bookmark1.getDescription(), "des1");
            assertEquals(bookmark1.getDiagramName(), "dia1");
            assertEquals(bookmark1.getPresentationsName(), "pre1");
            assertEquals(bookmark1.getClassIdList().length, 2);
            assertEquals(bookmark1.getClassIdList()[0], "cId11");
            assertEquals(bookmark1.getClassIdList()[1], "cId12");
    
            assertEquals(bookmark2.getDescription(), "des2");
            assertEquals(bookmark2.getDiagramName(), "dia2");
            assertEquals(bookmark2.getPresentationsName(), "pre2");
            assertEquals(bookmark2.getClassIdList().length, 2);
            assertEquals(bookmark2.getClassIdList()[0], "cId21");
            assertEquals(bookmark2.getClassIdList()[1], "cId22");
        }

        {
            manager.updateBookmark(bookmark1, "d1", "di1", null, null);
            assertEquals(bookmark1.getDescription(), "d1");
            assertEquals(bookmark1.getDiagramName(), "di1");
            assertEquals(bookmark1.getPresentationsName(), "pre1");
            assertEquals(bookmark1.getClassIdList().length, 2);
            assertEquals(bookmark1.getClassIdList()[0], "cId11");
            assertEquals(bookmark1.getClassIdList()[1], "cId12");
    
            assertEquals(bookmark2.getDescription(), "des2");
            assertEquals(bookmark2.getDiagramName(), "dia2");
            assertEquals(bookmark2.getPresentationsName(), "pre2");
            assertEquals(bookmark2.getClassIdList().length, 2);
            assertEquals(bookmark2.getClassIdList()[0], "cId21");
            assertEquals(bookmark2.getClassIdList()[1], "cId22");
        }

        {
            manager.updateBookmark(bookmark2, null, null, "p2", new String[]{"c21"});
            assertEquals(bookmark1.getDescription(), "d1");
            assertEquals(bookmark1.getDiagramName(), "di1");
            assertEquals(bookmark1.getPresentationsName(), "pre1");
            assertEquals(bookmark1.getClassIdList().length, 2);
            assertEquals(bookmark1.getClassIdList()[0], "cId11");
            assertEquals(bookmark1.getClassIdList()[1], "cId12");
    
            assertEquals(bookmark2.getDescription(), "des2");
            assertEquals(bookmark2.getDiagramName(), "dia2");
            assertEquals(bookmark2.getPresentationsName(), "p2");
            assertEquals(bookmark2.getClassIdList().length, 1);
            assertEquals(bookmark2.getClassIdList()[0], "c21");
        }
    }
}
