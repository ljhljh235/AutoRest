/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report.implementation;

import fixtures.report.AutoRestReportService;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.report.models.ErrorException;
import java.io.IOException;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestReportService class.
 */
public final class AutoRestReportServiceImpl extends ServiceClient implements AutoRestReportService {
    /**
     * The Retrofit service to perform REST calls.
     */
    private AutoRestReportServiceService service;

    /**
     * Initializes an instance of AutoRestReportService client.
     */
    public AutoRestReportServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestReportServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestReportServiceImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestReportServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestReportServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        initializeService();
    }

    private void initializeService() {
        service = retrofit().create(AutoRestReportServiceService.class);
    }

    /**
     * The interface defining all the services for AutoRestReportService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestReportServiceService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.report.AutoRestReportService getReport" })
        @GET("report")
        Observable<Response<ResponseBody>> getReport();

    }

    /**
     * Get test coverage report.
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    public Map<String, Integer> getReport() {
        return getReportWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Map<String, Integer>> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) {
        return ServiceCall.fromResponse(getReportWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get test coverage report.
     *
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    public Observable<Map<String, Integer>> getReportAsync() {
        return getReportWithServiceResponseAsync().map(new Func1<ServiceResponse<Map<String, Integer>>, Map<String, Integer>>() {
            @Override
            public Map<String, Integer> call(ServiceResponse<Map<String, Integer>> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get test coverage report.
     *
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    public Observable<ServiceResponse<Map<String, Integer>>> getReportWithServiceResponseAsync() {
        return service.getReport()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Map<String, Integer>>>>() {
                @Override
                public Observable<ServiceResponse<Map<String, Integer>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Map<String, Integer>> clientResponse = getReportDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Map<String, Integer>> getReportDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.restClient().responseBuilderFactory().<Map<String, Integer>, ErrorException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Map<String, Integer>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
