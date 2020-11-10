package scanupload

import io.gatling.core.Predef.{Simulation, _}
import io.gatling.http.Predef.{http, _}

class UploadFileTest extends Simulation {

  // Protocol definition
  val httpProtocol = http
    .baseUrl("http://localhost:8080") // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64; rv:78.0) Gecko/20100101 Firefox/78.0")


  // Upload tests
  object FileUpload {
    val uploadScanV3 = http("Post document: upload the file")
      .post("/upload")
      .header("Authorization", "Bearer :P")
      .header("device", "delta1234")
      .header("name", "measurement")
      .bodyPart(
        RawFileBodyPart("file", "BST.png")
        .fileName("BST.png")
        .transferEncoding("binary")).asMultipartForm
  }


  // Define the scenarios
  val scn = scenario("Upload Scan Scenario")
    .exec(FileUpload.uploadScanV3)


  // Run the scenarios
  setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))
}
