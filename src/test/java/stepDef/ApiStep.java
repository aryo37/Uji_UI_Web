package stepDef;

import io.cucumber.java.en.Given;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;

    public ApiStep(){
        this.apiPage = new ApiPage();
    }

    @Given("prepare url valid for get list data")
    public void prepareUrlValidForGetListData() {
        apiPage.prepareUrl();
    }
}
