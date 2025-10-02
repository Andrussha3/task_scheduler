import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void testSimpleTaskMatches(){
        SimpleTask task = new SimpleTask(123, "Позвонить домой!");
        Assertions.assertTrue(task.matches("Позвонить"));
    }

    @Test
    public void testSimpleTaskNotMatches(){
        SimpleTask task = new SimpleTask(123, "Позвонить домой!");
        Assertions.assertFalse(task.matches("Написать"));
    }

    @Test
    public void testEpicMatches(){
        Epic task = new Epic(123, new String[] {"колбаса","сыр","молоко"});
        Assertions.assertTrue(task.matches("сыр"));
    }

    @Test
    public void testEpicNotMatches(){
        Epic task = new Epic(123, new String[] {"колбаса","сыр","молоко"});
        Assertions.assertFalse(task.matches("хлеб"));
    }

    @Test
    public void testMeetingTopicMatches(){
        Meeting task = new Meeting(123,"Утренний созвон","Новый проект","утро");
        Assertions.assertTrue((task.matches("созвон")));
    }

    @Test
    public void testMeetingProjectMatches(){
        Meeting task = new Meeting(123,"Утренний созвон","Новый проект","утро");
        Assertions.assertTrue((task.matches("проект")));
    }

    @Test
    public void testMeetingNotMatches(){
        Meeting task = new Meeting(123,"Утренний созвон","Новый проект","утро");
        Assertions.assertFalse((task.matches("утро")));
    }



}