// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.azurereport.implementation;

import com.azure.core.credentials.ServiceClientCredentials;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.implementation.annotation.ExpectedResponses;
import com.azure.core.implementation.annotation.Get;
import com.azure.core.implementation.annotation.HeaderParam;
import com.azure.core.implementation.annotation.Host;
import com.azure.core.implementation.annotation.QueryParam;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceClientBuilder;
import com.azure.core.implementation.annotation.ServiceInterface;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.azure.core.implementation.annotation.UnexpectedResponseExceptionType;
import com.microsoft.azure.v3.AzureEnvironment;
import com.microsoft.azure.v3.AzureProxy;
import com.microsoft.azure.v3.AzureServiceClient;
import fixtures.azurereport.ErrorException;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * A builder for creating a new instance of the AutoRestReportServiceForAzureImpl type.
 */
@ServiceClientBuilder(serviceClients = AutoRestReportServiceForAzureImpl.class)
public final class AutoRestReportServiceForAzureBuilder {
    /*
     * The preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the AutoRestReportServiceForAzureBuilder.
     */
    public AutoRestReportServiceForAzureBuilder acceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /*
     * The retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private Integer longRunningOperationRetryTimeout;

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the AutoRestReportServiceForAzureBuilder.
     */
    public AutoRestReportServiceForAzureBuilder longRunningOperationRetryTimeout(Integer longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /*
     * Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private Boolean generateClientRequestId;

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the AutoRestReportServiceForAzureBuilder.
     */
    public AutoRestReportServiceForAzureBuilder generateClientRequestId(Boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     *
     * @param environment the environment value.
     * @return the AutoRestReportServiceForAzureBuilder.
     */
    public AutoRestReportServiceForAzureBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AutoRestReportServiceForAzureBuilder.
     */
    public AutoRestReportServiceForAzureBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AutoRestReportServiceForAzureImpl with the provided parameters.
     *
     * @return an instance of AutoRestReportServiceForAzureImpl.
     */
    public AutoRestReportServiceForAzureImpl build() {
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        AutoRestReportServiceForAzureImpl client = new AutoRestReportServiceForAzureImpl(pipeline, environment);
        if (this.acceptLanguage != null) {
            client.setAcceptLanguage(this.acceptLanguage);
        } else {
            client.setAcceptLanguage("en-US");
        }
        if (this.longRunningOperationRetryTimeout != null) {
            client.setLongRunningOperationRetryTimeout(this.longRunningOperationRetryTimeout);
        } else {
            client.setLongRunningOperationRetryTimeout(30);
        }
        if (this.generateClientRequestId != null) {
            client.setGenerateClientRequestId(this.generateClientRequestId);
        } else {
            client.setGenerateClientRequestId(true);
        }
        return client;
    }
}