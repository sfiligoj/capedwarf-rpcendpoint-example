package eu.novalike.capedwarf.endpointTest.service;

import java.util.Date;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;

import eu.novalike.capedwarf.endpointTest.model.TestData;

@Api(name = "testendpoint", version = "v1", description = "Test Endpoint API", scopes = {})
public class TestEndpoint {

	@ApiMethod(name = "data.get", path = "data", httpMethod = HttpMethod.GET)
	public TestData getTestData() {
		return new TestData("This is a string!", Double.valueOf(9.87654321D),
				Long.valueOf(1234567890L), Float.valueOf(0.123456789F),
				Integer.valueOf(1234567890), Boolean.valueOf(true), new Date());
	}

	@ApiMethod(name = "data.echo", path = "data/echo", httpMethod = HttpMethod.POST)
	public TestData echo(TestData testData) {
		return testData;
	}
}
