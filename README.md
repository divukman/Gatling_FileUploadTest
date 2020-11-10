# Gatling File Upload Test
Spring boot demo for uploading files + Gatling tests.

Main idea is to test max concurent users before application fails to serve the requests.



## Running the spring boot application
```
mvn spring-boot:run
```

## Running the test
```
performance/gatling-charts-highcharts-bundle-3.4.1/bin$ ./gatling.sh -s scanupload.UploadFileTest
```

