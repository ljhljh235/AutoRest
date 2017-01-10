/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import retrofit2.Retrofit;
import fixtures.azurespecials.ApiVersionDefaults;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionDefaults.
 */
public final class ApiVersionDefaultsImpl implements ApiVersionDefaults {
    /** The Retrofit service to perform REST calls. */
    private ApiVersionDefaultsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of ApiVersionDefaultsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionDefaultsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = retrofit.create(ApiVersionDefaultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionDefaults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionDefaultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getMethodGlobalValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        Observable<Response<ResponseBody>> getMethodGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getMethodGlobalNotProvidedValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        Observable<Response<ResponseBody>> getMethodGlobalNotProvidedValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getPathGlobalValid" })
        @GET("azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        Observable<Response<ResponseBody>> getPathGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getSwaggerGlobalValid" })
        @GET("azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        Observable<Response<ResponseBody>> getSwaggerGlobalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    public void getMethodGlobalValid() {
        getMethodGlobalValidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(getMethodGlobalValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getMethodGlobalValidAsync() {
        return getMethodGlobalValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getMethodGlobalValidWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getMethodGlobalValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getMethodGlobalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    public void getMethodGlobalNotProvidedValid() {
        getMethodGlobalNotProvidedValidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(getMethodGlobalNotProvidedValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getMethodGlobalNotProvidedValidAsync() {
        return getMethodGlobalNotProvidedValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getMethodGlobalNotProvidedValidWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalNotProvidedValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getMethodGlobalNotProvidedValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getMethodGlobalNotProvidedValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    public void getPathGlobalValid() {
        getPathGlobalValidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(getPathGlobalValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getPathGlobalValidAsync() {
        return getPathGlobalValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getPathGlobalValidWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getPathGlobalValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getPathGlobalValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getPathGlobalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     */
    public void getSwaggerGlobalValid() {
        getSwaggerGlobalValidWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(getSwaggerGlobalValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getSwaggerGlobalValidAsync() {
        return getSwaggerGlobalValidWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getSwaggerGlobalValidWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSwaggerGlobalValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getSwaggerGlobalValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getSwaggerGlobalValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
