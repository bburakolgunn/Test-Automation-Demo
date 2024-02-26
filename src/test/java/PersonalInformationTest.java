import org.junit.jupiter.api.Test;

public class PersonalInformationTest extends BaseTest {



    @Test
    public void setName(){
        practiceFormPage.setName("Burak");
    }

    @Test
    public void setLastName(){
        practiceFormPage.setLastName("Olgun");
    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("bburakolgunn@gmail.com");
    }

}
