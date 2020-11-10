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

### Example 
```
Simulation scanupload.UploadFileTest started...

================================================================================
2020-11-10 15:12:29                                           0s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=1      KO=0     )
> Post document: upload the file                           (OK=1      KO=0     )

---- Upload Scan Scenario ------------------------------------------------------
[##########################################################################]100%
          waiting: 0      / active: 0      / done: 1     
================================================================================

Simulation scanupload.UploadFileTest completed in 0 seconds
Parsing log file(s)...
Parsing log file(s) done
Generating reports...

================================================================================
---- Global Information --------------------------------------------------------
> request count                                          1 (OK=1      KO=0     )
> min response time                                     17 (OK=17     KO=-     )
> max response time                                     17 (OK=17     KO=-     )
> mean response time                                    17 (OK=17     KO=-     )
> std deviation                                          0 (OK=0      KO=-     )
> response time 50th percentile                         17 (OK=17     KO=-     )
> response time 75th percentile                         17 (OK=17     KO=-     )
> response time 95th percentile                         17 (OK=17     KO=-     )
> response time 99th percentile                         17 (OK=17     KO=-     )
> mean requests/sec                                      1 (OK=1      KO=-     )
---- Response Time Distribution ------------------------------------------------
> t < 800 ms                                             1 (100%)
> 800 ms < t < 1200 ms                                   0 (  0%)
> t > 1200 ms                                            0 (  0%)
> failed                                                 0 (  0%)
================================================================================

Reports generated in 0s.
Please open the following file...
```
