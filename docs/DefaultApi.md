# DefaultApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](DefaultApi.md#login) | **POST** /users/login.json | Login method for users.


<a name="login"></a>
# **login**
> UserViewModel login(user)

Login method for users.

Login microservice that allows users login to the app.

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
UserLoginApiForm user = new UserLoginApiForm(); // UserLoginApiForm | The user data to login
try {
    UserViewModel result = apiInstance.login(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**UserLoginApiForm**](UserLoginApiForm.md)| The user data to login | [optional]

### Return type

[**UserViewModel**](UserViewModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

