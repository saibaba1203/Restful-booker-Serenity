package com.booker.restful.testbase;

import com.booker.restful.constants.Path;
import com.booker.restful.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public  static PropertyReader propertyReader;

    @BeforeClass
    public static void initialize(){
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
//        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.BOOKING;
    }
}
