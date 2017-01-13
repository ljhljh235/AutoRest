// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsLro
{
    using Azure;
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;

    /// <summary>
    /// LRORetrysOperations operations.
    /// </summary>
    public partial interface ILRORetrysOperations
    {
        /// <summary>
        /// Long running put request, service returns a 500, then a 201 to the
        /// initial request, with an entity that contains
        /// ProvisioningState=’Creating’.  Polls return this value until the
        /// last poll returns a ‘200’ with ProvisioningState=’Succeeded’
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="Microsoft.Rest.SerializationException">
        /// Thrown when unable to deserialize the response
        /// </exception>
        Task<AzureOperationResponse<ProductInner>> Put201CreatingSucceeded200WithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running put request, service returns a 500, then a 200 to the
        /// initial request, with an entity that contains
        /// ProvisioningState=’Creating’. Poll the endpoint indicated in the
        /// Azure-AsyncOperation header for operation status
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="Microsoft.Rest.SerializationException">
        /// Thrown when unable to deserialize the response
        /// </exception>
        Task<AzureOperationResponse<ProductInner,LRORetrysPutAsyncRelativeRetrySucceededHeadersInner>> PutAsyncRelativeRetrySucceededWithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running delete request, service returns a 500, then a  202 to
        /// the initial request, with an entity that contains
        /// ProvisioningState=’Accepted’.  Polls return this value until the
        /// last poll returns a ‘200’ with ProvisioningState=’Succeeded’
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="Microsoft.Rest.SerializationException">
        /// Thrown when unable to deserialize the response
        /// </exception>
        Task<AzureOperationResponse<ProductInner,LRORetrysDeleteProvisioning202Accepted200SucceededHeadersInner>> DeleteProvisioning202Accepted200SucceededWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running delete request, service returns a 500, then a 202 to
        /// the initial request. Polls return this value until the last poll
        /// returns a ‘200’ with ProvisioningState=’Succeeded’
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysDelete202Retry200HeadersInner>> Delete202Retry200WithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running delete request, service returns a 500, then a 202 to
        /// the initial request. Poll the endpoint indicated in the
        /// Azure-AsyncOperation header for operation status
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysDeleteAsyncRelativeRetrySucceededHeadersInner>> DeleteAsyncRelativeRetrySucceededWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running post request, service returns a 500, then a 202 to the
        /// initial request, with 'Location' and 'Retry-After' headers, Polls
        /// return a 200 with a response body after success
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysPost202Retry200HeadersInner>> Post202Retry200WithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running post request, service returns a 500, then a 202 to the
        /// initial request, with an entity that contains
        /// ProvisioningState=’Creating’. Poll the endpoint indicated in the
        /// Azure-AsyncOperation header for operation status
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysPostAsyncRelativeRetrySucceededHeadersInner>> PostAsyncRelativeRetrySucceededWithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running put request, service returns a 500, then a 201 to the
        /// initial request, with an entity that contains
        /// ProvisioningState=’Creating’.  Polls return this value until the
        /// last poll returns a ‘200’ with ProvisioningState=’Succeeded’
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="Microsoft.Rest.SerializationException">
        /// Thrown when unable to deserialize the response
        /// </exception>
        Task<AzureOperationResponse<ProductInner>> BeginPut201CreatingSucceeded200WithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running put request, service returns a 500, then a 200 to the
        /// initial request, with an entity that contains
        /// ProvisioningState=’Creating’. Poll the endpoint indicated in the
        /// Azure-AsyncOperation header for operation status
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="Microsoft.Rest.SerializationException">
        /// Thrown when unable to deserialize the response
        /// </exception>
        Task<AzureOperationResponse<ProductInner,LRORetrysPutAsyncRelativeRetrySucceededHeadersInner>> BeginPutAsyncRelativeRetrySucceededWithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running delete request, service returns a 500, then a  202 to
        /// the initial request, with an entity that contains
        /// ProvisioningState=’Accepted’.  Polls return this value until the
        /// last poll returns a ‘200’ with ProvisioningState=’Succeeded’
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        /// <exception cref="Microsoft.Rest.SerializationException">
        /// Thrown when unable to deserialize the response
        /// </exception>
        Task<AzureOperationResponse<ProductInner,LRORetrysDeleteProvisioning202Accepted200SucceededHeadersInner>> BeginDeleteProvisioning202Accepted200SucceededWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running delete request, service returns a 500, then a 202 to
        /// the initial request. Polls return this value until the last poll
        /// returns a ‘200’ with ProvisioningState=’Succeeded’
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysDelete202Retry200HeadersInner>> BeginDelete202Retry200WithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running delete request, service returns a 500, then a 202 to
        /// the initial request. Poll the endpoint indicated in the
        /// Azure-AsyncOperation header for operation status
        /// </summary>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysDeleteAsyncRelativeRetrySucceededHeadersInner>> BeginDeleteAsyncRelativeRetrySucceededWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running post request, service returns a 500, then a 202 to the
        /// initial request, with 'Location' and 'Retry-After' headers, Polls
        /// return a 200 with a response body after success
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysPost202Retry200HeadersInner>> BeginPost202Retry200WithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Long running post request, service returns a 500, then a 202 to the
        /// initial request, with an entity that contains
        /// ProvisioningState=’Creating’. Poll the endpoint indicated in the
        /// Azure-AsyncOperation header for operation status
        /// </summary>
        /// <param name='product'>
        /// Product to put
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        /// <exception cref="Microsoft.Rest.Azure.CloudException">
        /// Thrown when the operation returned an invalid status code
        /// </exception>
        Task<AzureOperationHeaderResponse<LRORetrysPostAsyncRelativeRetrySucceededHeadersInner>> BeginPostAsyncRelativeRetrySucceededWithHttpMessagesAsync(ProductInner product = default(ProductInner), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
    }
}

