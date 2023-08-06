import com.first_project.ActionPerformer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestActionPerformer {

    @Test
    void totalDishTest(){
        ActionPerformer ap = new ActionPerformer();
        int dishCount = ap.totalDishes(ap.totalSaturation(3));
        Assertions.assertEquals(6, dishCount);
    }
}
