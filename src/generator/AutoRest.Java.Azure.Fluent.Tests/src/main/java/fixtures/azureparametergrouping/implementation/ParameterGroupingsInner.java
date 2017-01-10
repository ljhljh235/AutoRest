/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.azureparametergrouping.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGroupings.
 */
public final class ParameterGroupingsInner {
    /** The Retrofit service to perform REST calls. */
    private ParameterGroupingsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterGroupingTestServiceImpl client;

    /**
     * Initializes an instance of ParameterGroupingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ParameterGroupingsInner(Retrofit retrofit, AutoRestParameterGroupingTestServiceImpl client) {
        this.service = retrofit.create(ParameterGroupingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ParameterGroupings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ParameterGroupingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postRequired" })
        @POST("parameterGrouping/postRequired/{path}")
        Observable<Response<ResponseBody>> postRequired(@Path("path") String path, @Header("accept-language") String acceptLanguage, @Body int body, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postOptional" })
        @POST("parameterGrouping/postOptional")
        Observable<Response<ResponseBody>> postOptional(@Header("accept-language") String acceptLanguage, @Header("customHeader") String customHeader, @Query("query") Integer query, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postMultiParamGroups" })
        @POST("parameterGrouping/postMultipleParameterGroups")
        Observable<Response<ResponseBody>> postMultiParamGroups(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("header-two") String headerTwo, @Query("query-two") Integer queryTwo, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postSharedParameterGroupObject" })
        @POST("parameterGrouping/sharedParameterGroupObject")
        Observable<Response<ResponseBody>> postSharedParameterGroupObject(@Header("accept-language") String acceptLanguage, @Header("header-one") String headerOne, @Query("query-one") Integer queryOne, @Header("User-Agent") String userAgent);

    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     */
    public void postRequired(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        postRequiredWithServiceResponseAsync(parameterGroupingPostRequiredParameters).toBlocking().single().getBody();
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postRequiredWithServiceResponseAsync(parameterGroupingPostRequiredParameters), serviceCallback);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        return postRequiredWithServiceResponseAsync(parameterGroupingPostRequiredParameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postRequiredWithServiceResponseAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.body();
        String customHeader = parameterGroupingPostRequiredParameters.customHeader();
        Integer query = parameterGroupingPostRequiredParameters.query();
        String path = parameterGroupingPostRequiredParameters.path();
        return service.postRequired(path, this.client.acceptLanguage(), body, customHeader, query, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postRequiredDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     */
    public void postOptional() {
        postOptionalWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postOptionalAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postOptionalWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postOptionalAsync() {
        return postOptionalWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postOptionalWithServiceResponseAsync() {
        final ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters = null;
        String customHeader = null;
        Integer query = null;
        return service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postOptionalDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     */
    public void postOptional(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        postOptionalWithServiceResponseAsync(parameterGroupingPostOptionalParameters).toBlocking().single().getBody();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postOptionalWithServiceResponseAsync(parameterGroupingPostOptionalParameters), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        return postOptionalWithServiceResponseAsync(parameterGroupingPostOptionalParameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postOptionalWithServiceResponseAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.customHeader();
        }
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            query = parameterGroupingPostOptionalParameters.query();
        }
        return service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postOptionalDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     */
    public void postMultiParamGroups() {
        postMultiParamGroupsWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postMultiParamGroupsAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postMultiParamGroupsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postMultiParamGroupsAsync() {
        return postMultiParamGroupsWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postMultiParamGroupsWithServiceResponseAsync() {
        final FirstParameterGroupInner firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        String headerTwo = null;
        Integer queryTwo = null;
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postMultiParamGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     */
    public void postMultiParamGroups(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        postMultiParamGroupsWithServiceResponseAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).toBlocking().single().getBody();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postMultiParamGroupsWithServiceResponseAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        return postMultiParamGroupsWithServiceResponseAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postMultiParamGroupsWithServiceResponseAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        String headerTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.headerTwo();
        }
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.queryTwo();
        }
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postMultiParamGroupsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postMultiParamGroupsDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     */
    public void postSharedParameterGroupObject() {
        postSharedParameterGroupObjectWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postSharedParameterGroupObjectAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postSharedParameterGroupObjectWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postSharedParameterGroupObjectAsync() {
        return postSharedParameterGroupObjectWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postSharedParameterGroupObjectWithServiceResponseAsync() {
        final FirstParameterGroupInner firstParameterGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postSharedParameterGroupObjectDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     */
    public void postSharedParameterGroupObject(FirstParameterGroupInner firstParameterGroup) {
        postSharedParameterGroupObjectWithServiceResponseAsync(firstParameterGroup).toBlocking().single().getBody();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(postSharedParameterGroupObjectWithServiceResponseAsync(firstParameterGroup), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup) {
        return postSharedParameterGroupObjectWithServiceResponseAsync(firstParameterGroup).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> postSharedParameterGroupObjectWithServiceResponseAsync(FirstParameterGroupInner firstParameterGroup) {
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = postSharedParameterGroupObjectDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> postSharedParameterGroupObjectDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
